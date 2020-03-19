package inheritance;

public class BTriangle extends ACircle{
	
	static double half =0.5;
	int breadth;
	int height;
	
	BTriangle(int breadth,int height){
		super(breadth);
		this.breadth=breadth;
		this.height=height;
	
	}
	
	/*void circle() { Once method declared as final,we cannot override in any object class.
		System.out.println("Area of the circle is:"+(pi * radius * radius));
	}*/
	
	
	
	void rectangle() {
		System.out.println("Area of the rectangle is :"+(half * breadth * height));
	}

	public static void main(String[] args) {
		// BTriangle is a parent class//
		BTriangle B2 = new BTriangle(4,5);
		B2.rectangle();
		B2.circle();
		
		System.out.println(B2 instanceof ACircle);
	}

}
