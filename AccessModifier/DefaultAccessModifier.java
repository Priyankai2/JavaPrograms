package AccessModifier;
// Default Access Modifier= Whenever we use Default as access modifier then it can be used anywhere in same class and other class from same package
// but cannot used in other packages and class.


public class DefaultAccessModifier {
	static String s = "Default Modifier";
	static void method1() {
		
		System.out.println("Chocolates are sweet");
	}

    void method2() {
		
		System.out.println("I love sweets");
	}
	
    public static void main(String[] args) {
		System.out.println(s);
    	method1();
    	DefaultAccessModifier defaultaccessmodifier = new DefaultAccessModifier();
    	defaultaccessmodifier.method2();
    	
    	
	}
	
}
