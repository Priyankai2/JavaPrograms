package ConditonalStatementClass;

import java.util.Scanner;

public class NestedIfElseStatement {
	
	public static void main(String[] args) 
	{
		
		Scanner sb = new Scanner (System.in); // scanner class to take inputs from console
		System.out.println("Who are you ? ");
		String me = sb.next();  //
		
		if(me.equalsIgnoreCase("Human")) {
			
			System.out.println("Are you Male or Female ? ");
			String gender = sb.next();                // this method is used to check what is next if not then what next
			
			if(gender.equalsIgnoreCase("Male"))
			{
				System.out.println("Go to the Game Zone");
			}
			else {
				System.out.println("Go to the Fashion Zone");
			}
			
		}
		else {
			
			System.out.println("Are you dog or cat ? ");
			String pet = sb.next();
			
			if(pet.equalsIgnoreCase("cat"))
			{
				System.out.println("Pet is cat");
			}
			else {
				System.out.println("Pet is dog");
			}
			
		}
		
		
  }
	
	
}
