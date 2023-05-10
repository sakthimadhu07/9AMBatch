package stepDefinition;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {
	
	public static void main(String[] args) {
		
		HashMap<String, Integer> h = new HashMap();
		//add--> put
		
		h.put("ENGLISH", 80);
		h.put("TAMIL", 70);
		h.put("ENGLISH", 90);
		h.put("SOCIAL", 70);
		h.put("BIO", null);
		h.put(null, 100);
		h.put("Economics", null);
		
		System.out.println(h);
		System.out.println(h.get("TAMIL"));
		//entrySet
		
		Set<Entry<String, Integer>> e = h.entrySet();
		
		
		e.forEach(q->System.out.println(q.getKey()+q.getValue()));
		
		
		//keySet
		
		Set<String> u = h.keySet();
		
		
		u.forEach(w->System.out.println(w));
		
		Collection<Integer> v = h.values();
		
		v.forEach(t->System.out.println(t));
		
	}

}
