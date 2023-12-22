package String;

public class StringProgramMethod {
	
public static void main(String[] args) {
	// Indexof method	
	String s = "DayTodayDay";
	System.out.println("First D = "+s.indexOf('D')); // Index of method gives index of mentioned letter// DayTodayDay
	System.out.println("First a = "+s.indexOf('a'));//  s.indexOf(String str)                          // 012345678910
	
	System.out.println("First a = "+s.indexOf('a',6));// s.indexOf(String str,int fromindex ))// this method gives index from mentioned integer value 
	                                                  // (a,6) gives 6 because the index of a from 6 is 6 only ,same for others
	System.out.println("First a = "+s.indexOf('a',0)); // this means it will give you first index of a after 0 = 1 same for others                                               
	
	
	//First ,middle and last index
	
	System.out.println("First index y = "+s.indexOf('y'));// 2 //this will give first index of y
	
	System.out.println("Middle index y = "+s.indexOf('y',6));// 7//This method will give you middle index from mentioned integer
	
	System.out.println("Last index y = "+s.lastIndexOf('y'));// 10 // This method will give you last index 
	
	System.out.println("Last index y = "+s.lastIndexOf('y',8));//before 8 index of y is 7 //this method gives the index of previous index of metioned letter
	
	System.out.println("Last index a = "+s.lastIndexOf('a',5));// index of a is 1 from 5 read from last to first
	
	//Length
	
	  System.out.println("Length = "+s.length()); // length give you actual length of string
	  System.out.println(s.charAt(5));
	  System.out.println(s.charAt(5)+"life"); //dlife//method add mentioned string after charAt interger value //index of d is 5 so after d add life
	  System.out.println(s); // this will show original string
	  
	 // Replace
	  System.out.println("Length = "+s.replace('d', 'm'));
	  
	  System.out.println("Length = "+s.replace('a', '$'));
	  
	  System.out.println("Length = "+s.replace('y', '1'));
	  
	 // Split method -DayTodayDay
	  
		String str[] = s.split("T");   // Split method split the string from mentioned letter
		System.out.println(s.length());
	    System.out.println(str[0]); // here DAY is 0th array and OdayDay is 2nd array Day-str[0],odayDay -str[1]
		System.out.println(str[1]); // it will not consider the letter from we want to split the string// here T is not considered
	  
		String str1[] = s.split("y");  
		System.out.println(str1[0]); // here DAY is 0th array and OdayDay is 2nd array//Da-str[0],
	    System.out.println(str1[1]); // it will not consider the letter from we want to split the string// here y is not considered//Toda -str[1]
	    System.out.println(str1[2]);//Da -str[2]
	    
	  // Split with ???
	    
	    String[] str2 = s.split("a", 3);// This method split the string in 2 parts//d
		System.out.println(str2[0]); // 
		System.out.println(str2[1]);
	  
		//Substring method ??
		
        System.out.println("Substring from index = "+s.substring('2'));// DayTodayDay= from y it will split string from y index-1 =D
		
		System.out.println("Substring from index and last Index = "+s.substring(2,7));// DayTodayDay= from y it will split string from y index-1 =yTod

		
	// toCharArray Method
		String str3 = new String("Name");
		char[] ch = str3.toCharArray(); //Convert string into character array using this method
		System.out.println("String length = "+str3.length());
		System.out.println("Array Length = "+ch.length);
			
	// Length - measures length of string//method shows that space is also considered in length  
		
		String a = " App le ";
		System.out.println(a+" = "+a.length());
		
	// Trim -Method which can trim/remove the space and show actual string 
		
		a = a.trim();
		System.out.println(a+" = "+a.length());// consider String a = Apple // removed spaces
		
		String b = "3.111";
		System.out.println("Any value in String = "+b);
		
 // parse - here we can storing string into double //
		
		double d = Double.parseDouble(b);
		System.out.println(d+" = "+d);
		
		
	
	                //0123456789
		/*String s = "proprogram";
		
		  System.out.println("First R = "+s.indexOf('r'));
		  
		  System.out.println("Middle R = "+s.indexOf('r', 5));
		  
		  System.out.println("Last R = "+s.lastIndexOf('r'));
		  
		  System.out.println("Middle Last R = "+s.lastIndexOf('r',3));
		  
		  System.out.println("Length = "+s.length());
		  System.out.println(s.charAt(5)+"hi");
		  System.out.println(s);
		 
		
		  System.out.println(s.replace('p', '$'));
		  
		  System.out.println(s.replaceAll("ro", "&@"));
		  
		  System.out.println(s.replaceFirst("r", "!"));
		 
		String str[] = s.split("g");
		System.out.println(s.length());
		//System.out.println(str[0]);
		//System.out.println(str[1]);
		
		String[] str1 = s.split("g", 2);
		//System.out.println(str1[0]);
		//System.out.println(str1[1]);
		
		System.out.println("Substring from index = "+s.substring(4));
		
		System.out.println("Substring from index and last Index = "+s.substring(4,7));

		char[] ch = s.toCharArray(); //Convert string into character array using this method
		System.out.println("String length = "+s.length());
		System.out.println("Array Length = "+ch.length);
		
		String a = " App le ";
		System.out.println(a+" = "+a.length());
		a = a.trim();
		System.out.println(a+" = "+a.length());
		
		String b = "3.111";
		System.out.println("Any value in String = "+b);
		
		double d = Double.parseDouble(b);
		*/ //System.out.println(d);
		
		
	}

}
	
	


