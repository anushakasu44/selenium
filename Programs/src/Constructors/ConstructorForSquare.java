package Constructors;

public class ConstructorForSquare {
	
	
    int side;

   ConstructorForSquare(int side){
	this.side=side;
	System.out.println("Area of the square is :"+side*side);

}

    void square() {
    	
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorForSquare s1=new ConstructorForSquare(4);
		s1.square();
	}

}
