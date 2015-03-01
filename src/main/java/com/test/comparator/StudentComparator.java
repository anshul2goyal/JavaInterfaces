package com.test.comparator;

import java.util.Comparator;

import com.test.comparable.Student;

/**
 * Demo class to display the usage of Comparator interface
 * 
 * @author Anshul_Goyal
 *
 */
public class StudentComparator implements Comparator<Student> {

	/**
	 * compare method to compare the two student objects
	 * 
	 */
	@Override
	public int compare(Student student1, Student student2) {

		// Compare the objects on the basis of grades that means these are not
		// sorted on the basis
		// of their natural ordering
		if (student1.getGrade() == student2.getGrade())
			return 0;
		else if (student1.getGrade() > student2.getGrade())
			return 1;
		else
			return -1;
	}
}