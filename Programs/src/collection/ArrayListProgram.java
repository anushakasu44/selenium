package collection;

import java.util.ArrayList;
import java.util.Iterator;


public class ArrayListProgram {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		ArrayList<String> ob = new ArrayList<String>();
		ob.add("Anu  ");
	    ob.add("Aruu");
	  ob.forEach((x)-> System.out.println(x.trim())); //iterates all the elements
	 
		System.out.println(ob.toArray()[1]);
	
		Iterator<String> itr= ob.iterator();
		while(itr.hasNext()) {
			//System.out.println(itr.hasNext());
			System.out.println(itr.next());
		}	
	}

}
