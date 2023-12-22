package basicFundamental;

public class Array {
	
	public static void main(String[] args) 
	
	{
		// Sigle Dimentional Array
		int arrayname[]= {1,2,3,4,5,6,7,8};// Single dimensional array //single line declaration
		System.out.println(arrayname[3]);
		System.out.println("show arrayname at place 3 ="+ arrayname[3]);
		System.out.println(arrayname.length);
		
		
		int ch[] = new int[10];
		ch[0] = 10;
		ch[1] = 20;
		ch[2] = 30;                 // you can add values upto the array size ,
		                            //here arry size is 10 so we can add 10 values
		System.out.println(ch[0]);
		System.out.println(ch.length);
		
	    String str[] = {"one","two","three","four","five"};
	    System.out.println(str.length);
	    System.out.println(str[3]);
	    
	    // Two Dimentional Array
	 
	 int twoDimensional[][] = new int[3][2];// two dimensional array 3 rows 2 column
	 twoDimensional[0][0] = 11;
	 twoDimensional[0][1] = 13;
	 twoDimensional[1][0] = 14;
	 twoDimensional[1][1] = 15;
	 twoDimensional[2][0] = 16;
	 twoDimensional[2][1] = 17;
	 System.out.println("Array value= " +twoDimensional[1][1]);
	 System.out.println(twoDimensional.length * twoDimensional[0].length);
	
	 int two[][]  = { {11,12},{13,14},{15,16} };// declaration and initialization 3*2
	 
	 System.out.println(two[0][0]);
	 System.out.println(two[0][1]);
	 System.out.println(two[1][0]);
	 System.out.println(two[1][1]);
	 System.out.println(two[2][0]);
	 System.out.println(two[2][1]);
	 
	 String New[][]  = { {"a","b"},{"c","d"},{"e","f"} };// declaration and initialization 3*2	
	 System.out.println(New[2][1]);
		
	char New1[][] = {{'p','r'},{'y','a'},{'i','y'}};
	System.out.println("show char value= " +New1[1][0]);
	
	
	//Three Dimensional Array
	
	int type[][][]= new int[2][2][3];
	type[0][0][0]= 11;
	type[0][0][1]= 12;
	type[0][0][2]= 13;
	type[0][1][0]= 14;
	System.out.println(type[0][1][0]);
	
	int three[][][]= {{{1,2,3},{4,5,6}},{{7,8,9},{10,11,12}},{{13,14,15},{16,17,18}}}; 
	
	System.out.println(three[0][0][1]);
	System.out.println(three[0][1][0]);
	System.out.println(three[1][0][0]);
	System.out.println(three[1][1][0]);
	System.out.println(three[2][0][0]);
	System.out.println(three[2][1][0]);
	System.out.println(three[2][1][2]);
	//String New2[][][]  = { {"aee","bee"},{"cee","dee"},{"eee","fee","pri"} };
	//System.out.println(New2[0][1]);
	
	//char New3[][][]= {{'p','r'},{'y','a'},{'i','y','w'}};
	//System.out.println("show char value= " +New3[1][0][0]);
		
	}
	
}	 
