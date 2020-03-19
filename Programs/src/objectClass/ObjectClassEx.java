package objectClass;

public class ObjectClassEx {
	
	 void test1() {
		System.out.println("hello");
	}
	
	 ObjectClassEx(){
		 
	 }

	public static void main(String[] args) {
		//Object class: Master of all the classes and this particular class becomes child class to object class.
		 ObjectClassEx obj=new ObjectClassEx()	;
		 obj.test1();
		 System.out.println(obj);//when we print obj or (obj.toString) it gives the same output
		  System.out.println(obj.toString());//output:packagename.classname and address
	
	}

}
