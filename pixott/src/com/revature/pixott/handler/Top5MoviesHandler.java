package com.revature.pixott.handler;

import java.util.List;

import com.revature.pixott.app.App;
import com.revature.pixott.dao.MovieDao;
import com.revature.pixott.dao.Top5MoviesDao;
import com.revature.pixott.handler.UserMenu;
import com.revature.pixott.model.Top5Movies;


public class Top5MoviesHandler {
	public static void display(){
    Top5MoviesDao mov = new Top5MoviesDao();
		
		List<Top5Movies> top5movies = mov.findAll();
		System.out.println("------");
		System.out.println("Top 5 Movies");
		System.out.println("------");
		System.out.println();
		System.out.printf("%4s %-40s\n", "Id", "MovieName");
		System.out.printf("%4s %-40s\n", "--", "---------");
		  
		
		
		top5movies.forEach(e->System.out.println(e));
		System.out.println();
		
		System.out.println("Select a movie(Enter Id): ");
		int option = App.scanner.nextInt();
		if (option == 1) {
				
		}
		
		UserMenu.menuDisplay();
	}
	public static void watchMovie() {
		System.out.println("watching Movie...");
	}
	

}
