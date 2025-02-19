package griffith;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GradesTest {

	@Test
	void testGradesMax()  {
		int grade1 = 101 ; 
		assertFalse(grade1 > 100, "The grade should not exceed 100");
		
		int grade2 = 100;
		assertTrue(grade2 <= 100);
		
		int grade3 = -100;
		assertTrue(grade3 < 0,"Grades cannot be negative");
	}
	
	@Test
	void testGradesTotal () {
		int[] grades1 = {60, 75, 80};
		assertEquals(215,Grades.gradesTotal(grades1),"Total should be 215");
		
		int[] grades2 = {60, 75, -10};
		assertEquals(125,Grades.gradesTotal(grades2),"Total is 125 but there cannot be negative grades");
		
		int[] grades3 = {0};
		assertEquals(0, Grades.gradesTotal(grades3),"Total is 0, but there cannot be an empty array");
	}
	
	@Test
	void testGradesAverage () {
		int[] grades1 = {60, 75, 80};
		assertEquals(71.66, Grades.gradesAverage(grades1),"The average should be 71.66");
		
		int[] grades2 = {60, 75, -10};
		assertEquals(41.66, Grades.gradesAverage(grades2),"The average should be 41.66, but grades cannot be negative");
		
		int[] grades3 = {};
		assertEquals(0.0, Grades.gradesAverage(grades3),"The average should be 0, but the array cannot be empty");
	}
	
	@Test
	void testCountFails () {
		int[] grades1 = {30, 45, 60, 20, 50};
		assertEquals(2, Grades.countFails(grades1, 40),"Fail count should 2");
		
		int[] grades2 = {55, 60, 75, 80, 90};
		assertEquals(0, Grades.countFails(grades2, 40),"Fail count should be 0");
		
		int[] grades3 = {30, 39, 20, 10, 15};
		assertEquals(5, Grades.countFails(grades3, 40),"Fail count should be 5");
	}

}
