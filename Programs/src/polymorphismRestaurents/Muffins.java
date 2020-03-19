package polymorphismRestaurents;

public class Muffins extends Mcdonalds{
	
	
	
	
	void mcdonaldsFood(Mcdonalds b){
	
		Muffins d=(Muffins)b; //creating child class object by using parent class object.
		System.out.println("muffins");
	}

	void test() {
		System.out.println("test");
	}
	public static void main(String[] args) {
		// child class//
Muffins b=new Muffins();
b.test();
b.mcdonaldsFood();
b.food(10, 20);
b.mcdonaldsFood(b);//by using downcasting we can able to acces all object class and parent class methods and variables .

	}

}
