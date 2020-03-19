package string;

public class CheckPalindrom {

	
	void checkPalindrom(String name) {
		String revstring="";
		
		for(int i=name.length()-1;i>=0;i--) {
			revstring=revstring+name.charAt(i);
		}
		System.out.println(name.equals(revstring));
		
	}
	public static void main(String[] args) {
		// Reverse of a srting//
		CheckPalindrom C1=new CheckPalindrom();
		C1.checkPalindrom("malayalam");
	}

}
