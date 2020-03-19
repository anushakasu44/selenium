package collection;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LinkedList<String> ob=new LinkedList<String>();
ob.addFirst("Anusha");
ob.addLast("Reddy");
ob.remove("Reddy");
ob.add("Reddy");

Iterator<String> itr=ob.iterator();
while(itr.hasNext()) {
	System.out.println(itr.hasNext());
	System.out.println(itr.next());
}

	}

}
