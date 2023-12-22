package ClassInJava;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Year;
import java.util.Calendar;
import java.util.Date;

public class DateClass {

public static void main(String[] args) throws ParseException
{
	Date date = new Date(); // date cha object create kela
	
	SimpleDateFormat simple = new SimpleDateFormat("dd/MM/yyyy"); // SimplaeDateFormat cha object create kela ani tyat date cha format set kela
	
	String s = simple.format(date); // todays date
	String s1= "21/12/2023"; // set the input date
	System.out.println("Todays Date = " +s);
	System.out.println("Input Date = " +s1);
	
	Date d = simple.parse(s);   // parsing the value of s into d
	Date d1 = simple.parse(s1); // parsing the value of s1 into d1
	
	System.out.println(d.after(d1));// checking whether the todays date d is after the date d1
	System.out.println(d.before(d1)); //checking whether the input date d is before  d1
			
			
			
	/*
	 * Calendar cal = Calendar.getInstance(); for (int i = 0; i < 12; i++) {
	 * cal.set(Calendar.MONTH, i); cal.set(Calendar.DATE, i + 2); Date d =
	 * cal.getTime(); System.out.println(simple.format(d));
	 * 
	 */		
			
	
	
	
	
	
}	
	
	
	
}
