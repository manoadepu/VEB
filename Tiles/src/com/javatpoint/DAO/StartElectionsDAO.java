package com.javatpoint.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.javatpoint.Beans.MySQL;

public class StartElectionsDAO {
	String result="adminActionsError";
	@SuppressWarnings("finally")
	public String startElectionProcess(){
		try {
			System.out.println("In Start Elections DAO");
			ApplicationContext context =
			    	  new ClassPathXmlApplicationContext(new String[] {"applicationContext.xml"});
			System.out.println("wait");
			MySQL mySQL = (MySQL)context.getBean("mySQL");
			Class.forName(mySQL.getClassName()).newInstance();
			Connection conn = DriverManager.getConnection(mySQL.getUrl(), mySQL.getUserName(), mySQL.getPassowrd());
			Statement sta = conn.createStatement();
			String Sql = "update admins set process='start' where username='admin'";
			sta.executeUpdate(Sql);
			result = "adminActions";
		} catch (Exception e) {
			result = "adminActionsError";
		}
		finally {
			return result;
		}
	}
}
