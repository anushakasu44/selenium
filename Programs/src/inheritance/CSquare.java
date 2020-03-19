package inheritance;

public class CSquare extends ACircle{
	
	int side;
	
	CSquare(int c){
		super(c);
		side=c;
		System.out.println("Area of the square is :"+(c*c));
	}
	
	void square() {
		
	}

	public static void main(String[] args) {
		//CSquare is a child class//
		CSquare C1=new CSquare(6);
		C1.square();
		C1.circle();
		
		

	}

}
