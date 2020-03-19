package Constructors;

public class ConstructorOverloadingTriangle {
	
	static double half=0.5d;
	double breadth;
	 double height;
	
	
	 ConstructorOverloadingTriangle(int breadth,int height){
	this.breadth=breadth;//to refer non static class variables//
	this.height=height;
	System.out.println("Area of the triangle is :"+(half * breadth * height));
	}
	
	 ConstructorOverloadingTriangle(int a,double b){
		breadth=a;
		height=b;
		System.out.println("Area of the triangle is :"+(half * breadth * height));
	}
	

	
	 ConstructorOverloadingTriangle(double a,double b){
		breadth=a;
		height=b;
		System.out.println("Area of the triangle is :"+(half * breadth * height));
	}
	
	void area() {
	
	}

	
	public static void main(String[] args) {
		
		
		// Area of Traingle//
		
		ConstructorOverloadingTriangle obj= new ConstructorOverloadingTriangle(4,5);
		ConstructorOverloadingTriangle obj1= new ConstructorOverloadingTriangle(4,7.5);
		ConstructorOverloadingTriangle obj2= new ConstructorOverloadingTriangle(2.52,5.0);
		
		obj.area();
		obj1.area();
		obj2.area();

	}

}
