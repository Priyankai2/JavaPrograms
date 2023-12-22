package AllInterviewPrograms;

public class Calculator {
	
	
	public void addition() {
		
		int a = 10;
		int b= 58;
		int add = a+ b;
		System.out.println("Addition of " +a+ " and " +b+  " = " +add);
	}
	
public void Substraction() {
		
		int a = 100;
		int b= 58;
		int sub = a- b;
		System.out.println("Substraction of " +a+ " and " +b+  " = " +sub);
	}
	
	
public static void Multiplication() {
	
	int a = 10;
	int b= 58;
	int mul = a * b;
	System.out.println("Multiplication of " +a+ " and " +b+  " = " +mul);
}
	
public Calculator m1() { //if u want class object as return type then use classname as return type
	
	System.out.println("returning the class object");
	Calculator obj = new Calculator();  // created object using same name of class to access the return 
	return obj;            // object is created because it is not static so we cannot directly call m1 in main
	
}
	
public static Calculator m2() {
	
	Calculator c = new Calculator(); // For m2 no need to create object because it is static so we can directly call m2 in main
	return c;
}
	
	
	
public static void main(String[] args) {
	
	m2();
	Calculator object = new Calculator();
	object.addition();
	object.m1().addition();
	object.m1().Substraction();
	
	
	}
}
