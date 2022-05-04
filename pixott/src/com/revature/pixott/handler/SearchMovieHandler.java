 package com.revature.pixott.handler;


import com.revature.pixott.app.App;
import com.revature.pixott.dao.SearchMovieDao;

public class SearchMovieHandler {
	public static void searchMovie() {
		System.out.println("----------");
		System.out.println("Search Movie");
		System.out.println("----------");
		System.out.println("Enter MovieName/Keyword:");
		String movieName= App.scanner.next();
		
		SearchMovieDao.getMovie(movieName);
		System.out.print(SearchMovieDao.movId+")");
		System.out.print(" "+SearchMovieDao.movName);
		System.out.println();
		System.out.println("----------------------");
		System.out.println("1)Watch Movie");
		System.out.println("2)Add To wishlist");
		System.out.println("3) Menu");
		System.out.println("Enter option: ");
		int option = App.scanner.nextInt();
		if (option == 1) {
			watchMovie();	
		}
		
		else if (option == 2) {
				
		}
		else if (option==3){
			UserMenu.menuDisplay();
		}
		
		
	}
	public static void watchMovie() {
		System.out.println("Watching Movie.....");
		
		
	}

}
