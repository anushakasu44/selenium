package practice1;

import practice.ClassE1;

public class ClassE extends ClassE1{
	
	int a;
	int b;
	
 public static void add1() {
	 
	 System.out.println("add");
 }
 
 public void div() {
		System.out.println("div: " +(b*a));
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
ClassE ob=new ClassE();
add1();
ob.d=10;//protected
ob.setname("private");
System.out.println(ob.getname());
ob.add2();//public
ob.add4();
ob.b=10;//public
	
	ob.a=10;
	ob.b=2;
	ob.div();
}
	}


