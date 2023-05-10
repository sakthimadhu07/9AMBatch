package stepDefinition;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class LinkedHashMapDemo {
	
	public static void main(String[] args) {
		
		
		LinkedHashMap<String, Integer> l = new LinkedHashMap();
		
		l.put("ENGLISH", 80);
		l.put("TAMIL", 70);
		l.put("ENGLISH", 90);
		l.put("SOCIAL", 70);
		l.put("BIO", null);
		l.put(null, 100);
		l.put("Economics", null);
		
		System.out.println(l);
		
		//keySEt
		
		Set<String> h = l.keySet();
		
		h.forEach(w->System.out.println(w));
		
		Collection<Integer> g = l.values();
		g.forEach(f->System.out.println(f));
	
	
	Set<Entry<String, Integer>> o = l.entrySet();
	
	o.forEach(b->System.out.println(b.getKey()+b.getValue()));
	
	}

}
