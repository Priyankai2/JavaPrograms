package AccessModifier;

public class FinalKeyword {

	
	static final void m1() {
		System.out.println("Statisc final keyword");
	
}
	
	
	final void m2() {
		System.out.println("keyword");
	}
	
	final static char c = 'a';
	
	public static void main(String[] args) {
		m1();
		FinalKeyword obj = new FinalKeyword();
		obj.m2();
	
		//final static char c ='s';
		
		
		
	}
	
	
}
