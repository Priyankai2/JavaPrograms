package JavaOperators;

//import java.util.Scanner;

public class RelationalOperator 
{
   //> < >= <= == !=  relational operators
	
	public static void main(String[] args)
	
	{
		greaterThan();
		greaterThanequalsto();
		lessThan();
		lessThanequalsto();
		equalsTo();
		notequalsTo();
		
		
	}
	
	public static void greaterThan()
	{
		byte a= 10;
		byte b= 20;
		boolean c= a>b;
		System.out.println("a greater than b = " + c);
	}	
	
	public static void lessThan()
	{
		int a= 1000;
		int b= 2000;
		boolean result= a<b;
		System.out.println("a less than b = " + result);
	}	
	
	public static void lessThanequalsto()
	{
		float a= 10.10f;
		float b= 20.201f;
		boolean output= b<= a;
		System.out.println("b is less than equal to a = " + output);
	}	
	
	public static void greaterThanequalsto()
	{
		double num1= 20.10000;
		double num2= 20.20000;
		boolean result1=num2>=num1;
		System.out.println("num2 greater than equals to num1 = " + result1);
	}	
	
	public static void equalsTo()
	{
		//Scanner scan = new Scanner(System.in);
		short x= 10;
		short y=10;
		boolean z= x==y;
		System.out.println("x equal to y = " + z);
		
	}

	public static void notequalsTo()
	{
		//Scanner scan = new Scanner(System.in);
		short x= 10;
		short y=20;
		boolean z1= x!=y;
		System.out.println("x not equal to y = " + z1);
	
	}
}