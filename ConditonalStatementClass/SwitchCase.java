package ConditonalStatementClass;

import java.util.Scanner;

public class SwitchCase
{
	
	public static void main(String[] args) 
	{
		
	Scanner sc = new Scanner(System.in);
System.out.println("Enter the content = ");
	
	String num =sc.next();
	
	switch(num) {
		
		case"Google":
		{
			
			System.out.println("Search content");
			break;
		}
		
		case "Siri":
		{
			System.out.println("Speak content");
			break;
		}
	
		case "Alexa":
		{
			System.out.println("Say loudly content");
			break;
		}
	
	
	
               }
	
	}
	
}
