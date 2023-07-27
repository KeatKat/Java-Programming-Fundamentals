// Read in the 3 sides of a triangle.
// We wish to compute its area and its perimeter
//
//	Read two sets of triangles to test your design
//
// File name: Triangle_5.java

import java.util.Scanner;

class Triangle_5
{
	//Declare 3 static variables
	private static double a;
	private static double b;
	private static double c;
			
	public static void main (String [ ] args)
	{
			//construct a scanner class object
			Scanner input = new Scanner(System.in);
			
			//read 3 sides of triangle
			System.out.print("Enter 3 sides of a triangle : ");
			a = input.nextDouble();
			b = input.nextDouble();
			c = input.nextDouble();
			
			//compute area and perimeter
			double s  = (a + b + c) / 2.0;
			double area = Math.sqrt(s * (s - a) * (s - b) * (s - c) );
			double perimeter = a + b + c ;
			
			//display the result (compiler left justify the output)
			System.out.println() ;
			System.out.printf("Given a = %-10.4f, b = %-10.4f, c = %-10.4f%n", a, b, c);
			System.out.printf("Area = %-10.4f%n", area ) ;
			System.out.printf("Perimeter = %-10.4f%n", perimeter ) ;
			System.out.printf("Number of Triangle = %04d%n", 1);
			
			System.out.println("--------------------------------------------------------------------------");
			
			//read 3 sides of triangle
			System.out.print("Enter 3 sides of a triangle : ");
			a = input.nextDouble();
			b = input.nextDouble();
			c = input.nextDouble();
			
			//compute area and perimeter
			 s  = (a + b + c) / 2.0;
			 area = Math.sqrt(s * (s - a) * (s - b) * (s - c) );
			 perimeter = a + b + c ;
			
			//display the result (compiler left justify the output)
			System.out.println() ;
			System.out.printf("Given a = %-10.4f, b = %-10.4f, c = %-10.4f%n", a, b, c);
			System.out.printf("Area = %-10.4f%n", area ) ;
			System.out.printf("Perimeter = %-10.4f%n", perimeter ) ;
			System.out.printf("Number of Triangle = %04d%n", 2);
	}
}