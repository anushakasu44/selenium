package method;

public class calculator {
	
	public static int add(int a,int b) {
		System.out.println(a+b);
		return (a+b);
	}
    public static void mul(int c, int d) {
    	System.out.println(c*d);
    	
    }
    public static double mod(double e,double f) {
    	System.out.println(e%f);
    	return (e%f);
    }
    public static void div(int g,int h) {
    	System.out.println(g/h);
    }
    public static float sub(int i,int j) {
    	System.out.println(i-j);
    	return (i-j);
    }
    
    
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         add(2,3);
         mul(4,5);
         mod(10.2,25.23);
         div(12,52);
         sub(12,251);
	}

}
