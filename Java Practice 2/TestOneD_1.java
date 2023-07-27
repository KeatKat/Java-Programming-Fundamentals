// An array is an instance variable
//
// Shallow copying
//
// Test name: TestOneD_1.java

class OneD
{
	private int [] a;
	
	public OneD(int [] a)
	{
		this.a = a;
	}
	
	public OneD(OneD od)
	{
		this.a = od.a;
	}
	
	//modify a value in a
	public void modifyElement()
	{
		a[0] = 999;
	}
	
	public void displayInfo()
	{
		for(int i : a)
		{
			System.out.printf("%-5d", i);
		}
		
		System.out.println();
	}
}

class TestOneD_1
{
	private static void displayInfo(int [ ] a)
	{
		for(int i : a)
		{
			System.out.printf("%-5d", i);
		}
		
		System.out.println();
	}
	
	public static void main (String [ ] args)
	{
		int [ ] a = {1, 2, 3, 4, 5, 6};
		
		System.out.println("Array a in main method is");
		displayInfo(a);
		
		//construct an object of OneD
		OneD od = new OneD(a);
		
		System.out.println("\nArray a in the class object od");
		od.displayInfo();
		
		//construct a duplicate object of OneD
		OneD odCopy = new OneD(od);
		System.out.println("\nA duplicate object of od");
		odCopy.displayInfo();
		
		//modify an element in object a
		od.modifyElement();
		System.out.println("\nModify an element in object od");
		od.displayInfo();
		
		//what about array a in main and odCopy object?
		System.out.println("\nArray a in main method is");
		displayInfo(a);
		
		System.out.println("\nA duplicate object of od");
		odCopy.displayInfo();
		
	}
}