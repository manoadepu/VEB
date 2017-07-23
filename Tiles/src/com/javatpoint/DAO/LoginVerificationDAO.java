package com.javatpoint.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.javatpoint.Beans.LoginBean;
import com.javatpoint.Beans.MySQL;

public class LoginVerificationDAO {
	
	/*@Autowired
	MySQL mySQL;*/
	
	public String verifyLogin(LoginBean loginDetails) {
		try {
			ApplicationContext context =
			    	  new ClassPathXmlApplicationContext(new String[] {"applicationContext.xml"});
			System.out.println("wait");
			MySQL mySQL = (MySQL)context.getBean("mySQL");
			Class.forName(mySQL.getClassName()).newInstance();
			Connection conn = DriverManager.getConnection(mySQL.getUrl(), mySQL.getUserName(), mySQL.getPassowrd());
			Statement sta = conn.createStatement();
			String Sql = "select * from city";
			ResultSet rs = sta.executeQuery(Sql);
			while (rs.next()) {
				System.out.println(rs.getString("Name"));
				}
			
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
}
