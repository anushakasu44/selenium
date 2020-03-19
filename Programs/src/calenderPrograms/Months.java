package calenderPrograms;

import java.text.DateFormatSymbols;



public class Months {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
DateFormatSymbols ob=new DateFormatSymbols();


String months[]=ob.getMonths();

for(String String:months) {
	System.out.println(String);
}
	
	}

}
