package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import model.TeamAdmin;
import utility.DBConn;

public class RegisterAdminDAO {
	Connection conn;
	public RegisterAdminDAO() throws Exception {
		conn = DBConn.getMySQLConnection();
	}
	public boolean registerMember(TeamAdmin newMember) throws SQLException{
		String query = "insert into admintable(firstname,lastname,username,apassword,gender,email,mobile,adress) values(?,?,?,?,?,?,?,?);";
		PreparedStatement psmt = conn.prepareStatement(query);
		psmt.setString(1, newMember.getFirstname());
		psmt.setString(2, newMember.getLastname());
		psmt.setString(3, newMember.getUsername());
		psmt.setString(4, newMember.getPassword());
		psmt.setString(5, newMember.getGender());
		psmt.setString(6, newMember.getEmail());
		psmt.setString(7, newMember.getMobile());
		psmt.setString(8, newMember.getAddress());
		
		int row_eff = psmt.executeUpdate();
		if(row_eff>0) {
			return true;
		}
		else {
			return false;
		}
		
		
	}

}
