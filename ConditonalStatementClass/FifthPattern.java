package ConditonalStatementClass;

public class FifthPattern {
	
	public static void main(String[] args) {
		//int a = 1;
		for (int i = 0; i < 5; i++) {   // this for loop to select how many rows do you want as per pattern so i++
			char a = 'a';
			//System.out.println("Actual value of a = "+a);
			for (int j = 4; j > i; j--) {
				System.out.print(" ");   // this for loop is to add spaces as per patter need, it will add 4 spaces and the decrease it by 1 so j--
			}
			
			for (int k = 0; k <= i; k++) { // this for loop is added to incerment the vale of a and to take next value like b c d e
				System.out.print(a++ +" ");
				
			}
			//System.out.println("Updated value of a = "+a);
			System.out.println();
		}

	}
	
	/*public static void main(String[] args) 
	{

		for (int i = 0; i < 5; i++) 
		{               // 5 rows
			char a = 'a';         // start the pattern with a
			int b = 1;                 // also need 1 to add in pattern
			
			for (int j = 4; j > i; j--) 
			{  // start to add the space by 4 -3-2-1-0
				System.out.print(" ");
			}
			
			if (i % 2 == 0) 
			{                   // here we are checking if i%2 == 0 ten print characters
				for (int k = 0; k <= i; k++) 
				{          // ex. 1%2 is not equal to 0 so print char
					System.out.print(a++ + " ");
				}
				
			} else 
			{
				for (int k = 0; k <= i; k++) 
				{ // // here we are checking if i%2 == 0 ten print characters else print numbers
					System.out.print(b++ + " "); // ex. 2%2 is equal to 0 so print number
				}
			}
			System.out.println();
		}

	}*/
}

