package JavaOperators;

public class UnaryOperator 


{

	public static void main(String[] args) 
	{
		byte b = 10;
		System.out.println(b);     // b =10
		
		++b;  //pre Increment	
		System.out.println("pre increment = " +b); // b= 11 // value increase after 1st attempt
		System.out.println("pre increment = " + ++b); //12
		System.out.println("pre increment = " +  ++b); // b= 13
		++b;
		System.out.println("pre increment = " +b); //14
		
		
		b++;   //postIncrement	//14
		 
		System.out.println("post increment = " +b);// b= 14  // value increase after 2nd attempt
		System.out.println("post increment = " + b++);// b= 15
		System.out.println("pre increment = " +b); //16
		System.out.println("pre increment = " +b); //16
		b++; //
		System.out.println("pre increment = " +b); // 17
		System.out.println("pre increment = " +b); //17
		
		
		//System.out.println(b);
		
		// ++b; //pre-increment
		//System.out.println("pre-increment = " + ++b);

		//int i = 5;
		// i--;
		// System.out.println(i--);
		//System.out.println(--i);
	}












}
