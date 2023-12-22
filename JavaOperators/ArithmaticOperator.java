package JavaOperators;

public class ArithmaticOperator 
{  
	//  + - * / % arithmetic operators
	
	public static void main(String[] args)
	
{
 addition()	;	
 substraction();
 multiplication();
 division();
 mod();


}
 public static void addition() 
		
{ int num1= 200;
  int num2= 300;
  int output =num1+num2;
  System.out.println("addition of " + num1 + " and " + num2 + " = " +output);
} 
		
 public static void substraction() 
	
 { int num1= 400;
   int num2= 300;
   int output1 =num1-num2;
   System.out.println("Substraction of " + num1 + " and " + num2 + " = " +output1);
 } 
 		
 public static void multiplication() 
	
 { float num1= 2.4f;
   float num2= 3.5f;
   float output2 =num1*num2;
   System.out.println("Multiplication of " + num1 + " and " + num2 + " = " +output2);
 } 
 		
 public static void division() 
	
 { double num1= 200;
   double num2= 300;
   double output3 =num1/num2;
   System.out.println("Division of " + num1 + " and " + num2 + " = " +output3);
 } 
 		
 public static void mod() 
	
 { byte num1= 4;
   byte num2= 2;
   int output =num1%num2;
   System.out.println("mod of "+ num1 + " and " + num2 + " = " +output);
 } 
 		

}
