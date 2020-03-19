package AllRemPrograms;

import java.util.Scanner;

public class ScannerLeapYear {

public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	int numdays=365;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter leap year: ");
	
	int year=sc.nextInt();
	
	if(year%4==0) {
		numdays++;
	}
	System.out.println("result:" +numdays);

	}
}

