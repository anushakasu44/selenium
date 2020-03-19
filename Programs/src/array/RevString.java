package array;

public class RevString {
	
	public static void revString(String name) {
		String name1="";
		for(int i=(name.length()-1);i>=0;i--) {
			name1=name1+name.charAt(i);
		}
		
		System.out.println(name.equalsIgnoreCase(name1));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
revString("malayalam");
	}

}
