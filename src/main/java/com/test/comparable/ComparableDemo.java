/**
 *  
 */
package com.test.comparable;

/**
 * Class to demonstrate the comparable interface
 * 
 * @author Anshul_Goyal
 *	
 */
public class ComparableDemo {
	
	public static void main (String [] args){
	
		Student student = new Student(1,"Bob Cristo", 11, 3.5);
		Student student2 = new Student(2,"Bobby",11,4.5);
	
		int result = student.compareTo(student2);
		
		// Display the result based on the comparisons done.
		
		if(result > 0)
			System.out.println(student.getName() + " is greater than " + student2.getName());
		else if(result < 0)
			System.out.println(student.getName() + " is less than " + student2.getName());
		else
			System.out.println(student.getName() + " is equal to  " + student2.getName());
	}

}
