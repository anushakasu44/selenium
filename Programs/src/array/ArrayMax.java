package array;

public class ArrayMax {

   static void arrayMax(int arr[]) {
		int max= arr[0]; //1st value is stored i,e 7// 
		for (int i=1;i< arr.length;i++) {
			if(max<arr[i]) {
				max=arr[i];
			}
			
		}
		System.out.println(max);
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int b[]= {7,1,8,9,5};
     arrayMax(b);
     
	
}
	}
