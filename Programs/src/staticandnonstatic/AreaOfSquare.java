package staticandnonstatic;

public class AreaOfSquare {
	
	
	int length;
	int width;
	
	void area() {
		System.out.println("Area of the square is:"+(length * width));
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AreaOfSquare obj = new AreaOfSquare();
		obj.length= 5;
		obj.width=5;
		obj.area();
	}

}
