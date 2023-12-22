package ConditonalStatementClass;

import java.util.Scanner;

public class ChainofIfElseStatement {
	
	public static void main(String[] args)
	
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter you height = ");
		int height =sc.nextInt();
		
		if (height >= 150)
		{
			System.out.println("you are 5 inch");
		}
		
		else if (height > 140 && height < 150 )
		
		{
			System.out.println("you are 4 inch");
			
		}
			
		else if (height < 140 && height > 130)
			
		{
			System.out.println("you are 3 inch");
			
		}	
			
     else 
			
		{
			System.out.println("you are shorter than normal");
			
		}	
			
	}
	
	

}
