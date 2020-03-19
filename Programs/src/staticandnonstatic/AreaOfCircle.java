package staticandnonstatic;

public class AreaOfCircle {
	
	static double pi = 3.14;
	int radius ;
	
	void Area() {
		System.out.println("Area of circle is :"+(pi * radius * radius));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AreaOfCircle obj2 = new AreaOfCircle();
		obj2.radius= 10;
		obj2.Area();
	}

}
