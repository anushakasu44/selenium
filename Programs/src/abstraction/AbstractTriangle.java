package abstraction;

public  class AbstractTriangle extends AbstractRectangle{
	
	AbstractTriangle(int width, int height) {
		super(width, height);
		this.width=width;
		this.height=height;
		System.out.println("area of the triangle is:"+(half*width*height));
		
		// TODO Auto-generated constructor stub
	}

	static double half= 0.5d;
	
	@Override
	void area() {
		// TODO Auto-generated method stub
		System.out.println("Area of the rectangle is:"+(width*height));
	}
	
	@Override
	void perimeter() {
		System.out.println("Area of perimeter is: "+ (4 * width * height));
		// TODO Auto-generated method stub
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractTriangle obj=new AbstractTriangle(1,4);
		obj.area();
		obj.perimeter();
		
		
		
		
	}







	

	

}
