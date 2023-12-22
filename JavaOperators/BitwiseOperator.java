package JavaOperators;

public class BitwiseOperator {
	
	//&(AND) |(OR)
	//true & true => true
	//true & false => false
	//false & true => false
	//false & false => false 
	//true | true => true
	//true | false => true
	//false | true => true
	//false | false => false
	
		
public static void main(String[] args) 

{
			
	short a = 200;		
	System.out.println(a<20 & a<50); // both conditions are false = false
	System.out.println(a>20 & a<50); //	one condition is true and one is false = false
	System.out.println(a<20 & a>50); // one condition is true and one is false = false
	System.out.println(a>20 & a>50); // both conditions are true = true

    double num = 3.14;
    System.out.println(num <3.00 | num <5.10); // one condition is true and one is false = true
    System.out.println(num >3.00 | num <5.10); // both conditions are true = true
    System.out.println(num <3.00 | num >5.10); // both conditions are false = false
    System.out.println(num >3.00 | num >5.10); // one condition is true and one is false = true

}

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
