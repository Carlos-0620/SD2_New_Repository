package griffith;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class GradesTest {

    @Test
    void testGradesMax() {
        int[] grades1 = {80, 90, 70}; // Normal values
        int[] grades2 = {-10, 0, -5}; // Includes negatives
        int[] grades3 = {100, 50, 75}; // Includes max boundary

        assertEquals(90, Grades.gradesMax(grades1), "Max grade should be 90");
        assertEquals(0, Grades.gradesMax(grades2), "Max grade should be 0");
        assertEquals(100, Grades.gradesMax(grades3), "Max grade should be 100");
    }

    @Test
    void testGradesTotal() {
        int[] grades1 = {80, 90, 70}; // Normal case
        int[] grades2 = {10, 20, 30}; // Small values
        int[] grades3 = {}; // Edge case: empty array

        assertEquals(240, Grades.gradesTotal(grades1), "Total should be 240");
        assertEquals(60, Grades.gradesTotal(grades2), "Total should be 60");

        // Check for empty array exception
        assertThrows(IllegalArgumentException.class, () -> {
            Grades.gradesTotal(grades3);
        }, "Should throw exception for empty array");
    }

    @Test
    void testGradesAverage() {
        int[] grades1 = {80, 90, 70}; // Normal case
        int[] grades2 = {10, 20, 30}; // Small values
        int[] grades3 = {}; // Edge case: empty array

        assertEquals(80.0, Grades.gradesAverage(grades1), 0.01, "Average should be 80.0");
        assertEquals(20.0, Grades.gradesAverage(grades2), 0.01, "Average should be 20.0");

        // Check for empty array exception
        assertThrows(IllegalArgumentException.class, () -> {
            Grades.gradesAverage(grades3);
        }, "Should throw exception for empty array");
    }

    @Test
    void testCountFails() {
        int[] grades1 = {30, 45, 60, 20, 50}; // Some fails
        int[] grades2 = {55, 60, 80, 75}; // No fails
        int[] grades3 = {10, 20, 30, 39, 29}; // All fails

        assertEquals(2, Grades.countFails(grades1, 40), "Fail count should be 2");
        assertEquals(0, Grades.countFails(grades2, 40), "Fail count should be 0");
        assertEquals(5, Grades.countFails(grades3, 40), "Fail count should be 5");
    }
}
