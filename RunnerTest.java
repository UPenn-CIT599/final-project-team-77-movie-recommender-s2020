/**
 * @Author: Team 77 (Manuel Moreno, Vy Nguyen, Musen Wen)
 * Date: 04/10/2020
 * Class: MCIT Spring 2020
 */

import static org.junit.jupiter.api.Assertions.*;
import java.io.StringWriter;
import java.util.Scanner;
import org.junit.jupiter.api.Test;

class RunnerTest {

	Runner r = new Runner();
	
	/**
	 * In the JUnit Test for Runner.java, we tested a few functions:
	 * checkStringInput(String), checkIntInput(String), checkDoubleInput(String)
.	 * Overall, we ran 5 unique tests for each method, resulting in 0 errors and 0 failure.
	 */

	@Test
	void testCheckStringInput() {
		String checkString = r.checkStringInput("comedy");
		assertEquals("comedy", checkString);
		
		String checkString2 = r.checkStringInput("drama");
		assertEquals("drama", checkString2);
		
		String checkString3 = r.checkStringInput("biography");
		assertEquals("biography", checkString3);
		
		String checkString4 = r.checkStringInput("crime");
		assertEquals("crime", checkString4);
		
		String checkString5 = r.checkStringInput("romance");
		assertEquals("romance", checkString5);

	}

	@Test
	void testCheckIntInput() {
		int checkInteger =r.checkIntInput("2");
		assertEquals(2, checkInteger);
		
		int checkInteger2 =r.checkIntInput("0");
		assertEquals(0, checkInteger2);
		
		int checkInteger3 =r.checkIntInput("33");
		assertEquals(33, checkInteger3);
	
		int checkInteger4 =r.checkIntInput("100");
		assertEquals(100, checkInteger4);
		
		int checkInteger5 =r.checkIntInput("20");
		assertEquals(20, checkInteger5);

		
	}

	
	@Test
	void testCheckDoubleInput() {
		double checkNum =r.checkDoubleInput("10");
		assertEquals(10.0, checkNum);
		
		double checkNum1 =r.checkDoubleInput("5");
		assertEquals(5.0, checkNum1);
		
		double checkNum2 =r.checkDoubleInput("7");
		assertEquals(7.0, checkNum2);
		
		double checkNum3 =r.checkDoubleInput("0");
		assertEquals(0.0, checkNum3);
		
		double checkNum4 =r.checkDoubleInput("8");
		assertEquals(8.0, checkNum4);
		
	}

}
