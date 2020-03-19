package practice;

import org.omg.Messaging.SyncScopeHelper;

public class ClassE extends Exception {
	static int a;
	static int b;
 public static void add1() {
	 System.out.println("add");
 }
 
 
 ClassE(String name){
	System.out.println("anu");
 }
 public static void ex()  {
	 try {
		throw new Exception("hello");
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
		
	}
	public static void main(String[] args) throws Exception {
		
		ex();
		// TODO Auto-generated method stub
try {
	int a=0;
	int b=100;
			System.out.println(b/a);
}
catch(Exception e) {
	System.out.println(e.getLocalizedMessage());
}
finally {
	System.out.println("div: " +(a+b));
}
	}

}
