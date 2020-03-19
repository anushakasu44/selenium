package Constructors;

public class ConstructorForCircle {
	static double pi= 3.14;
	int radius;
	
	ConstructorForCircle(int radius){
		this.radius=radius;//this is used to call the global variables of non static memebers of the class//
		System.out.println("Area of the circle is:"+(pi * radius *radius));
	}
	
	
	

	public static void main(String[] args) {
		// constructor for circle//
		
		ConstructorForCircle obj= new ConstructorForCircle(5);


	}

}
