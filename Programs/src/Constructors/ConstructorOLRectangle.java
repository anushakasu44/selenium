package Constructors;

public class ConstructorOLRectangle {
	
	double length;
	double breadth;
	
	ConstructorOLRectangle(int a,int b){
		length=a;
		breadth=b;
		System.out.println("Area of the rectangle is :"+a * b);
	}
	
	ConstructorOLRectangle(double a,int b){
		length=a;
		breadth=b;
		System.out.println("Area of the rectangle is :"+a * b);
	}
	
	ConstructorOLRectangle(int a,double b){
		length=a;
		breadth=b;
		System.out.println("Area of the rectangle is :"+a * b);
	}
	
	ConstructorOLRectangle(float a,int b){
		length=a;
		breadth=b;
		System.out.println("Area of the rectangle is :"+a * b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorOLRectangle s1=new ConstructorOLRectangle(3,9);
		ConstructorOLRectangle s2=new ConstructorOLRectangle(4.5,8);
		ConstructorOLRectangle s3=new ConstructorOLRectangle(1,2.5);
		ConstructorOLRectangle s4=new ConstructorOLRectangle(3.25f,8);
		
	}

}
