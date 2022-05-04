package com.revature.pixott.handler;

import com.revature.pixott.app.App;


import com.revature.pixott.dao.WishlistDao;
import com.revature.pixott.model.Movie;


public class WishlistHandler {
	public static void addMovies() {
		
		System.out.println("Enter Movie Id To Add Into WishList:");
		int id= App.scanner.nextInt();
		
        WishlistDao dao =new WishlistDao();
		
		Movie movies =dao.AddToWishlist(id);
		if(id<73){
			dao.AddtoWishlist(id);
			
			
		}
		else {
			System.out.println("Invalid mobile or password");
		}
		
	}
	

}
