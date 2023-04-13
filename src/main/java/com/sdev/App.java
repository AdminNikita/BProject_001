package com.sdev;

import java.util.ResourceBundle;

public class App {

	public int userLogin(String in_username, String in_pwd)
	{
		ResourceBundle rb = ResourceBundle.getBundle("config");
		String username = rb.getString("username");
		String pwd = rb.getString("password");

		if(in_username.equals(username)&& in_pwd.equals(pwd))
			return 1;
		else
			return 0;
	}
}
