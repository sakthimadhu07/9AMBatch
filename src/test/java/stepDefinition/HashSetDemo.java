package stepDefinition;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
	
	
	public static void main(String[] args) {
		
		HashSet<Object> h = new HashSet();
		
		//add
		
		h.add("ORANIUM");
		h.add(12);
		h.add(true);
		h.add('c');
		h.add("ORANIUM");
		h.add(null);
		h.add("ORANIUM");
		h.add(34.54f);
		
		System.out.println(h);
		
		//lamda expresion
		
		h.forEach(y->System.out.println(y));
		
		//using iterator
		
		System.out.println("=================");
		
		Iterator<Object> itr = h.iterator();
		
		while(itr.hasNext())
		{
			
			System.out.println(itr.next());
		}
		
		
		
		
		
	}

}
