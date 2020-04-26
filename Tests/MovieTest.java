/**
 * @Author: Team 77 (Manuel Moreno, Vy Nguyen, Musen Wen)
 * Date: 04/10/2020
 * Class: MCIT Spring 2020
 */

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MovieTest {
	
	/**
	 * In the JUnit Test for Movie.java, we tested a few getter functions:
	 * GetMovieTitle(), GetMovieRating(), GetGenre(), GetMovieYear(), getDirector(), getActors().
.	 * Overall, we ran 5 unique tests, resulting in 0 errors and 0 failure.
	 */

	Movie m = new Movie("Richard III",1.0,"Drama",1912,"James Keane","Robert Gemp");
	Movie n = new Movie("A Bird of the Air",6.0,"Romance",2011,"Margaret Whitton","Jackson Hurst");
	Movie o = new Movie("Double Trouble",10.0,"Crime",1992,"John Paragon","David Carradine");
	Movie p = new Movie("Moneyball",4.0,"Biography",2011,"Bennett Miller","Brad Pitt");
	Movie r = new Movie("Minor Details",1.0,"Adventure",2009,"John Lyde","Savannah Jayde");




	@Test
	void testGetMovieTitle() {
		String movieName1 = m.getMovieTitle();
		assertEquals("Richard III",movieName1);
		
		String movieName2 = n.getMovieTitle();
		assertEquals("A Bird of the Air",movieName2);
		
		String movieName3 = o.getMovieTitle();
		assertEquals("Double Trouble",movieName3);
		
		String movieName4 = p.getMovieTitle();
		assertEquals("Moneyball",movieName4);
		
		String movieName5 = r.getMovieTitle();
		assertEquals("Minor Details",movieName5);
				
	}

	@Test
	void testGetMovieRating() {
		double newmovieRating1 = m.getMovieRating();
		assertEquals(1.0,newmovieRating1);
		
		double newmovieRating2 = n.getMovieRating();
		assertEquals(6.0,newmovieRating2);
		
		double newmovieRating3 = o.getMovieRating();
		assertEquals(10.0,newmovieRating3);
		
		double newmovieRating4 = p.getMovieRating();
		assertEquals(4.0,newmovieRating4);
		
		double newmovieRating5 = r.getMovieRating();
		assertEquals(1.0,newmovieRating5);
	}

	@Test
	void testGetGenre() {
		String newtestGetGenre1 = m.getGenre();
		assertEquals("Drama",newtestGetGenre1);
		
		String newtestGetGenre2 = n.getGenre();
		assertEquals("Romance",newtestGetGenre2);
		
		String newtestGetGenre3 = o.getGenre();
		assertEquals("Crime",newtestGetGenre3);
		
		String newtestGetGenre4 = p.getGenre();
		assertEquals("Biography",newtestGetGenre4);
		
		String newtestGetGenre5 = r.getGenre();
		assertEquals("Adventure",newtestGetGenre5);
	}

	@Test
	void testGetMovieYear() {
		int newMovieYear1 = m.getMovieYear();
		assertEquals(1912,newMovieYear1);	
		
		int newMovieYear2 = n.getMovieYear();
		assertEquals(2011,newMovieYear2);
		
		int newMovieYear3 = o.getMovieYear();
		assertEquals(1992,newMovieYear3);
		
		int newMovieYear4 = p.getMovieYear();
		assertEquals(2011,newMovieYear4);
		
		int newMovieYear5 = r.getMovieYear();
		assertEquals(2009,newMovieYear5);
	}

	@Test
	void testGetDirector() {
		String newMovieDirector1 = m.getDirector();
		assertEquals("James Keane",newMovieDirector1);
		
		String newMovieDirector2 = n.getDirector();
		assertEquals("Margaret Whitton",newMovieDirector2);
		
		String newMovieDirector3 = o.getDirector();
		assertEquals("John Paragon",newMovieDirector3);
		
		String newMovieDirector4 = p.getDirector();
		assertEquals("Bennett Miller",newMovieDirector4);
		
		String newMovieDirector5 = r.getDirector();
		assertEquals("John Lyde",newMovieDirector5);
	}

	@Test
	void testGetActors() {
		String newGetActors1 = m.getActors();
		assertEquals("Robert Gemp",newGetActors1);	
		
		String newGetActors2 = n.getActors();
		assertEquals("Jackson Hurst",newGetActors2);	
		
		String newGetActors3 = o.getActors();
		assertEquals("David Carradine",newGetActors3);
		
		String newGetActors4 = p.getActors();
		assertEquals("Brad Pitt",newGetActors4);
		
		String newGetActors5 = r.getActors();
		assertEquals("Savannah Jayde",newGetActors5);
		
	
	}

}
