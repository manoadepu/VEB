package com.javatpoint.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.javatpoint.Beans.AdminLoginBean;
import com.javatpoint.Beans.MySQL;

public class AdminLoginDAO {
	public String adminLoginVerification(AdminLoginBean adminLoginBean) {
		String result = "adminError";
		try {
			ApplicationContext context =
			    	  new ClassPathXmlApplicationContext(new String[] {"applicationContext.xml"});
			System.out.println("wait");
			MySQL mySQL = (MySQL)context.getBean("mySQL");
			Class.forName(mySQL.getClassName()).newInstance();
			Connection conn = DriverManager.getConnection(mySQL.getUrl(), mySQL.getUserName(), mySQL.getPassowrd());
			Statement sta = conn.createStatement();
			String Sql = "select * from admins";
			ResultSet rs = sta.executeQuery(Sql);
			while (rs.next()) {
				System.out.println("username"+ rs.getString("username"));
				System.out.println("password: "+ rs.getString("password"));
				Boolean one = rs.getString("username").equals(adminLoginBean.getUsername());
				System.out.println("username: "+ one);
				Boolean two = rs.getString("password").equals(adminLoginBean.getPassword());
				System.out.println("password: "+ rs.getString("password").equals(adminLoginBean.getPassword()));
				if(rs.getString("username").equals(adminLoginBean.getUsername()) && rs.getString("password").equals(adminLoginBean.getPassword()))
				{
					result="adminActions";
				}
			}
			
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return result;
	}
}
