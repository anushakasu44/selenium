package exceptionalhandling;

public class TryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   try{
	   int arr[][] = new int[2][1];

        arr[0][0]=2;
        arr[1][0]=5;
        arr[0][1]=9;
         System.out.println(arr.length);
	}
	catch(Exception e) {
		System.out.println(e.getClass());
	}
	}

}
