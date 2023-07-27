// What is a student?
// - A student has a name
// - A student has an id
// - A student has a gender
// - A student takes two subjects
// - A student has marks for the two objects
// 
// File name: TestStudent_7.java
//
// Explore user defined methods
//
// Introduce an enum class to describe the subjects
//
// How to update the private instance variables?

import java.util.Scanner;

enum Subject {CSIT111, CSIT113, CSIT114, CSIT128}

class Student
{
	// Declare non static private variables (known as instance variable)
	private String name;
	private int id;
	private char gender;
	private Subject s1;			// enum type
	private Subject s2;			// enum type
	private double mark1;
	private double mark2;
	
	// accessor methods
	public String getName ()
	{
		return name;
	}
	
	public int getID ()
	{
		return id;
	}
	
	public char getGender ()
	{
		return gender;
	}
	
	public Subject getSubject1 ()
	{
		return s1;
	}
	
	public Subject getSubject2 ()
	{
		return s2;
	}
	
	public double getMark1 ()
	{
		return mark1;
	}
	
	public double getMark2 ()
	{
		return mark2;
	}
	
	// mutator methods
	public void setName (String n)
	{
		name = n;
	}
	
	public void setID (int i)
	{
		id = i;
	}
	
	public void setGender (char g)
	{
		gender = g;
	}
	
	public void setSubject1 (Subject s)
	{
		s1 = s;
	}
	
	public void setSubject2 (Subject s)
	{
		s2 = s;
	}
	
	public void setMark1 (double m1)
	{
		mark1 = m1;
	}
	
	public void setMark2 (double m2)
	{
		mark2 = m2;
	}
	
	// non static public method
	public double getAverage ()
	{
		double average = (mark1 + mark2) / 2.0;
		
		return average;
	}
	
	public int getFinalMark ()
	{
		// we can call the getAverage method to get the average
		double average = getAverage ();
		int finalMark = (int) (average + 0.5);
		
		return finalMark;
	}
}



class TestStudent_7
{
	public static void main (String [ ] args)
	{
		// Construct an object of Scanner class
		Scanner input = new Scanner (System.in);
		
		// Construct a student object
		Student s = new Student();
		
		// Declare non static private variables
		String name;
		int id;
		char gender;
		Subject s1;			// enum type
		Subject s2;			// enum type
		double mark1;
		double mark2;
			
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
		
		// Update all private instance variables defined in Student s 
		s.setName(name);
		s.setID(id);
		s.setGender(gender);
		s.setSubject1(s1);
		s.setSubject2(s2);
		s.setMark1(mark1);
		s.setMark2(mark2);
		
		// Compute the average and the final mark
		// Note that we access the getAverage & getFinalMark via the student object s
		double average = s.getAverage ();
		int finalMark = s.getFinalMark ();
		
		// Display the information
		System.out.println ();
		System.out.printf ("Name: %s%n", s.getName());
		System.out.printf ("Student id: %d%n", s.getID());
		System.out.printf ("Gender: %c%n", s.getGender());
		System.out.printf ("Subject 1: %s, mark = %.1f%n", s1, s.getMark1());
		System.out.printf ("Subject 2: %s, mark2 = %.1f%n", s2, s.getMark2());
		System.out.printf ("Average = %.1f%n", average);
		System.out.printf ("Final mark = %d%n", finalMark);
	}
}