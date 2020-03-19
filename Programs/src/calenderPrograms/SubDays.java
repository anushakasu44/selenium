package calenderPrograms;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class SubDays {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
SimpleDateFormat ob=new SimpleDateFormat();
Calendar ob2=Calendar.getInstance()	;

	System.out.println("before days :"+ob.format(ob2.getTime()));
	
ob2.add(Calendar.DAY_OF_YEAR, -5);

System.out.println("Sub after days :"+ob.format(ob2.getTime()));


	}

}
