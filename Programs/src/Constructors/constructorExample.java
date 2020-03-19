package Constructors;

public class constructorExample {
	
	
	static float pi = 3.14f;
	int radius;
	double length;
	
	constructorExample(int a) {
		radius=a;
	}
	
	void area(){
	
		System.out.println("Area of circle is:"+(pi * radius * radius));
	
	}

	public static void main(String[] args) {
		// Area of square//
		constructorExample obj= new constructorExample(6);
		obj.area();
	}

}
