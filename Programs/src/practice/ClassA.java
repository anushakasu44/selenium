package practice;

public class ClassA extends ClassB implements InterfaceA,InterfaceB{
ClassA(int a) {
		super(a);
		// TODO Auto-generated constructor stub
	}



int a;
int b;

@Override
void mod() {
	System.out.println("mod: "+a%b);
	
}


@Override
public void mul() {
	System.out.println("mul: "+(a*b));
	
}

@Override
public void div() {
	System.out.println("div: " +(a/b));
	
}

@Override
public void add() {
System.out.println("add: " +(a+b));
	
}

@Override
public void sub() {
	System.out.println("sub: "+ (a-b));
	
}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
ClassA ob=new ClassA(5);
InterfaceA.multiple();
InterfaceB.multiple();
ob.a=10;
ob.b=20;
ob.add();
ob.sub();
ob.div();
ob.mul();
ob.mod();
	}

	

}
