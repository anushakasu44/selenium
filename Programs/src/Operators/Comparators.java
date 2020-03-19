package Operators;

public class Comparators {

	public static void main(String[] args) {
		// Comparators:comparing 2 quantities: < , > , <= , >= ,==, != //
		//perform only boolean type//
		
		int x = 10;
		int y = 15;
		boolean z = x <= y;
		System.out.println(z);
		
		//we can take different datatypes//
        double d = 5.5d;
        float g = 2.258f;
        boolean h = d == g;
        System.out.println(h);
        
        
        int i = 5;
        //float: it can also be numeric value not only decimal.//
        float j = 0f;
        boolean m = i < j;
        System.out.println(m);
	
	}

}
