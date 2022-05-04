package com.revature.pixott.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.revature.pixott.model.Movie;



public class WishlistDao {
	public Movie AddToWishlist(int id ) {
		
		String sql="insert into wishlist(wishlistMovies) values(?);";
		Movie movie=new Movie();
		try (
				Connection connection = Util.getConnection();
				PreparedStatement stmt = connection.prepareStatement(sql);
			) {
			  stmt.setInt(1,id);
			  stmt.executeUpdate();
			 
			} catch (SQLException e) {
				Util.displayMessage(e);
			}
		return movie;
		
		
		
	}
	/*public List<Movielist> wishlist(int id){
		String sql = "insert into wishlist (wishlist) values (?);";
		List<Movielist> list = new ArrayList<>();
		try(
				Connection connection = Util.getConnection();
				PreparedStatement stmt = connection.prepareStatement(sql);
				){
			           stmt.setInt(1, id);
	                 stmt.executeUpdate();
	}catch(SQLException e) {
		Util.displayMessage(e);
	}
		return list;*/
	
	

}
