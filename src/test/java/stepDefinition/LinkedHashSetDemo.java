package stepDefinition;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {

		LinkedHashSet<Object> l = new LinkedHashSet();


		l.add("ORANIUM");
		l.add(12);
		l.add(true);
		l.add('c');
		l.add("ORANIUM");
		l.add(null);
		l.add("ORANIUM");
		l.add(34.54f);
		
		System.out.println(l);
		
		
		l.forEach(t->System.out.println(t));

	}

}
