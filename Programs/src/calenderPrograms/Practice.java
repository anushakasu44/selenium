package calenderPrograms;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Practice {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
SimpleDateFormat sd=new SimpleDateFormat("yyyy/MM/dd");
Calendar ob= Calendar.getInstance();

String date="2020/02/04";
System.out.println((sd.parse(date)));
System.out.println((sd.parse(date+1)));
	}

}
