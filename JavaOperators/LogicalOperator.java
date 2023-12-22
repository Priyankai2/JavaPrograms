package JavaOperators;

public class LogicalOperator {
	
	//Logical Operators
	//&&(AND) ||(OR)
	//Conditions
	//true && true => true
	//true && false => false
	//false && true => false
	//false && false => false 
	//true || true => true
	//true || false => true
	//false || true => true
	//false || false => false
	
public static void main(String[] args)
{
			
	int  value = 10;		
	System.out.println(value<20 && value<50); // both conditions are true =true
	System.out.println(value<20 && value>50); // one condition is true and one is false =false
	System.out.println(value>20 && value<50); // one condition is true and one is false =false
	System.out.println(value>20 && value>50); // both conditions are false =false
	
    float num= 2.32f;
    System.out.println(num>2.0 || num<5.011); // both conditions are true =true
    System.out.println(num>2.0 || num<5.011); // one condition is true and one is true = true
    System.out.println(num>2.0 || num>5.011); // one condition is true and one is true = true
    System.out.println(num<2.0 || num>5.011); // both conditions are false =false
	


}
	
}
	
	
	
	
	
	
	
	
	
	
	


