  
/**
 * @Author: Team 77 (Manuel Moreno, Vy Nguyen, Musen Wen)
 * Date: 04/10/2020
 * Class: MCIT Spring 2020
 */

public class Movie {
	private String movieTitle; 
	private double movieRating;
	private String genre;
	private int movieYear;
	private String director;
	private String actors;
	/**
	 * 
	 * @param movieTitle
	 * @param movieRating
	 * @param genre
	 * @param movieYear
	 * @param director
	 * @param actors
	 * 
	 * Movie class has a constructor which defines movieTitle, movieRating, genre, movieYear, director, and actors.
	 * We also created getter functions to return each parameter.
	 */
	public Movie(String movieTitle, double movieRating, String genre, int movieYear,
			String director, String actors) {
		this.movieTitle = movieTitle;
		this.movieRating = movieRating;
		this.genre = genre; 
		this.movieYear = movieYear;
		this.director = director;
		this.actors = actors;
	}

	public String getMovieTitle() {
		return movieTitle;
	}

	public double getMovieRating() {
		return movieRating;
	}

	public String getGenre() {
		return genre;
	}

	public int getMovieYear() {
		return movieYear;
	}

	public String getDirector() {
		return director;
	}

	public String getActors() {
		return actors;
	}
	
	
}
