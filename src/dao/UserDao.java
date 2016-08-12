package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import db.DbUtil;

public class UserDao {
	
	DbUtil db =new DbUtil();
	public Boolean loginRequest(String username,String password){
        Connection conn=db.getConnection();
        String sql="select password from user where username=? ";
        PreparedStatement ptmt=null;
	try {
		ptmt = conn.prepareStatement(sql);
	} catch (SQLException e) {
		System.out.println("Î´Öª´íÎó");
	}
	String ps=null;
        try {
			ptmt.setString(1, username);
			ResultSet rs=  ptmt.executeQuery();
			while(rs.next()){
				ps=rs.getString("password");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
        System.out.println("");
        if (password.equals(ps)){
        	return true;
        }	
        else return false;
}
	
}
