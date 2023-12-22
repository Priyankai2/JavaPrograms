package AccessModifier;
// Private Modifier = Whenever we use private as access modifier then it can be used anywhere in class, we can call m1 & m2 in same class only 
// but cannot use in any other class from Same package, any other class from other package,it means we cannot call m1 and m2 method other class and packages 
public class PrivateAccessModifier {
	
private static String s ="Private Modifier";
	
	private static void  m1() {
		
		System.out.println("My Country name is India");
	}

    private void  m2() {
    	System.out.println("I love India ");
		
	}
	
	public static void main(String[] args) {
		m1();    // to call m1 static need to call it by classname in another class
		PrivateAccessModifier privateacceessmodifier = new PrivateAccessModifier();
		
		privateacceessmodifier.m2(); // to call m2 non static need to create
		System.out.println(s);
	}

}
