package string;

public class Practice {

	
	public static void revString(String name) {
		
		String name1="";
		for(int i=name.length()-1;i>=0;i--) {
			name1=name1+name.charAt(i);
		}
		System.out.println(name1);
		System.out.println(name1.equals(name));
		
		System.out.println(name1.charAt(0));
		System.out.println(name1.charAt(1));
		System.out.println(name1.charAt(2));
		System.out.println(name1.charAt(3));
		System.out.println(name1.charAt(4));
		System.out.println(name1.charAt(5));
		System.out.println(name1.charAt(6));
		System.out.println(name1.charAt(7));
		System.out.println(name1.charAt(8));
		
		System.out.println(name1.length());
		
		String a[]= {"A","R","U","N","A","L","L","A","M"};
		System.out.println(a[8]);
		System.out.println(a[7]);
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Practice.revString("ARUNALLAM");
	System.out.println("-----------");
	}

}
