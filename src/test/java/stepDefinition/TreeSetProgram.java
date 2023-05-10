package stepDefinition;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetProgram {
	
	public static void main(String[] args) {
		
		TreeSet<String> t = new TreeSet();
		
		t.add("ORANIUM");
		t.add("ENGLISH");
		t.add("CHEMISTRY");
		t.add("PHYSICS");
		t.add("BIOLOGY");
		//t.add(null);
		t.add("ORANIUM");
		System.out.println(t);
		
		//iterations
		
		//enhanced for loop, lamda expression, iterator
		
		Iterator<String> it = t.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
			
		}
		
		
		
		
		
	}

}
