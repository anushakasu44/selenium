package calenderPrograms;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class DateFormat {

	public static void main(String[] args) throws ParseException {
		                                                     //Creating obj for SimpleDateFormat
       SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
     
       
//Method 1: date format from int to string
       
       // String date= "2015-05-15";
     //  System.out.println(sdf.parse(date));  //Parse:converting one value to other type//
       
  
//Method 2:simple date format in interger      
       
       String date1= sdf.format(new Date());
       System.out.println(date1);
	}
}