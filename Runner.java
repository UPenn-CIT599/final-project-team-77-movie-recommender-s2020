/**
 * @Author: Team 77 (Manuel Moreno, Vy Nguyen, Musen Wen)
 * Date: 04/10/2020
 * Class: MCIT Spring 2020
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Runner {
	public static void main(String[] args) {
		/** 
		 * This is the main method of the Movie Recommender program.
		 * In this method, we prompt the users for inputs such as genre, year, rating, actors, director, and number of movie recommendations.
		 * Based on the inputs, we call the Compare Input function from the Recommender Class to receive an array of suitable movies.
		 * After generating a list of suitable movies, we call the RandomPull function to return a random top 5 movies from the suitable movie list. 
		 * At the end, we print a list of 5 movie recommendations to the user. 
		 */
		//Intro text and questions. We want inputs from users, specifically genre, year, rating, actors, director, and number of movie recommendations.
		System.out.println("Hello! Welcome to our Movie Recommendation System. \nWe have over 80,000 movies waiting for you. "
				+ "\n\nPlease answer the following questions so that we may customize our recommendations.");
		Scanner userInputScanner = new Scanner(System.in);
		//Question 1: Genre
		System.out.println("Which genre do you prefer? Choose 1 genre.");
		String genre = checkStringInput((userInputScanner.nextLine()).toLowerCase());
		//Question 2: Year
		System.out.println("Which year range would you like? \nSelect a number: \n1. 1900-1929 \n2. 1930-1959 \n3. 1960-1979"
				+ "\n4. 1980-1999 \n5. 2000-2019");
		int year = checkIntInput(userInputScanner.nextLine());
		while(year>5 || year <1)
		{
			System.out.println("Please enter 1 - 5. ");
			year = Integer.parseInt(userInputScanner.nextLine());
		}
		//Question 3: Rating
		System.out.println("In terms of movie rating (from 1-10), what is the minimum rating your movies should have?");
		double rating = checkDoubleInput(userInputScanner.nextLine());
		while(rating>10 || rating <0)
		{
			System.out.println("Please enter 1 - 10. ");
			rating = Double.parseDouble(userInputScanner.nextLine());
		}
		//Question 4: Cast
		System.out.println("Which actor or actress would you like the movie cast to have, if any? Please write his/her name in this format, (Firstname Lastname)");
		String actors = checkStringInput((userInputScanner.nextLine()).toLowerCase());
		//Question 5: Director
		System.out.println("Which director would you like the movie to have? Please write his/her name in this format, (Firstname Lastname)");
		String director = checkStringInput((userInputScanner.nextLine()).toLowerCase());
		//Question 6: Number of Movies
		System.out.println("How many movie recommendations would you like to see? The default is 5 movie recommendations.");
		int numberOfMovies = checkIntInput(userInputScanner.nextLine());
		while(numberOfMovies>100 || numberOfMovies <1)
		{
			System.out.println("Please enter 1 - 100. ");
			numberOfMovies = Integer.parseInt(userInputScanner.nextLine());
		}
		//Done
		System.out.println("Thank you for your input! Your recommendations are loading...");
		//Comparing the input with the movie database. Disregarding other variables.
		Recommender recommend = new Recommender();
		ArrayList<Movie> movieRecommendations = recommend.CompareInput(genre, year, rating, actors, director);
		//Picking five random movies by default. Number of movie recommendations is dependent on numberOfMovies input. Can be more or less than 5.
		ArrayList<Movie>Top5movieRecommendations = recommend.RandomPull(numberOfMovies, movieRecommendations);
		//Printing out the recommendations. Output is Movie Title. Default is a list of 5 movies.
		for(int i = 0; i < Top5movieRecommendations.size(); i++) {
			System.out.println(i+1 + ". " + movieRecommendations.get(i).getMovieTitle());
		}
	}
	/** 
	 * This method checks that the user inputs a string.
	 */
	public static String checkStringInput(String input) {
		if(!input.isEmpty()) {
			while(!(input.matches("[a-zA-Z\\s\'\"]+")))
			{
				Scanner userInputScanner = new Scanner(System.in);
				System.out.println("Please enter a word.");
				input = userInputScanner.nextLine();
			}
		}
		return input;
	}
	/** 
	 * This method checks that the user inputs an integer.
	 */
	public static int checkIntInput(String number) {
		if(number.isEmpty()) {
			number = "5";
		}
		while(!(number.matches("^\\d+")))
		{
			Scanner userInputScanner = new Scanner(System.in);
			System.out.println("Please enter a valid number. ");
			number = userInputScanner.nextLine();
		}
		return Integer.parseInt(number);
	}
	/** 
	 * This method checks that the user inputs an integer.
	 */
	public static double checkDoubleInput(String number) {
		if(number.isEmpty()) {
			number = "7.0";
		}
		while(!(number.matches("[0-9.]*")) || (Double.parseDouble(number)>10 || Double.parseDouble(number)<0))
		{
			Scanner userInputScanner = new Scanner(System.in);
			System.out.println("Please enter a valid number. ");
			number = userInputScanner.nextLine();
		}
		return Double.parseDouble(number);
	}
}
