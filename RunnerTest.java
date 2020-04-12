import static org.junit.jupiter.api.Assertions.*;

import java.io.StringWriter;
import java.util.Scanner;

import org.junit.jupiter.api.Test;

class RunnerTest {

	Runner r = new Runner();


	@Test
	void testCheckStringInput() {
		String checkString = r.checkStringInput("comedy");
		assertEquals("comedy", checkString);
	}

	@Test
	void testCheckIntInput() {
		int checkInteger =r.checkIntInput("2");
		assertEquals(2, checkInteger);

		
	}

	
	@Test
	void testCheckDoubleInput() {
		double checkNum =r.checkDoubleInput("10");
		assertEquals(10.0, checkNum);
		
	}

}
