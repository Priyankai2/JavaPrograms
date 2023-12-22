package String;

public class Stringclass {
	public static void main(String[] args)
	{
		
		
		char[] ch = {'a','b','c','d'};
		String s3 = new String(ch);
		
		char c = s3.charAt(1); // charAt //method which gives the value at index
		System.out.println(c);
		
	
		String s1 = new String("Java");
		String s2 ="Program";
		
		int z= s2.indexOf('g');
		System.out.println("z = " +z);
		
		s1= s1.concat(s2);
		System.out.println("Value after concat = " +s1); // Concat // method which join two strings
		
	    s1= s1.toUpperCase();
		System.out.println("Value in uppercase = " +s1);// Uppercase // method which convert string in uppercase 
		
		
		String s4 = "OYO";
		s4= s4.toLowerCase();
		System.out.println("Value in Lowercase = " +s4); // Lowercase // method which convert string in lowercase
		
		System.out.println("Value of s4 = " +s4);
		
		
		boolean a= s2.contains(s4);        // Contains// Method which shows whether the mentioned 
		System.out.println(a);             // string is present in original string or not
		
		boolean b= s4.contains("OYO");
		System.out.println(b);
		
		boolean d= s4.contains("oyo");
		System.out.println(d);
		
        System.out.println(s3.compareTo("abcd"));// this compare method compares two string 
        System.out.println(s3.compareTo("abce"));//gives 0 if both are same and gives -1 if both are different
		
		System.out.println("Ignore = "+s3.compareToIgnoreCase("ABCD"));// this method ignores the case sensitive letters
		System.out.println("Ignore = "+s3.compareToIgnoreCase("ABCE"));//gives 0 if both are same and gives -1 if both are different
		
		
		boolean e = s2.equals("PROGRAM");// equals method find if the strings are matching or not if yes  gives true else false
		System.out.println(e); // false
		
		boolean f = s2.equals("Program");
		System.out.println(f); // True
		
		e = s2.equalsIgnoreCase("PROGRAM");
		System.out.println(e); // True, ignores case sensitive letter
		
		boolean g = s2.endsWith("ram"); // endswith method shows your string is ends with mentioned letters or not
		System.out.println("value = "+ g);
		
        boolean h = s2.endsWith("ran");
		System.out.println("value = "+h);// false
		
		boolean i = s3.isEmpty(); // Empty method gives whether the string is empty or not
		System.out.println("value is empty = "+i); 
		
		String s7 = new String ();
		boolean j = s7.isEmpty(); 
		System.out.println("value is empty = "+j); // true
		
		boolean k = s7.isBlank(); // Empty method gives whether the string is blank or not
		System.out.println("value is blank = "+k); // true
		
		boolean l = s1.startsWith(s2);// startswith method gives whether string start with mentioned letters or not
		System.out.println("value starts with = "+l); // false
		boolean m = s4.startsWith("o");
		System.out.println("value starts with = "+m); // true
	
		System.out.println("Length = "+s1.length());
		System.out.println("Length = "+s2.length());
		System.out.println("Length = "+s3.length());
		System.out.println("Length = "+s4.length());
		System.out.println("Length = "+s7.length());
	}
}
