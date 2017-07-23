package com.javatpoint.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.eclipse.jdt.internal.compiler.ast.WhileStatement;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.javatpoint.Beans.AddParty;
import com.javatpoint.Beans.MySQL;

public class AddPartyDAO {
	public String addPartyAndCandidate(AddParty addParty) {
		String result = "failure";
		int partyId;
		Boolean partyname = true;
		
		try {
			
			System.out.println("add party object data from AddPartyDAO: " + addParty.toString());
			result="success";
			ApplicationContext context =
			    	  new ClassPathXmlApplicationContext(new String[] {"applicationContext.xml"});
			MySQL mySQL = (MySQL)context.getBean("mySQL");
			Class.forName(mySQL.getClassName()).newInstance();
			Connection conn = DriverManager.getConnection(mySQL.getUrl(), mySQL.getUserName(), mySQL.getPassowrd());
			Statement sta = conn.createStatement();
			Statement sta1 = conn.createStatement();
			Statement sta2 = conn.createStatement();
			Statement sta3 = conn.createStatement();
			Statement sta4 = conn.createStatement();
			Statement sta5 = conn.createStatement();
			
			String Sql = "select * from parties";
			ResultSet rs = sta.executeQuery(Sql);
			
			while (rs.next()) {
				//If the party is already present in database we only add the candidate name in candidates table.
				if(rs.getString("party_name").equals(addParty.getParty())){
					int num=0;
					partyId = rs.getInt("party_id");
					//inserting candidate with party id as foreign key in candidates table.
					
					String sql = "select candidate_name from candidates where party_id="+partyId;
					ResultSet rs2 = sta4.executeQuery(sql);
					int i=1;
					
					String CandidateName= "NotPresent";
					
					while(rs2.next()){
						if(rs2.getString("candidate_name").equals(addParty.getCandidateName())) {
							CandidateName = "present";
						}
						i++;
					}
					if(CandidateName=="NotPresent"){
						String InsertCandidate = "Insert into candidates (party_id,candidate_name) values("+rs.getInt("party_id")+",'"+addParty.getCandidateName()+"')";
						sta2.executeUpdate(InsertCandidate);
						result = "Party already exists, candidate added succesfully!";
						}
					partyname=false;
				}
					}
			
			//If party is not present, we add the party and get its party_id and use this as a foreign key and add the candidate name in candidates table.
			if(partyname) {
				String sql = "Insert into Parties (party_id,party_name) values(NULL,'"+addParty.getParty()+"')";
				sta1.executeUpdate(sql);
				//TODO: check addParty.getCandidateName()
					//1) If not null retrieve the party id of the party inserted in the above query and insert the candidate 
					//name in the candidate table with the retrieved party id and send message "Party and Candidate added successfully".
					//2) else do not do any operation and send message "Party added successfully"
			
				if(addParty.getCandidateName()!=null){
					String sql_partyId = "select * from parties";
					rs = sta.executeQuery(sql_partyId);
					while(rs.next()){
						if(rs.getString("party_name").equals(addParty.getParty())){
							String InsertCandidateName = "insert into candidates (party_id, candidate_name) values("+rs.getString("party_id")+",'"+addParty.getCandidateName()+"')";
							sta3.executeUpdate(InsertCandidateName);
						}
					}
				}
			}
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			}
		return result;
	}
}
