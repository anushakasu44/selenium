package calenderPrograms;

import java.text.SimpleDateFormat;
import java.util.Calendar;


public class AddDays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
SimpleDateFormat ob=new SimpleDateFormat();

Calendar ob1=Calendar.getInstance();
System.out.println("before days "+ ob.format(ob1.getTime()));

ob1.add(Calendar.DAY_OF_MONTH, 5);
System.out.println("After days "+ob.format(ob1.getTime()));


	}

}
