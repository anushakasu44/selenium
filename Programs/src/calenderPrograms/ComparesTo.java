package calenderPrograms;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ComparesTo {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub

		SimpleDateFormat s1=new SimpleDateFormat("yyyy/MM/dd");
		Date d1=s1.parse("2016/02/21");
		Date d2=s1.parse("2016/02/20");
		
		
		if(d1.compareTo(d2)<0) {
			System.out.println("d1 is less than d2");
		}
		if(d1.compareTo(d2)>0) {
			System.out.println("d1 is greater than d2");
	}
		if(d1.compareTo(d2)==0) {
			System.out.println("d1 is equal d2");

}
	}
}
