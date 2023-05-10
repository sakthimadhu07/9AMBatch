package stepDefinition;

import java.util.TreeMap;

public class TreeMapProgram {
	
	public static void main(String[] args) {
		
		
		TreeMap<String,Integer> t = new TreeMap();
		
		t.put("ENGLISH", 80);
		t.put("TAMIL", 70);
		t.put("ENGLISH", 90);
		t.put("SOCIAL", 70);
		t.put("BIO", null);
		//t.put(null, 100);
		
		//key dosent allow even one null
		t.put("Economics", null);
		
		System.out.println(t);
		
		
	}

}
