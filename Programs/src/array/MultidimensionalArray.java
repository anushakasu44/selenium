package array;

public class MultidimensionalArray {
	

	public static void main(String[] args) {
		// 1*1 matrix

		
		int Array[][]=new int[2][2];
		
	Array[0][0]=1;
	Array[0][1]=2;
	Array[1][0]=3;
	Array[1][1]=4;

	System.out.println(Array.length);
	for(int x:Array[1]) {
		System.out.println(x);
	}
	
	for(int i=0;i<Array.length;i++) {
		for(int j=0;j<Array[0].length;j++) {
			System.out.print(Array[i][j]);
		}
		System.out.println(" ");
	}
	}

}

