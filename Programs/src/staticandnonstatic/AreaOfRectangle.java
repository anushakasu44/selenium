package staticandnonstatic;

public class AreaOfRectangle {
	
	int width;
	int length;
	
	void Area() {
	System.out.println("Area of the Rectangle is :"+(width * length));
 
	}
	
	public static void main(String args[]) {
		
		AreaOfRectangle obj = new AreaOfRectangle();
		obj.width=5;
		obj.length=7;
		obj.Area();
		
		
	}

}
