package abstraction;

public abstract class AbstractSquare {
	
	//separating method header from method body//
	//if anyone of the method is abstract ,then complete class becomes abstract//
	
	static int length;
	int breadth;
	
	
	abstract void area() ; //abstract method//
	
	public static void A1() {  //static method//
		length=2;
		System.out.println("length:"+length);
	}
	
	public void A2() {     //non static method//
		breadth=3;
		System.out.println("breadth:"+breadth);
	}
		
	
	AbstractSquare(){  //constructor//
			}
	

public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractSquare.A1();
		AbstractSquare obj=new AbstractTriangle(2,5);
		
		obj.area();
		obj.A2();
		
		
		
		
		
		
		
	}

}
