package abstraction;

public abstract class AbstractRectangle extends AbstractSquare {
	
	int width;
	int height;
	
	abstract void perimeter();
	
	@Override
	void area() {
		// TODO Auto-generated method stub
		System.out.println("Area of the rectangle is:"+(width*height));
	}

	AbstractRectangle(int width,int height){
		this.width=width;
		this.height=height;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractRectangle obj=new AbstractTriangle(3,8);
		obj.area();
		obj.perimeter();
	
	}

	

	
	
	

}
