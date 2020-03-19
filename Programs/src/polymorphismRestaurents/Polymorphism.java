package polymorphismRestaurents;

public class Polymorphism extends Mcdonalds{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mcdonalds m;//obj creation for parent class

	    m= new Burger();//Upcasting
	    m.mcdonaldsFood();//i can access only common methods which are in child class
	    
	    m= new Coffee();//Upcasting
	    m.mcdonaldsFood();
	    m= new Crossants();//Upcasting
	 m.mcdonaldsFood();
	    
	    m= new Muffins();//Upcasting
	   m.mcdonaldsFood();
	   
	   
	    m.food(10, 20);//as i can see all the other methods which are in parent class
	    

	}

}
