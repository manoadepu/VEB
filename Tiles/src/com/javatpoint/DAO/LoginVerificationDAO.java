package com.javatpoint.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.javatpoint.Beans.LoginBean;
import com.javatpoint.Beans.MySQL;

public class LoginVerificationDAO {
	
	/*@Autowired
	MySQL mySQL;*/
	
	public String verifyLogin(LoginBean loginDetails) {
		String result="";
		try {
			System.out.println("In Start Elections DAO");
			ApplicationContext context =
			    	  new ClassPathXmlApplicationContext(new String[] {"applicationContext.xml"});
			MySQL mySQL = (MySQL)context.getBean("mySQL");
			Class.forName(mySQL.getClassName()).newInstance();
			Connection conn = DriverManager.getConnection(mySQL.getUrl(), mySQL.getUserName(), mySQL.getPassowrd());
			Statement sta = conn.createStatement();
			String Sql = "select * from voters";
			ResultSet rs = sta.executeQuery(Sql);
			while(rs.next()){
				if(rs.getString("validation_number").equals(loginDetails.getValidationNumber()) && rs.getString("password").equals(loginDetails.getPassword())){
					result = "contact";
				}
			}
		} catch (Exception e) {
			result = "contact";
		}
		finally {
			return result;
		}}
}
