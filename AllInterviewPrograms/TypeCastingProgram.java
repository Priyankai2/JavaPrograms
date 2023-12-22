package AllInterviewPrograms;

public class TypeCastingProgram {
public static void main(String[] args) {
	
	byte b = 10;
	short b1 = 20;
	byte sum = (byte)(b+b1);
	short s = (short) (b+b1);
	System.out.println(sum);
	System.out.println(s); 
	
	int i =100;
	short s1 = (short) (i);
	System.out.println(s1);
}
}
