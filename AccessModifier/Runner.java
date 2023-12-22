package AccessModifier;

import OopsConcepts.GetterSetterMethod;

public class Runner {
	
	public static void main(String[] args) {
		
		System.out.println(DefaultAccessModifier.s);
		DefaultAccessModifier.method1();
		
    	DefaultAccessModifier defaultaccessmodifier = new DefaultAccessModifier();
    	defaultaccessmodifier.method2();
    	
		
		
    	GetterSetterMethod obj = new GetterSetterMethod();
		obj.setA(12222);
		
		System.out.println(obj.getA());
		
		
		
		
		
	}

}
