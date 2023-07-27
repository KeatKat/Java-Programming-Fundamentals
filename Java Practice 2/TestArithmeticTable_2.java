/*
	Arithmetic table
	
	*		1		2		3		4
	1		1		2		3		4
	2		2		4		6		8
	3		3		6		9		12
	4		4		8		12	16
	
	File name: TestArithmeticTable_2.java
*/

enum Operation 
{
	Plus, Minus, Multiply, Divide, Modulus
}

class ArithmeticTable
{
	private int n;					// n is the size of the table
	private Operation operator;	// '+', '-', '*', '/', '%'
	
	public ArithmeticTable ()
	{
	
	}
	
	public ArithmeticTable (int n, Operation operator)
	{
		this.n = n;
		this.operator = operator;
	}
	
	public ArithmeticTable (ArithmeticTable at)
	{
		this (at.n, at.operator);
	}
	
	// Accessor methods
	public int getSize ()
	{
		return n;
	}
	
	public Operation getOperator ()
	{
		return operator;
	}
	
	// Mutator method
	public void setInfo (int n, Operation operator)
	{
		this.n = n;
		this.operator = operator;
	}
	
	// To get value of an operation
	private int getValue (int i, int j)
	{
		switch (operator)
		{
			case Plus: return i + j;
			case Minus : return i - j;
			case Multiply: return i * j;
			case Divide: return i / j;
			default: return i % j;
		}
	}
	
	private char getArthmeticOperator()
	{
		switch (operator)
		{
			case Plus : return '+';
			case Minus: return '-';
			case Multiply: return '*';
			case Divide: return '/';
			default: return '%';
		}
	}
	
	// Display the arithmetic table
	public void displayTable ()
	{
		System.out.printf ("%-6c", getArthmeticOperator());
		
		// display the heading of the table
		for (int i = 1; i <= n; i++)
			System.out.printf ("%-6d", i);
		System.out.println ();
		
		// display the whole table
		for (int i = 1; i <= n; i++)
		{
			System.out.printf ("%-6d", i);		// display leftmost column
			
			for (int j = 1; j <= n; j++)
			{
				System.out.printf ("%-6d", getValue (i, j));
			}
			
			System.out.println ();
		}
	}
}

class TestArithmeticTable_2
{
	private static Operation getOperator ()
	{
		int k = (int) (Math.random () * 5);
		
		switch (k)
		{
			case 0: return Operation.Plus;
			case 1: return Operation.Minus;
			case 2: return Operation.Multiply;
			case 3: return Operation.Divide;
			default: return Operation.Modulus;
		}
	}
	
	// Generate a size in between 5 and 10
	private static int getSize ()
	{
		int size;
		
		do
		{
			size = (int) (Math.random () * 20);
		} while (size < 5 || size >= 11);
		
		return size;
	}
	
	public static void main (String [ ] args)
	{
		for (int i = 1; i <= 3; i++)
		{
			ArithmeticTable at = new ArithmeticTable (getSize (), getOperator ());
			at.displayTable ();
			
			System.out.println ();
		}
	}
}
	
	