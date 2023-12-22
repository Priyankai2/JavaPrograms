package JavaOperators;

public class TernaryOperator {
	
	public static void main(String[] args) 
	
	{
		//variable = expression/condition ? true result output : false result output	
			
		    String i = 10 < 20 ? "10 is less than 20" : "10 is not less than 20";
			System.out.println(i);
		    
			String ch ="Priyanka";
	        String name = ch == "Priyanka"? "String is matching": "String is not matching";
	        System.out.println(name);
	
	        int a= 11;
	        int b =20;
	        int c = a<b ? 10:20;
	        System.out.println("c=" +c);
	    	
	
	}

	
	
}
