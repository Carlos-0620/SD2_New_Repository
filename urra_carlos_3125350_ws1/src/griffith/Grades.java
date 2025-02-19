package griffith;

public class Grades {

	static int gradesMax(int[] grades) {
		if (grades.length == 0) throw new IllegalArgumentException("Grade array cannot be empty.");
        int max = grades[0];
        for (int grade : grades) {
            if (grade > max) {
                max = grade;
            }
        }
        return max;
		
	}
	
	static int gradesTotal (int[] grades) {
		if (grades.length == 0) throw new IllegalArgumentException("Grade array cannot be empty.");
        int total = 0;
        for (int grade : grades) {
            total += grade;
        }
        return total;
		 
	}
	 
	static double gradesAverage(int[] grades) {
		return 0.0;
		 
	}
	 
	static int countFails(int[] grades, int minGrade) {
		return 0;
		 
	}
}
