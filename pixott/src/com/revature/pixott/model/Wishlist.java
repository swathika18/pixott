package com.revature.pixott.model;

public class Wishlist {
	private int wishlistId;
	private int wishlistMovies;
	public Wishlist()
	{
		
	}
	public Wishlist(int wishlistId, int wishlistMovies) {
		super();
		this.wishlistId = wishlistId;
		this.wishlistMovies = wishlistMovies;
	}
	public int getId() {
		return wishlistId;
	}
	public void setId(int wishlistId) {
		this.wishlistId = wishlistId;
	}
	public int getWishlistMovies() {
		return wishlistMovies;
	}
	public void setWishlistMovies(int wishlistMovies) {
		this.wishlistMovies = wishlistMovies;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + wishlistId;
		result = prime * result + wishlistMovies;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Wishlist other = (Wishlist) obj;
		if (wishlistId != other.wishlistId)
			return false;
		if (wishlistMovies != other.wishlistMovies)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return String.format("%s" ,wishlistMovies);
	}
	
	
}
