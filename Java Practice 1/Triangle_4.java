// Read in the 3 sides of a triangle.
// We wish to compute its area and its perimeter
//
//	Read two sets of triangles to test your design
// How to get rid of input buffer?
// 
// To display the result in a table
// 
// No			a			b			c			area			perimeter
//-----------------------------------------------------------------
// 1			***		***		***		***			****
// 2			***		***		***		***			****
//-----------------------------------------------------------------
// File name: Triangle_4.java

import java.util.Scanner;

class Triangle_4
{
	public static void main (String [ ] args)
	{
			//construct a scanner class object
			Scanner input = new Scanner(System.in);
			
			//Declare variables
			double a1, a2;
			double b1, b2;
			double c1, c2;
			double area1, area2;
			double perimeter1, perimeter2;
			
			
			//read 3 sides of triangle
			System.out.print("Enter 3 sides of a triangle : ");
			a1 = input.nextDouble();
			b1 = input.nextDouble();
			c1 = input.nextDouble();
			
			//compute area and perimeter
			double s  = (a1 + b1 + c1) / 2.0;
			area1 = Math.sqrt(s * (s - a1) * (s - b1) * (s - c1) );
			perimeter1 = a1 + b1 + c1 ;
			
			//to get rid of input buffer
			input.nextLine();
			
			//read 3 sides of triangle
			System.out.print("Enter 3 sides of a triangle : ");
			a2 = input.nextDouble();
			b2 = input.nextDouble();
			c2 = input.nextDouble();
			
			//compute area and perimeter
			 s  = (a2 + b2 + c2) / 2.0;
			 area2 = Math.sqrt(s * (s - a2) * (s - b2) * (s - c2) );
			 perimeter2 = a2 + b2 + c2 ;
			
			//display the table (compiler left justify the output)
			System.out.println() ;
			
			System.out.printf("%-5s" + "%-10s" + "%-10s" + "%-10s" + "%-10s" + "%-10s%n", 
										"No", "a", "b", "c", "area", "perimeter");
			System.out.println("----------" + "----------" + "----------" + "----------" + "----------" + "-----");
			
			System.out.printf("%-5s" + "%-10.4f" + "%-10.4f" + "%-10.4f" + "%-10.4f" + "%-10.4f%n", 
										"1", a1, b1, c1, area1, perimeter1);
										
			System.out.printf("%-5s" + "%-10.4f" + "%-10.4f" + "%-10.4f" + "%-10.4f" + "%-10.4f%n", 
										"2", a2, b2, c2, area2, perimeter2);
			
			System.out.println("----------" + "----------" + "----------" + "----------" + "----------" + "-----");
			
	}
}