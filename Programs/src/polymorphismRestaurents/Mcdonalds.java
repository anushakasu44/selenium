package polymorphismRestaurents;

public class Mcdonalds  {
 int beverage;
 int drinks;
 
 int food(int a,int b) {
	 this.beverage=a;
	 this.drinks=b;
	 System.out.println("price of food is :" +a*b);
	 int c=a*b;
	 return c;
	 
 }
 
	void mcdonaldsFood() {
		
	}
	public static void main(String[] args) {
		//parent class//
Mcdonalds b= new Mcdonalds();
b.food(10,20 );
	}
}
    


