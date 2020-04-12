import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class RecommenderTest {
	
	Recommender r = new Recommender();

	@Test
	void testCompareInput() {
		
		String newMovieYear = r.CompareInput("Drama", 1, 3.0, "Helen Gardner","Charles L. Gaskill").get(0).getMovieTitle();
		assertEquals("Cleopatra", newMovieYear);
		
	}

	@Test
	void testRandomPull() {
		
		String k = r.RandomPull(1, r.CompareInput("Drama", 1, 3.0, "Helen Gardner","Charles L. Gaskill")).get(0).getMovieTitle();
		assertEquals("Cleopatra", k);

	
	}

}
