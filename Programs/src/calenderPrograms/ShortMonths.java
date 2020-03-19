package calenderPrograms;

import java.text.DateFormatSymbols;

public class ShortMonths {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
DateFormatSymbols ob= new DateFormatSymbols();

String shortMonths[]=ob.getShortMonths(); //for displaying short months

//String shortMonths[]=ob.getShortWeekdays();//for displaying short weekands

for(String String:shortMonths) {
	System.out.println(String);
}
	}

}
