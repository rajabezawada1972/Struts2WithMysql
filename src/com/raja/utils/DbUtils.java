package com.raja.utils;

import java.sql.DriverManager;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.raja.controller.RegisterAction;

public class DbUtils {
	
	public static Connection conn() throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		return (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/raja", "root", "raja");
	}

	public static int insert(RegisterAction ra) {
		int flag = 0;
		try {
			PreparedStatement ps = (PreparedStatement) conn().prepareStatement("INSERT INTO employee_db VALUES(?,?,?,?)");
			ps.setInt(1, ra.getId());
			ps.setString(2, ra.getName());
			ps.setString(3, ra.getEmail());
			ps.setString(4, ra.getCity());
			flag = ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return flag;
	}

}
