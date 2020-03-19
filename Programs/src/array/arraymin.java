package array;

public class arraymin {
	public static void arrayMin(int arr[]) {
		int min=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(min>arr[i]) {
				min=arr[i];
			}
		}
		System.out.println(min);
	}
   
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		int a[]= {5,2,3,4};
		arrayMin(a);
		
		//String a="Test";
 //String b= "test";
 
 //System.out.println(a.equalsIgnoreCase(b));
	}

}
