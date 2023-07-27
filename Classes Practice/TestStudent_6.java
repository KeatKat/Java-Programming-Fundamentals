// What is a student?
// - A student has a name
// - A student has an id
// - A student has a gender
// - A student takes two subjects
// - A student has marks for the two objects
// 
// File name: TestStudent_6.java
//
// Explore user defined methods
//
// Introduce an enum class to describe the subjects

import java.util.Scanner;

enum Subject {CSIT111, CSIT113, CSIT114, CSIT128}

class Student
{
	// Declare non static private variables
	private String name;
	private int id;
	private char gender;
	private Subject s1;			// enum type
	private Subject s2;			// enum type
	private double mark1;
	private double mark2;
	
	// non static public method
	public double getAverage (double mark1, double mark2)
	{
		double average = (mark1 + mark2) / 2.0;
		
		return average;
	}
	
	public int getFinalMark (double mark1, double mark2)
	{
		// we can call the getAverage method to get the average
		double average = getAverage (mark1, mark2);
		int finalMark = (int) (average + 0.5);
		
		return finalMark;
	}
}


class TestStudent_6
{
	// non static public method
	public double getAverage (double mark1, double mark2)
	{
		double average = (mark1 + mark2) / 2.0;
		
		return average;
	}
	
	public int getFinalMark (double mark1, double mark2)
	{
		// we can call the getAverage method to get the average
		double average = getAverage (mark1, mark2);
		int finalMark = (int) (average + 0.5);
		
		return finalMark;
	}
	
	public static void main (String [ ] args)
	{
		//declare variables
		String name;
		int id;
		char gender;
		Subject s1;			// enum type
		Subject s2;			// enum type
		double mark1;
		double mark2;
		
		//construct an object of scanner class
		Scanner input = new Scanner (System.in);
		
		//construct an object of this class, ie TestStudent_6
		TestStudent_6 ts6 = new TestStudent_6();
		
			
		// Read in the information
		System.out.print ("Enter name: ");
		name = input.nextLine ();
		
		System.out.print ("Enter student id: ");
		id = input.nextInt ();
		
		System.out.print ("Enter gender: ");
		gender = input.next ().charAt (0);
		
		System.out.print ("Enter two subjects: ");
		s1 = Subject.valueOf (input.next ());
		s2 = Subject.valueOf (input.next ());
		
		System.out.print ("Enter two marks for the subjects: ");
		mark1 = input.nextDouble ();
		mark2 = input.nextDouble ();
		
		// Compute the average and the final mark
		double average = ts6.getAverage (mark1, mark2);
		int finalMark = ts6.getFinalMark (mark1, mark2);
		
		// Display the information
		System.out.println ();
		System.out.printf ("Name: %s%n", name);
		System.out.printf ("Student id: %d%n", id);
		System.out.printf ("Gender: %c%n", gender);
		System.out.printf ("Subject 1: %s, mark = %.1f%n", s1,mark1);
		System.out.printf ("Subject 2: %s, mark2 = %.1f%n", s2, mark2);
		System.out.printf ("Average = %.1f%n", average);
		System.out.printf ("Final mark = %d%n", finalMark);
	}
}