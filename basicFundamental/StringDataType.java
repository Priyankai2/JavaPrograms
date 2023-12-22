package basicFundamental;

public class StringDataType {
	
	public static void main(String[] args)
	{
		
	String s ="aaaaaaaaaaaaaaaaaaaaaaaaavvvvvvvvvvvvvvvvvvvvvvvvvvvbbbbbbbbbbbbbbbbbbb"	;
		
	System.out.println ("show string name\n"+ s);	
	
    String s1 = "java"; //literal way
		 // System.out.println(s);
		  
    String str = new String("program"); //object creation
		  //className object = new ClassName();
		  
	System.out.println(s1+str);
    String name= new String("Priyanka");
	//System.out.println("show s2 string= " + s2);
	
	String str1= name;
	System.out.println(name);
	System.out.println(str1);
	
	String str2[][]= {{"abcderg", "hijklmnop"},{"pqrstuv","wxyz"}};
	System.out.println("show array content= " + str2[0][1]);
	System.out.println("show array content= " + str2[1][1]);
	
	

	}

}
