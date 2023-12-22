package String;

public class ImmutableConcept {
	
	public static void main(String[] args)
	
	{
		String s ="hello";
		
		String s1= s.concat("priyanka");// immutable string// not directly change//not editable
		System.out.println(s1);           //slow and consume more memory// object class ki equals method usable// cannot use other data types or concat
		
		StringBuffer s2 = new StringBuffer("mine"); //mutable string buffer// directly change with methods//editable
		s2.append("me");      //append method join the string
		                                         //faster and consume more memory// object class ki equals method not usable(need same object to equal)//can use other data types or concat
		System.out.println("StringBuffer = " +s2);
		System.out.println("Capacity = " +s2.capacity());
		
		s2.delete(1,2);  // delete method deletes the string letter as per index
		System.out.println("StringBuffer after delete = " +s2);
		
		s2.insert(1, "i"); // insert method inserts the string letter as per index and mentioned letter
		System.out.println("StringBuffer after insert = " +s2);
		System.out.println("StringBuffer length = " +s2.length());
		
		s2.replace(2, 6, "hello");// need to give starting index from where you want to 
		                           // replace and end index +1 of replace string
		System.out.println("StringBuffer after replace = " +s2);
		System.out.println("StringBuffer after replace = " +s2.reverse()); // method reverses the string
	
	}
	

}
