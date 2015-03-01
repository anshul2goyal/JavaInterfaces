package com.test.comparator;

import java.util.Comparator;

import com.test.comparable.Student;

/**
 * Demo class to display the usage of Comparator interface
 * 
 * @author Anshul_Goyal
 *
 */
public class StudentComparatorDescending implements Comparator<Student> {

	/**
	 * compare method to compare the two student objects
	 * 
	 */
	@Override
	public int compare(Student student1, Student student2) {
		
		
		//Compare the objects on the basis of IDs that means these are not sorted on the basis 
		// of their natural ordering
		if (student1.equals(student2))
			return 0;
		else if (student2.getId() > student1.getGrade())
			return 1;
		else
			return -1;

	}
}