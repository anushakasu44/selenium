package calenderPrograms;

import java.util.Calendar;
//import java.util.Calendar;
import java.util.Date;

public class DateProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		Calendar obj = Calendar.getInstance(); //Creating calendar obj
  
  
 //Method1:
		Date date=new Date();   //for printing today's date
		System.out.println(date); 
System.out.println(date instanceof Date);//date:obj instance of Date:class::returns true/false 
//Method 2:
		obj.set(Calendar.YEAR, 2019);// for setting and reading date
	    obj.set(Calendar.MONTH, 2);
		obj.set(Calendar.DATE, 22);
		
		System.out.println(obj.get(Calendar.YEAR)); 
		System.out.println(obj.get(Calendar.MONTH));
		System.out.println(obj.get(Calendar.DATE));
		
//Method 3	
		System.out.println(obj.get(Calendar.YEAR)); //Only for reading date
		System.out.println(obj.get(Calendar.MONTH));
		System.out.println(obj.get(Calendar.DATE));
		
	
	}

	
}
