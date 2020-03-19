package array;

public class ArrayEx {
	

public static void main(String[] args) {
		// to store mul. values 3,6,7,9,4,7//
		
		int a[] = new int[6];{
			a[0]=3;
			a[1]=6;
			a[2]=7;
			a[3]=9;
			a[4]=4;
			a[5]=7;
			}
		System.out.println(a.length);//for displaying total values//
		System.out.println(a[3]);
			
		//or int b[]={3,6,7,9,4,7} or //
		int b[]= {3,6,7,9,4,7};
		System.out.println(b[5]);
		
		// For Each:: for(int a:b)  where a is var name and b is array//
		for(int x:a) {
			System.out.println(x);
		}
		System.out.println(a[2]);
		
}
		
	}


