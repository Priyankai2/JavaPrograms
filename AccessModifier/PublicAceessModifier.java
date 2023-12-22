package AccessModifier;

// Public Access Modifier= Whenever we use Public as access modifier then it can be used anywhere in program, 
//class, different class and packages and different packages, it means we can call m1 and m2 method anywhere we want 

public class PublicAceessModifier {
	
	public static String s ="ABCDEFG HIJKLMNOP";
	
	public static void  m1() {
		
		System.out.println("I love India");
	}

    public void  m2() {
    	System.out.println("I love India too");
		
	}
	
	public static void main(String[] args) {
		m1();    // to call m1 static need to call it by classname in another class
		PublicAceessModifier publicaceessmodifier = new PublicAceessModifier();
		
		publicaceessmodifier.m2(); // to call m2 non static need to create
		System.out.println(s);
	}
	
}
