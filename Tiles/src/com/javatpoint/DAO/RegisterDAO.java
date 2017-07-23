package com.javatpoint.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.javatpoint.Beans.MySQL;
import com.javatpoint.Beans.RegisterBean;

public class RegisterDAO {
	public String registerVoter(RegisterBean registerBean) {
		try {
			ApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "applicationContext.xml" });
			MySQL mySQL = (MySQL) context.getBean("mySQL");
			Class.forName(mySQL.getClassName()).newInstance();
			Connection conn = DriverManager.getConnection(mySQL.getUrl(), mySQL.getUserName(), mySQL.getPassowrd());
			Statement sta = conn.createStatement();
			System.out.println("From RegisterDAO: " + registerBean.toString());
			
			//Verify the details entered by the user
			
			//If the details entered by user are authentic then save the entered details in the voters table
			String Sql = "INSERT INTO voters ( voter_id, validation_number,first_name,middle_name,last_name,ssn,dob,qid,answer ) VALUES ( NULL,1322213,'"+ registerBean.getFirstname()+"','"+registerBean.getMiddlename()+"','"+registerBean.getLastname()+"','"+registerBean.getSsn()+"','"+registerBean.getDob()+"','"+registerBean.getQuestion()+"','"+registerBean.getAnswer()+"')";
			sta.executeUpdate(Sql);
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
}
