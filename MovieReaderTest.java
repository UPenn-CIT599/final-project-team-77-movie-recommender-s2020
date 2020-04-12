import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MovieReaderTest {
	MovieReader mr = new MovieReader();

	@Test
	void testMovieReader() {
		String firstmovie = mr.MovieReader("movie_metadata.csv").get(1).getMovieTitle();
		assertEquals("The Story of the Kelly Gang",firstmovie);
		
		
		
		
	}

}
