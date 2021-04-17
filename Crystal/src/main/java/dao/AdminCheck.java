package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


import model.TeamAdmin;
import utility.DBConn;

public class AdminCheck {
	Connection conn;
	public AdminCheck() throws Exception{
		 conn = DBConn.getMySQLConnection();
	}
	
	public TeamAdmin checkCredential(TeamAdmin sysUser ) throws SQLException
	{
		PreparedStatement psmt = conn.prepareStatement("select * from admintable where username=? and apassword=?");
		psmt.setString(1,sysUser.getUsername());
		psmt.setString(2,sysUser.getPassword());
		ResultSet rs = psmt.executeQuery();
		if(rs.next()) {
			sysUser.setFirstname(rs.getString(2));
		}
		else
		{
			sysUser=null;
		}
		return sysUser;
	}

}
