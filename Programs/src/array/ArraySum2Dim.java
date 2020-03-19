package array;

public class ArraySum2Dim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[][]= {{1,2},{3,4}};
int b[][]= {{2,3},{6,5}};

int c[][]=new int[2][2];

for(int i=0;i<a.length;i++) {
	for(int j=0;j<a[i].length;j++) {
		
		System.out.println(a[i][j]);
	}
}

for(int i=0;i<b.length;i++) {
	for(int j=0;j<b[i].length;j++) {
		
		System.out.println(b[i][j]+ "\t");}}

for(int i=0;i<c.length;i++) {
	for(int j=0;j<c[i].length;j++) {
		
		c[i][j]=a[i][j]+b[i][j];
				System.out.println(c[i][j]+ "\t");}}
	}
}



