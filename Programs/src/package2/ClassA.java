package package2;

import package1.Class1;

public class ClassA extends Class1{

		
		public static int add(int a,int b) {
			System.out.println(a+b);
			int c= (a+b);
			return c;
		}
	    public static void mul(int c, double d) {
	    	System.out.println(c*d);
	    	
	    }
	    public static double mod(double e,double f) {
	    	System.out.println(e%f);
	    	return (e%f);
	    }
	    public static void div(double g,int h) {
	    	System.out.println(g/h);
	    }
	    public  float sub(float i,float j) {//non static
	    	System.out.println(i-j);
	    	return (i-j);
	    
		}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  ClassA.add(2,3);
	        ClassA.mul(4,5.2);
	        ClassA.mod(2.2, 5.2f);
	         ClassA.div(12.02,52);
	        
	         ClassA ob2=new ClassA();
	         ob2.sub(2.2f,5.2f);
	         
	         ob2.protectedSpecifier(10);
	 
	         
	         Class1 ob=new Class1();
	         
	         ob.setb(10); //i can able to see getter and setter methods of private in other package by importng//
	         System.out.println(ob.getb());
	         
	         ClassA.publicSpecifier();//I can access public method in other package//
	         
	         
	       
	         
	         
	         
	         
	}

}
