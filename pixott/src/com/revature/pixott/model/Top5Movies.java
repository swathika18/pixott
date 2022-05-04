package com.revature.pixott.model;

public class Top5Movies {
	private int id;
	private String movieName;
	public Top5Movies() {
		
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((movieName == null) ? 0 : movieName.hashCode());
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
		Top5Movies other = (Top5Movies) obj;
		if (id != other.id)
			return false;
		if (movieName == null) {
			if (other.movieName != null)
				return false;
		} else if (!movieName.equals(other.movieName))
			return false;
		return true;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getMovieName() {
		return movieName;
	}


	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}


	public Top5Movies(int id, String movieName) {
		super();
		this.id = id;
		this.movieName = movieName;
	}


	@Override
	public String toString() {
		return String.format("%4d %-40s", id,movieName);
	}
	
	
}
