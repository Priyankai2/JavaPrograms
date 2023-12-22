package OopsConcepts;

public class GetterSetterMethod {  // hi method apn private variables other package and classes madhe access karnyasathi use hote
	
	private int a ;

	public int getA() {  // get kernya sathi a chi value
		return a;
	}

	public void setA(int b) { // set kernya sathi a chi value
		a = b;
	}
	
	public static void main(String[] args) {
		
		GetterSetterMethod obj = new GetterSetterMethod();
		obj.setA(12222);  // set keli a chi value
		
		System.out.println(obj.getA()); //get keli a chi value
		
	}
	
	

}
