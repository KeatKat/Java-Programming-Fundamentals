// Read in the 3 sides of a triangle.
// We wish to compute its area and its perimeter
//
//	Explore the use of printf methods
//
// File name: Triangle_2.java

import java.util.Scanner;

class Triangle_2
{
	public static void main (String [ ] args)
	{
			//construct a scanner class object
			Scanner input = new Scanner(System.in);
			
			//Declare variables
			double a;
			double b;
			double c;
			
			//read 3 sides of triangle
			System.out.print("Enter 3 sides of a triangle : ");
			a = input.nextDouble();
			b = input.nextDouble();
			c = input.nextDouble();
			
			//compute area and perimeter
			double s  = (a + b + c) / 2.0;
			double area = Math.sqrt(s * (s - a) * (s - b) * (s - c) );
			double perimeter = a + b + c ;
			
			//display the result
			System.out.println() ;
			System.out.printf("Given a = %f, b = %f, c = %f%n", a, b, c);
			System.out.printf("Area = %f%n", area ) ;
			System.out.printf("Perimeter = %f%n", perimeter ) ;
			
			
	}
}