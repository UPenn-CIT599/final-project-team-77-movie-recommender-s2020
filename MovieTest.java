import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MovieTest {

	@Test
	void testGetMovieTitle() {
		Movie m = new Movie("Richard III",1.0,"Drama",1912,"James Keane","Robert Gemp");
		String movieName = m.getMovieTitle();
		assertEquals("Richard III",movieName);
				
	}

	@Test
	void testGetMovieRating() {
		Movie m = new Movie("Richard III",1.0,"Drama",1912,"James Keane","Robert Gemp");
		double newmovieRating = m.getMovieRating();
		assertEquals(1.0,newmovieRating);
	}

	@Test
	void testGetGenre() {
		Movie m = new Movie("Richard III",1.0,"Drama",1912,"James Keane","Robert Gemp");
		String newtestGetGenre = m.getGenre();
		assertEquals("Drama",newtestGetGenre);
	}

	@Test
	void testGetMovieYear() {
		Movie m = new Movie("Richard III",1.0,"Drama",1912,"James Keane","Robert Gemp");
		int newMovieYear = m.getMovieYear();
		assertEquals(1912,newMovieYear);	
	}

	@Test
	void testGetDirector() {
		Movie m = new Movie("Richard III",1.0,"Drama",1912,"James Keane","Robert Gemp");
		String newMovieDirector = m.getDirector();
		assertEquals("James Keane",newMovieDirector);
	}

	@Test
	void testGetActors() {
		Movie m = new Movie("Richard III",1.0,"Drama",1912,"James Keane","Robert Gemp");
		String newGetActors = m.getActors();
		assertEquals("Robert Gemp",newGetActors);	}

}
