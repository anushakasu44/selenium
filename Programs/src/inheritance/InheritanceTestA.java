package inheritance;

public class InheritanceTestA {
	
	int a;//non static variable//
	int b;//non static variable//
	
	void a1() {  //non static method//
		System.out.println("hello");
		System.out.println(a*b);
	}
	
	InheritanceTestA(int a,int b ){	//constructor//
		this.a=a;
		this.b=b;
	}
		
		
		public static void main(String[] args) {
	
		// TODO Auto-generated method stub//
			
			InheritanceTestA t1=new InheritanceTestA(3,4);
			t1.a1();

	}

}
