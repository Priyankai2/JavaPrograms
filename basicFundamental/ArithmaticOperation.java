package basicFundamental;

public class ArithmaticOperation {
	
	public static void main(String[] args)
	{
		byte num1= 10;
		short num2= 20;
		int num3 = 30;
		long num4= 4000l;
		
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
		
		long add = num1+num2+num3+num4;
		int sub = num2-num1;
		long mul= num1*num2;
		int div = num3/num1;
		
		System.out.println("Addition ="+ add);
		System.out.println("Substraction ="+ sub);
		System.out.println("Multiplication ="+ mul);
		System.out.println("Division ="+ div);
	}
	
	
	

}
