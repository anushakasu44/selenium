package objectClass;

public class ObjectClassEx2 extends Object{ //we can also extend object without creating the obj class
	
	 String toString(String fname) {
		return fname;
	}

	 ObjectClassEx2(){
		 
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ObjectClassEx2 obj2=new ObjectClassEx2();
		System.out.println(obj2);
		System.out.println(obj2.toString("anu"));
	}

}
