package com.revature.pixott.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.revature.pixott.model.Movie;



public class MovieDao {
	public List<Movie> findAll() {
		String sql = "select * from movie";
		List<Movie> movies = new ArrayList<>();
		try (
			Connection connection = Util.getConnection();
			PreparedStatement stmt = connection.prepareStatement(sql);
		) {
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				Movie movie = new Movie();
				movie.setId(rs.getInt("id"));
				movie.setMovieName(rs.getString("movieName"));
				movies.add(movie);
			}
		} catch (SQLException e) {
			Util.displayMessage(e);
		}
		return movies;

     }
}
