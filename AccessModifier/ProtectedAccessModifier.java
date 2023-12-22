package AccessModifier;
// Protected Access Modifier= Whenever we use Protected as access modifier then it can be used anywhere in class,it means we can call method1 and method2 anywhere we want 
//in class, different class from same package but we cannot use it in different packages and class, it means we cannot call method1 and method2 there
public class ProtectedAccessModifier {
	
	protected static String s= "Protected Modifer";
	
	protected static void Method1() {
		System.out.println("My Name is Priyanka");
	}

	protected void Method2() {
		
		System.out.println("Priyanka Ingle");
	}
	
	public static void main(String[] args) {
		System.out.println(s);
		
		Method1();
		
		ProtectedAccessModifier protectedaccessmodifier = new ProtectedAccessModifier();
		protectedaccessmodifier.Method2();
	}
	
}
