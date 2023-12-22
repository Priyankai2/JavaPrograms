package basicFundamental;

import java.util.Scanner;

public class ConstuctorExamples {
	
	public static void main(String[]  args)
	
	{  
		 notequalto();
		//lessThan();
		//lessThanequalTo();
		//greaterThanequalTo();
		//equalsTo();	
		//greaterThan();
	}
	
	    public static void equalsTo() 
	    {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first integer number");
		int a = scan.nextInt() ;
		System.out.println("Enter second integer number");
		int b = scan.nextInt();
		boolean result = a == b;
		System.out.println("a equalTo b "+result);
	    }
	
	
	public static void greaterThan()
	{
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter 1st short number = ");
		short num1=scan.nextShort();
		System.out.println("Enter 2nd short number = ");
		short num2=scan.nextShort();
		boolean output = num1> num2;
		System.out.println("num1 greater than num2 = "+ output);
				
	}	
	
	public static void greaterThanequalTo()
	{
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter 1st byte number = ");
		byte num1=scan.nextByte();
		System.out.println("Enter 2nd byte number = ");
		byte num2=scan.nextByte();
		boolean output1 = num1>= num2;
		System.out.println("num1 greater than equal to num2 = "+ output1);
				
	}	
	
	public static void lessThanequalTo()
	{
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter 1st float number = ");
		float num1=scan.nextFloat();
		System.out.println("Enter 2nd float number = ");
		float num2=scan.nextFloat();
		boolean output2 = num1<= num2;
		System.out.println("num1 less than equal to num2 = "+ output2);
				
	}	
	
	public static void lessThan()
	{
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter 1st long number = ");
		float num1=scan.nextLong();
		System.out.println("Enter 2nd long number = ");
		float num3=scan.nextLong();
		boolean output3 = num1< num3;
		System.out.println("num1 less than num2 = "+ output3);
				
	}
	
	public static void notequalto()
	{
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter 1st double number = ");
		Double num1=scan.nextDouble();
		System.out.println("Enter 2nd double number = ");
		Double num3=scan.nextDouble();
		boolean output4 = num1!= num3;
		System.out.println(" 1st number not equal to 2nd = "+ output4);
				
	}
	
	
}
