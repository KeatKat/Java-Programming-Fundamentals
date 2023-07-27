// What is a student?
// - A student has a name
// - A student has an id
// - A student has a gender
// - A student takes two subjects
// - A student has marks for the two objects
// 
// File name: TestStudent_7a.java
//
// Explore user defined methods
//
// Introduce an enum class to describe the subjects
// how to access the non static method defined in a class
//explore the use of "this" to access instance information
//
// Explore the use of constructors to construct objects
import java.util.Scanner;

enum Subject {CSIT111, CSIT113, CSIT114, CSIT128}

class Student
{
	// Declare non static private variables, ie instance variables
	private String name;
	private int id;
	private char gender;
	private Subject s1;			// enum type
	private Subject s2;			// enum type
	private double mark1;
	private double mark2;
	
	//default constructor
	public Student()
	{
		//do nothing
	}
	
	//other constructor
	public Student(String name, int id, char gender,Subject s1, Subject s2, double mark1, double mark2)
	{
		this.name = name;
		this.id = id;
		this.gender = gender;
		this.s1 = s1;
		this.s2 = s2;
		this.mark1 = mark1;
		this.mark2 = mark2;
	}
	
	//accessor methods
	public String getName()
	{
		return name;
	}
	
	public int getId()
	{
		return id;
	}
	
	public char getGender()
	{
		return gender;
	}
	
	public Subject getSubject1()
	{
		return s1;
	}
	
	public Subject getSubject2()
	{
		return s2;
	}
	
	public double getMark1()
	{
		return mark1;
	}
	
	public double getMark2()
	{
		return mark2;
	}
	
	//mutator methods
	public void setName(String name)
	{
	    this.name = name;
	}
	
	public void setId(int id)
	{
		this.id = id;
	}
	
	public void setGender(char gender)
	{
		this.gender = gender;
	}
	
	public void setSubject1(Subject s1)
	{
		this.s1 = s1;
	}
	
	public void setSubject2(Subject s2)
	{
		this.s2 = s2;
	}
	
    public void setMark1(double mark1)
	{
		this.mark1 = mark1;
	}
	
	public void setMark2(double mark2)
	{
		this.mark2 = mark2;
	}
	
	
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


class TestStudent_8
{
	//note that an object is passed to a method
	private static void displayInfo(Student s)
	{
		// Compute the average and the final mark
		double average = s.getAverage (s.getMark1(), s.getMark2());
		int finalMark = s.getFinalMark (s.getMark1(), s.getMark2());
		
		System.out.println ();
		System.out.printf ("Name: %s%n", s.getName());
		System.out.printf ("Student id: %d%n", s.getId());
		System.out.printf ("Gender: %c%n", s.getGender());
		System.out.printf ("Subject 1: %s, mark = %.1f%n", s.getSubject1(),s.getMark1());
		System.out.printf ("Subject 2: %s, mark2 = %.1f%n", s.getSubject2(), s.getMark2());
		System.out.printf ("Average = %.1f%n", average);
		System.out.printf ("Final mark = %d%n", finalMark);
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
		
		//construct an object of Student class
		Student s = new Student(name,id,gender,s1,s2,mark1,mark2);
		
		
		// Display the information
		displayInfo(s);
		
	}
}