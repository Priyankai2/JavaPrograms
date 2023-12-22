package basicFundamental;

public class FirstProgram {
	

public static void main(String[] args)
{
	//System.out.println("Addition "+ (11+40));
    //datatype name/variable name =value;
	
	//byte numberfirst= 20;
	//byte numbersecond= -127;
	//System.out.println(numberfirst);
	//System.out.println(numbersecond);
	
	//short numberthird= 32767;
	//System.out.println(numberthird);
	
	//int numberfour=973045638;
	//System.out.println(numberfour);
	
	//long numberfive=12345678l;
	//System.out.println(numberfive);
	
	//System.out.println("addition of short and int- "+ (numberfirst+numberthird));
	//dataType Name/VariableName = value;
			//(int , first no datatype , second no datatype) = large capacity 
			//(4 ,1 ,8) = 8
			byte numberFirst = 127;
			byte numberFirst1 = 110;
			int add = numberFirst + numberFirst1; 
			System.out.println("Addition message = "+ add);
			
			short numberSecond = 32767;
			System.out.println(numberSecond);
			System.out.println("Addition of byte and short = "+ (numberFirst+numberSecond));
			
			
			int numberThree = 9874563;
	
			System.out.println(numberThree);
			System.out.println("Addition of byte and int = "+ (numberFirst+numberThree));
			System.out.println("Addition of short and int = "+ (numberSecond+numberThree));
			
			long numberFour = 6854775807l;
			System.out.println(numberFour);
			long a = numberFirst+numberFour;
			System.out.println("Addition of byte and long = "+ a);
			System.out.println("Addition of short and long = "+ (numberSecond+numberFour));
	        System.out.println("Addition of byte and int = "+ (numberThree+numberFour));
	
}


}
