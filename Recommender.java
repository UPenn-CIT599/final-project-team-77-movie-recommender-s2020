  
/**
 * @Author: Team 77 (Manuel Moreno, Vy Nguyen, Musen Wen)
 * Date: 04/10/2020
 * Class: MCIT Spring 2020
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

public class Recommender {
	/**
	*This class Recommender has a function called the Compare Input function, which receives inputs from the user.
	*After the input is received, we created a Hashmap to receive a list of movie from the movie_metadata.csv file, which contains more than 80,000 movies.
	*Then, we created an empty ArrayList called finalRecommendations to store a specific list of movie that meets criterias.
	*To check the criterias, we created if functions with the condition of specific genre, actor, director, movie rating, and year range.
	*This class Recommender also has another function called RandomPull, which receives 2 parameters (int numberOfMovies, ArrayList<Movie> movieArray) and returns an Arraylist.
	*In the RandomPull function, it shuffles the movie list. 
	*After shuffling, we ensured that the arraylist contains sufficient number of movies that the user wants. If not, the maximum number of movies that met the criteria will be the movie array size.
	*At the end, we returned an arraylist randomFinalMovies that met the criterias. 
	*/
	public ArrayList<Movie> CompareInput(String genre, int year, double rating, String actors, String director) {
		int counter = 1;
		MovieReader mr = new MovieReader();
		HashMap<Integer, Movie> movieData = mr.MovieReader("movie_metadata.csv");
		ArrayList<Movie> finalRecommendations = new ArrayList<Movie>();
		for(int i = 1; i < movieData.size(); i++) {
			//Ensuring genre, rating and (actor or director) criteria is met - if it is empty it stores all
			if((movieData.get(i).getGenre().contains(genre) || genre.contains("0")) && 
					(movieData.get(i).getActors().contains(actors) || actors.contains("0")) ||
					(movieData.get(i).getDirector().contains(director) || director.contains("0")) && 
					(movieData.get(i).getMovieRating() <= rating && !(rating < 10 && rating > 0))) 
			{
				//Ensuring the year range is respected
				if(year == 1 && movieData.get(i).getMovieYear() < 1930) {
					finalRecommendations.add(movieData.get(i));
				}
				else if(year == 2 &&  1929 < movieData.get(i).getMovieYear() && movieData.get(i).getMovieYear() < 1960) {
					finalRecommendations.add(movieData.get(i));
				}
				else if(year == 3 &&  1959 < movieData.get(i).getMovieYear() && movieData.get(i).getMovieYear() < 1980) {
					finalRecommendations.add(movieData.get(i));
				}
				else if(year == 4 &&  1979 < movieData.get(i).getMovieYear() && movieData.get(i).getMovieYear() < 2000) {
					finalRecommendations.add(movieData.get(i));
				}
				else if(year == 5 &&  1999 < movieData.get(i).getMovieYear() && movieData.get(i).getMovieYear() < 2020) {
					finalRecommendations.add(movieData.get(i));
				}
				else if(!(year < 5 && year > 0)){
					System.out.println("Invalid input");
					
				}
				
			}
			
			
			
		}
		return finalRecommendations;
	}
	
	public ArrayList<Movie> RandomPull(int numberOfMovies, ArrayList<Movie> movieArray) {
		ArrayList<Movie> movies = movieArray;
		ArrayList<Movie> randomFinalMovies = new ArrayList<Movie>();
        Collections.shuffle(movies);
        //Ensuring that there is no out of bounds if the user wants more movies than the array has 
        if(numberOfMovies > movies.size()) {
		System.out.println("Sorry, we only have " + movies.size() +" movies that met your criterias.");
        	numberOfMovies = movies.size();
        }
        //Pulling the number of movies the user wants
        for(int i = 0; i < numberOfMovies; i++) {
        	randomFinalMovies.add(movies.get(i));
        }
		return randomFinalMovies;
	}
}
