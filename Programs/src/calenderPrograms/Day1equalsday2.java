package calenderPrograms;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Day1equalsday2 {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
SimpleDateFormat sf=new SimpleDateFormat("yyyy/MM/dd");


Date d1=sf.parse("2016/02/20");
Date d2=sf.parse("2016/02/21");

        if(d1.equals(d2)) {
	    System.out.println("d1 is equal to d2");
        }
	    else if(d1.after(d2)) {
		System.out.println("d1 is greater than d2");
	    }
		else if(d1.before(d2)) {
			System.out.println("d1 is less than d2");
		}
	
	}

	}


