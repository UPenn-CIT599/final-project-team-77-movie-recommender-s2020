/**
 * @Author: Team 77 (Manuel Moreno, Vy Nguyen, Musen Wen)
 * Date: 04/10/2020
 * Class: MCIT Spring 2020
 */


import static org.junit.jupiter.api.Assertions.*;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

class RecommenderTest {
	
	Recommender r = new Recommender();

	/**
	 * In the JUnit Test for Recommender.java, we tested two methods: CompareInput and Random Pull.
	 * In both methods, we used 1-5 to represent various year range.
	 * To test the CompareInput method, we compared the input (genre, year, rating, actor, director) with its output (movieTitle).
	 * To test the Randompull method, we randomly pulled one movie that met criteria and also stated the specific number of movies in the list.
	 * Overall, we test 9 unique tests, resulting in 0 errors and 0 failure.
	 */
	
	@Test
	void testCompareInput() {
		
		String newMovieTitle = r.CompareInput("Drama", 1, 3.0, "Helen Gardner","Charles L. Gaskill").get(0).getMovieTitle();
		assertEquals("Cleopatra", newMovieTitle);
		
		String newMovieTitle2 = r.CompareInput("Adventure", 2, 3.0, "Arthur Vinton","George Melford").get(0).getMovieTitle();
		assertEquals("The Viking", newMovieTitle2);		

		String newMovieTitle3 = r.CompareInput("Comedy", 3, 1.0, "Peter Alexander","Werner Jacobs").get(0).getMovieTitle();
		assertEquals("Im weissen Rössl", newMovieTitle3);	
		
		String newMovieTitle4 = r.CompareInput("Sci-Fi", 4, 12.0, "Cassy Friel","W.D. Richter").get(0).getMovieTitle();
		assertEquals("The Adventures of Buckaroo Banzai Across the 8th Dimension", newMovieTitle4);	
	
		String newMovieTitle5 = r.CompareInput("Crime", 5, 99.0, "Tristan Sturrock","Nigel Cole").get(0).getMovieTitle();
		assertEquals("Saving Grace", newMovieTitle5);	
	}

	@Test
	void testRandomPull() {
		
		
		String a = r.RandomPull(1, r.CompareInput("Fantasy", 1, 5.0, "Dorothy Cumming","J. Searle Dawley")).get(0).getMovieTitle();
		assertEquals("Snow White", a);
		
		String b = r.RandomPull(3, r.CompareInput("Western", 2, 2.0, "Margo","Henry Hathaway")).get(0).getMovieTitle();
		assertTrue(b.equals("From Hell to Texas")||b.equals("Granny Get Your Gun"));
		
		String c = r.RandomPull(2, r.CompareInput("War", 3, 2.0, "Robert Hundar","Umberto Lenzi")).get(0).getMovieTitle();
		assertEquals("La legione dei dannati", c);
		
		String d = r.RandomPull(4, r.CompareInput("Comedy", 4, 12.0, "Robin Stewart","John D. Lamond")).get(0).getMovieTitle();
		assertTrue(d.equals("Nightmares")||d.equals("Pacific Banana"));
		
			

		
	
	}

}
