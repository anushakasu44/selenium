package inheritance;

public class InhertanceTestc extends InheritanceTestA {
	
	int d;
	
	void a1() {//method overriding:using the same parent method in child method//
		System.out.println("*");
	}

	 InhertanceTestc(int d){
		 super(1,2);
		 this.d=d;
		 System.out.println(d);
		 
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 InhertanceTestc t3=new  InhertanceTestc(8);
		 t3.a1();
		
	}

}
