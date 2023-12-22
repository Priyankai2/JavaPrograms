package basicFundamental;



public class Addition {
	
	public static void main(String[] args)
	{
		byte a= 10;
		short b= 20;
		int c = 30;
		long d= 4000l;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
		int e= a+b;
		long f= c+d;
		long g= a+b+c+d;
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
		
		System.out.println("Addition of int and long="+ f);

		System.out.println("Addition of short,byte,int and long="+ g);
		
		
		
		System.out.println("Addition of byte and short="+ (a+b));
		System.out.println("Addition of byte and int="+ (a+c));
		System.out.println("Addition of byte and long="+ (a+d));
		
		
		System.out.println("Addition of int and short="+ (c+b));
		System.out.println("Addition of int and long="+ (c+d));
		
		System.out.println("Addition of long and short="+ (d+b));
		System.out.println("Addition of long and byte="+ (d+a));
		
		
		//short h= a+a;
		//System.out.println(h);
		
		//PublicAceessModifier.m1(); 
		
	    //PublicAceessModifier publicaceessmodifier = new PublicAceessModifier();
		
		//publicaceessmodifier.m2();
		
		//PrivateAccessModifierm1();    // to call m1 static need to call it by classname in another class
		//PrivateAccessModifier privateacceessmodifier = new PrivateAccessModifier();
		
		//privateacceessmodifier.m2();
		
        //ProtectAccessModifier.m1();
		
		//ProtectedAccessModifier protectedaccessmodifier = new ProtectedAccessModifier();
		//protectedaccessmodifier.m2();
		
		//DefaultAccessModifier.method1();
    	//DefaultAccessModifier defaultaccessmodifier = new DefaultAccessModifier();
    	//defaultaccessmodifier.method2();
		
		/*
		 * GetterSetterMethod obj = new GetterSetterMethod(); obj.setA(12222);
		 * 
		 * System.out.println(obj.getA());
		 */
		
		
	}

}
