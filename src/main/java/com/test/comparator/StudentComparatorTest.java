package com.test.comparator;

import com.test.comparable.Student;

/**
 * @author Anshul_Goyal
 *
 */
public class StudentComparatorTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// Create the student Objects
		Student s1 = new Student(1,"Joe",11,4.5);
		Student s2 = new Student(3,"Bob",11,4.3);
		
		// Instantiate the Comparator Object
		StudentComparator comparator = new StudentComparator();
		
		int result = comparator.compare(s1, s2);
		
		displayResults(s1, s2, result);
		
		//Comparator Descending test
		StudentComparatorDescending comparatorDescending = new StudentComparatorDescending();
		
		int resultDescending = comparatorDescending.compare(s1, s2);
		
		displayResults(s1, s2, resultDescending);
		
		
	}

	private static void displayResults(Student s1, Student s2, int result) {
		if(result < 0)
			System.out.println(s1.getName() + " comes before " + s2.getName());
		else if(result > 0)
			System.out.println(s2.getName() + " comes before " + s1.getName());
		else
			System.out.println(s1.getName() + " is equal to " + s2.getName());
	}

}
