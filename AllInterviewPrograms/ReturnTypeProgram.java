package AllInterviewPrograms;

public class ReturnTypeProgram {

	public static int square (int num) { //user defined methods with int return type
		int sq = num*num;
		return sq;
	}
	
	public  void m1() { //user defined methods with void return type
		int w = 100;
		String s = "java";
		System.out.println("String = "+s);
		int y = square(w);
		System.out.println("m1 method = "+y);
	}
	
	public static void m2() {
		square(4);
		ReturnTypeProgram obj = new ReturnTypeProgram();
		obj.m1();
	}
	
	
	
	
public static void main(String[] args) { //Java Method we use to call user defined methods
		
	int a = square(5);
	System.out.println("Square of a = "+a);
	
	ReturnTypeProgram obj = new ReturnTypeProgram();
	obj.m1();
	m2();
 }
}
