package com.test.comparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import com.test.comparable.Student;

/**
 * @author Anshul_Goyal
 *
 */
public class StudentComparatorDescTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// Create the student Objects
		Student s1 = new Student(1,"Joe",11,4.5);
		Student s2 = new Student(3,"Bob",11,4.3);
		Student s3 = new Student(2,"Camy",31,4.3);
		
		//Comparator Descending test
		Student[] students = {s1,s2,s3};
		
		//Unsorted Array
		System.out.println("Unsorted Array : \n" + Arrays.toString(students) +"\n");
		
		Arrays.sort(students);
		
		System.out.println("Sorted Array : \n" + Arrays.toString(students) +"\n");
		
		
		//ArrayList
		List<Student> list = new ArrayList<Student>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		
		//Unsorted Array List
		System.out.println("Unsorted Array List \n:" + list +"\n");
		
		Collections.sort(list);;
		
		System.out.println("Sorted Array List \n:" + list +"\n");
		
		StudentComparatorDescending comparatorDescending = new StudentComparatorDescending();
		
		int resultDescending = comparatorDescending.compare(s1, s2);
		
		// Display results with descending comparator

		//Unsorted Array
		System.out.println("Unsorted Array List Desc : \n" + Arrays.toString(students) +"\n");
		
		Arrays.sort(students,comparatorDescending);
		
		System.out.println("Sorted Array Desc : \n" + Arrays.toString(students) +"\n");
		
		
		//ArrayList
		
		//Unsorted Array List desc
		System.out.println("Unsorted Array List Desc \n:" + list +"\n");
		
		Collections.sort(list,comparatorDescending);
		
		System.out.println("Sorted Array List Desc \n:" + list +"\n");
		
		
		
		
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
