package day10;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapDemo {
/*
 * We store in terms of key-value pair
 * HashMap - class which implements Map Interface
 * CRUD
 * put
 * get
 * 
 * terms:
 * a key and value together we call as - entry/bucket/pair
 * set of entries - entry set
 * 
 *  1 - a
 *  2 - b
 *  1 - r
 *  
 *  
 * Rules:
 * 1. Can I have duplicate values ?? yes
 * 2. Can I have duplicate keys?? Not allowed - updation happens
   3. Null key as well value is allowed
 * 4. Insertion order is not maintained
 */
	public static void main(String[] args) {
		Map<Integer,String> hm = new HashMap();
		hm.put(1,"pooja");
		hm.put(2,"sara");
		hm.put(3,"pooja");
		System.out.println(hm);
		hm.put(2, "raj");
		hm.put(null, "hari");
		hm.put(4, null);
		hm.put(23, "charan");
		hm.putIfAbsent(45, "url");
		hm.putIfAbsent(23,"anjana");
		System.out.println(hm);
		System.out.println(hm.get(1));
		
		//enhanced for loop
		for(Entry<Integer,String> s: hm.entrySet()) {
			System.out.println(s.getKey() + " ---- " + s.getValue());
			
		}
		
		System.out.println("All Keys");
		//only retrive keys
		for(Integer k:hm.keySet()) {
		System.out.println(k);
		}
		
		System.out.println("All values");
		for(String s:hm.values()) {
			System.out.println(s);
		}
		
		System.out.println(hm);
		System.out.println(hm.containsKey(23));//true
		System.out.println(hm.containsValue("raji"));
		System.out.println(hm.remove(23));
		System.out.println(hm);
	}

}
