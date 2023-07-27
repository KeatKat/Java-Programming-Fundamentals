// An array is an instance variable
//
// To check if an array is symmetric
//
// Test name: TestOneD_3a.java

class OneD
{
	private int [] a;
	
	public OneD(int [] a)
	{
		this.a = new int [a.length];
		for(int i = 0; i < a.length; i++)
			this.a[i] = a[i];
	}
	
	public OneD(OneD od)
	{	
		this(od.a);
	}
	
	//to check if an array is symmetric
	public boolean isSymmetric()
	{
		int left = 0;
		int right = a.length - 1;
		boolean ok = true;
		
		while(ok && left < right)
		{
			if(a[left] != a[right])
				ok = false;
			else
			{
				++left;
				--right;
			}
		}
		
		return ok;
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

class TestOneD_3a
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
		int [] a1 = {1, 2, 3, 4, 5, 5, 4, 3,  2, 1};
		int [] a2 = {1, 2, 3, 4, 5, 4, 3,  2, 1};
		int [] a3 = {1, 2, 3, 4, 5, 6, 4, 3,  2, 1};
		
		//construct object of OneD
		OneD od1 = new OneD(a1);
		
		System.out.println("Given the following array");
		od1.displayInfo();
		
		if(od1.isSymmetric())
			System.out.println("==> It is symmetric");
		else
			System.out.println("==> It is not symmetric");
		
		//construct object of OneD
		OneD od2 = new OneD(a2);
		
		System.out.println("\nGiven the following array");
		od2.displayInfo();
		
		if(od2.isSymmetric())
			System.out.println("==> It is symmetric");
		else
			System.out.println("==> It is not symmetric");
		
		//construct object of OneD
		OneD od3 = new OneD(a3);
		
		System.out.println("\nGiven the following array");
		od3.displayInfo();
		
		if(od3.isSymmetric())
			System.out.println("==> It is symmetric");
		else
			System.out.println("==> It is not symmetric");
		
	}
}