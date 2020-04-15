/**
 * @Author: Team 77 (Manuel Moreno, Vy Nguyen, Musen Wen)
 * Date: 04/10/2020
 * Class: MCIT Spring 2020
 */

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MovieReaderTest {
	MovieReader mr = new MovieReader();
	
	/**
	 * In the JUnit Test for Runner.java, we tested several methods: 
	 * testGetMovieTitle(), testGetMovieRating(), testGetGenre(), testGetMovieYear(), testgetDirector2(), testgetActors().
	 * Overall, we ran 5 unique tests, resulting in 0 errors and 0 failure.
	 */

	@Test
	void testGetMovieTitle() {
		String a = mr.MovieReader("movie_metadata.csv").get(1).getMovieTitle();
		assertEquals("The Story of the Kelly Gang",a);		
		
		String b = mr.MovieReader("movie_metadata.csv").get(100).getMovieTitle();
		assertEquals("A Romance of the Redwoods",b);
		
		String c = mr.MovieReader("movie_metadata.csv").get(5962).getMovieTitle();
		assertEquals("The Man in Black",c);
		
		String d = mr.MovieReader("movie_metadata.csv").get(50448).getMovieTitle();
		assertEquals("Armin",d);
		
		String e = mr.MovieReader("movie_metadata.csv").get(65534).getMovieTitle();
		assertEquals("It Gets Better",e);	
	}
	
	@Test
	void testGetGenre() {
		String f = mr.MovieReader("movie_metadata.csv").get(16).getGenre();
		assertEquals("Drama",f);	
		
		String g = mr.MovieReader("movie_metadata.csv").get(4221).getGenre();
		assertEquals("Comedy, Drama, Romance",g);
		
		String h = mr.MovieReader("movie_metadata.csv").get(25409).getGenre();
		assertEquals("Drama, Fantasy", h);
		
		String i = mr.MovieReader("movie_metadata.csv").get(16434).getGenre();
		assertEquals("Biography, Drama, History",i);	
		
		String j = mr.MovieReader("movie_metadata.csv").get(26249).getGenre();
		assertEquals("Thriller, Horror, Mystery",j);
		
		String k = mr.MovieReader("movie_metadata.csv").get(59444).getGenre();
		assertEquals("Comedy, Drama, Romance",k);
	}

	
	@Test
	void testgetMovieYear() {
		int l = mr.MovieReader("movie_metadata.csv").get(8323).getMovieYear();
		assertEquals(1956,l);	
		
		int m = mr.MovieReader("movie_metadata.csv").get(25101).getMovieYear();
		assertEquals(1991,m);
		
		int n = mr.MovieReader("movie_metadata.csv").get(38860).getMovieYear();
		assertEquals(2001,n);
		
		int o = mr.MovieReader("movie_metadata.csv").get(2).getMovieYear();
		assertEquals(1911,o);
		
		int p = mr.MovieReader("movie_metadata.csv").get(7236).getMovieYear();
		assertEquals(1953,p);
		
	}	
	
	@Test
	void testgetActors() {
		String r = mr.MovieReader("movie_metadata.csv").get(28).getActors();
		assertEquals("Sidney Drew, Edith Storey, Charles Kent, Mrs. Sidney Drew, Ada Gifford, Ethel Lloyd, Lillian Burns, Grace Stevens, Allan Campbell, Cortland Van Deusen, Frank O'Neil",r);	
		
		String s = mr.MovieReader("movie_metadata.csv").get(16583).getActors();
		assertEquals("Oliver Reed, Fabio Testi, Paola Pitagora, Agostina Belli, Frédéric de Pasquale, Marc Mazza, Reinhard Kolldehoff, Bernard Giraudeau, Peter Berling, Alexander Stephan, Daniel Beretta, Calisto Calisti, Steffen Zacharias, Michel Bardinet, Sal Borgese",s);	
		
		String t = mr.MovieReader("movie_metadata.csv").get(1176).getActors();
		assertEquals("Kay Francis, Paul Cavanagh, Ricardo Cortez, Nance O'Neil, Doris Lloyd, John St. Polis, Ruth Weston, Adrienne D'Ambricourt, Agostino Borgato",t);	
		
		String u = mr.MovieReader("movie_metadata.csv").get(45170).getActors();
		assertEquals("Malcolm Stumpf, Patrick White, Max Paradise, Fairuza Balk, Kim Dickens, Tom Gilroy, Ruth Elliott, Joey Coffman, Tim Greer, Dash Mann, Derek Mitchler, Kylee Mains, Teresa Morales, James Porter, Bernadette Wilson",u);	
		
		String v = mr.MovieReader("movie_metadata.csv").get(58990).getActors();
		assertEquals("Melanie Griffith, Michael Cudlitz, Pruitt Taylor Vince, Chris Hayes, Suzanne Quast, Bradley Joseph, Eddie J. Fernandez, Waymond Lee, Linda S. Wong, Ernesto Chaverri, Nayo Wallace, Donna Ponterotto, Stefanie Kleine, Aynaz Anni Cyrus, Joseph John Schirle",v);	
	}
	
	@Test
	void testgetDirector2() {
		String w = mr.MovieReader("movie_metadata.csv").get(3).getDirector();
		assertEquals("Charles L. Gaskill",w);	
		
		String x = mr.MovieReader("movie_metadata.csv").get(1967).getDirector();
		assertEquals("Rowland V. Lee",x);	
		
		String y = mr.MovieReader("movie_metadata.csv").get(42600).getDirector();
		assertEquals("Shin Togashi",y);	
		
		String z = mr.MovieReader("movie_metadata.csv").get(59390).getDirector();
		assertEquals("Don Thacker",z);	
		
		String aa = mr.MovieReader("movie_metadata.csv").get(8225).getDirector();
		assertEquals("Lewis Seiler",aa);	
		
	}	
	
	@Test
	void testgetDirector() {
		String w = mr.MovieReader("movie_metadata.csv").get(3).getDirector();
		assertEquals("Charles L. Gaskill",w);
		
		String z = mr.MovieReader("movie_metadata.csv").get(3430).getDirector();
		assertEquals("George B. Seitz",z);
		
		String d = mr.MovieReader("movie_metadata.csv").get(40078).getDirector();
		assertEquals("Manivannan",d);
		
		String l = mr.MovieReader("movie_metadata.csv").get(768).getDirector();
		assertEquals("John Francis Dillon",l);
		
		String m = mr.MovieReader("movie_metadata.csv").get(757).getDirector();
		assertEquals("Jack Conway",m);

	}
	
	
}
