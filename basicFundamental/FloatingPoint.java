package basicFundamental;

public class FloatingPoint {
	
	
	public static void main(String[] args) {
		
		float num1 = 100f;
		float num2= 300f;
		System.out.println(num1);
		System.out.println(num2);
		
		double num3 = 3333.144567894;
		System.out.println(num3);
		
		float div = num2/num1;
		float div1= num1/num2;
		System.out.println("result in floating point = "+div);
		System.out.println("Division of floating point="+ div1);
		
		double div2 = num2/num1;
		double div3 = num3/num2;
		System.out.println("result in double = "+div2);
		System.out.println("result in double="+ div3);
	}

}


