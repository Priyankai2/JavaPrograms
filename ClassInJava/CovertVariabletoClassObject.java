package ClassInJava;

public class CovertVariabletoClassObject
{

	public void m1() {
		
	}
	
	public static void main(String[] args) {
		// Autoboxing primitive types->object
		 byte a = 10; // variable
		 Byte a1 = a;  // object
		 
		 //Unboxing object -> primitive type
		  Byte b2 = 45; // object
		  byte b1 = b2; // variable
		  String s = "Priyanka123"; // variable and object
		  
		  Short s1 = 45; //object
		  short s2 = 32; // variable
			
			int i = 11;    // variable
			Integer i1 = i; // object
			
			byte byteValue = i1.byteValue(); // 
			//System.out.println(byteValue);
			//System.out.println(i1.compareTo(54));
			
			Integer i3 = 45;
			int a3 = i3.intValue();
			
			System.out.println("Max = "+i3.max(45, 50));
			System.out.println("Min = "+i3.min(45, 50));
			System.out.println(i3.parseInt(s));
			
			String booleanValue = "true";
			boolean v = Boolean.parseBoolean(booleanValue);
			System.out.println(v);
			
			Character c = 'a';
		  
		  
		  
	}
	
	

}
