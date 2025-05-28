package day9;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo {
/*
 * HashSet - class which implements Set interface
 * it does not allow duplicate values
 * it does not maintain any insertion order
 * 
 * Hash - follows a hashing mechanism
 */
	public static void main(String[] args) {
		Set<String> s1 = new HashSet();
		s1.add("abc");
		s1.add("xyz");
		s1.add("abc");
		s1.add("23gg");
		s1.add("tyu");
		s1.add("789");
		s1.add("*%$");
		System.out.println(s1);
		
		//Enhanced for loop
		for(String t:s1)//individual value
		{
			System.out.println(t);
		}
		
		System.out.println("Using Iterator");
		//Iterator
		Iterator i1 = s1.iterator();
		while(i1.hasNext()) {
			System.out.println(i1.next());
		}
			
		
		

	}

}
