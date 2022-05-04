package com.revature.pixott.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.revature.pixott.model.UserDetails;




public class UserDao {
	
	public void signup(UserDetails userdetails) 
	{
		String sql ="insert into userdetails(name,mobileNumber,password) values(?,?,?)";
		try(
		    Connection conn=Util.getConnection();
			PreparedStatement stmt=conn.prepareStatement(sql);
		){
			System.out.println("connected succesfully.");
			stmt.setString(1, userdetails.getName());
			stmt.setString(2, userdetails.getMobileNumber());
			stmt.setString(3, userdetails.getPassword());
			stmt.executeUpdate();
		}catch(SQLException e) {
				System.out.println(e.getMessage());
			}
		}
	
	public UserDetails getUserDetails(String name) {
		String sql="select * from UserDetails where name=?";
		
		try(
			    Connection conn=Util.getConnection();
				PreparedStatement stmt=conn.prepareStatement(sql);
			)
		{
			System.out.println("connection successfull");
			stmt.setString(1, name);
			ResultSet rs = stmt.executeQuery();
			
			if(rs.next()) {
			   UserDetails userdetails = new UserDetails();
			   
			   userdetails.setId(rs.getInt("id"));
			   userdetails.setName(rs.getString("name"));
			   userdetails.setMobileNumber(rs.getString("mobileNumber"));
			   userdetails.setPassword(rs.getString("password"));
			   
			   return userdetails;
				
	
			}
		}
		
		catch(SQLException e) 
		{
			System.out.println(e.getMessage());
		}
		
		return null;
		
		
		
	}
			
	//public static void main(String args[]) {
	//	UserDao dao =new UserDao();
	//	UserDetails userdetails =new UserDetails();
	//	userdetails.setName("john");
	//	userdetails.setMobileNumber("9874563212");
	//	userdetails.setPassword("password43");
	//	dao.signup(userdetails);
	//}

}
