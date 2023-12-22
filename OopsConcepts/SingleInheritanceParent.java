package OopsConcepts;

public class SingleInheritanceParent {
	
	public int a =121;
	
	public SingleInheritanceParent() {
		
		System.out.println("Single Inheritance Parent Constructor");  // Parent constructor
	}
	
    public SingleInheritanceParent(String s) {
		
		System.out.println("Single Inheritance Parent Constructor with parameter " +s); // parent constructor  with parameter//parameterized constructor
	}

    public void m1() {
    	
    	System.out.println("Single Inheritance Parent m1 method"); // m1 non static method
    }
    
    public static void m2() {
    	
    	System.out.println("Single Inheritance Parent m2 method");// m1 static method
    }
 
    public static void main(String[] args) {  // main method
	
    	m2();
    	SingleInheritanceParent parent = new SingleInheritanceParent();// parent class object// whenever we create object for parent it wil first call constructor then method
    	parent.m1();
}
    
}
