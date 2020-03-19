package inheritance;

public  class ACircle { //FINAL KEYWORD::Once the class declared as final,we cannot extend in any of the classes.
	
	final static double pi=3.14;
	 int radius; 
	
	
	ACircle(int a){
		radius=a;
		System.out.println("value of ACircle :"+a);
		}
	
	
	final void circle() {
		System.out.println("Area of the circle is:"+(pi * radius * radius));
	}
	

	public static void main(String[] args) {
		// ACircle is a grand parent//
		ACircle A1=new ACircle(4);
		A1.circle();
		//A1.pi=12;Once declared variable as final,we cannot change value anywhre.
		
		
		
		

	}

}
