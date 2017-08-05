package com.javatpoint.Beans;

public class User {
	String User;

	public String getUser() {
		return User;
	}

	public void setUser(String user) {
		User = user;
	}

	@Override
	public String toString() {
		return "User [User=" + User + "]";
	}
	
}
