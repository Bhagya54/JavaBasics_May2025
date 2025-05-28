package day9;

import java.util.ArrayList;

public class ArrayListDemo {
/*
 * ArrayList
 * its a class which implements List interface
 * used to store multiple values
 * internal working is similar to an array
 * size is dynamic
 * 
 * CRUD:
 * Creation: add
 * Retrival : get
 * Updation: set
 * Deletion:remove
 * size() - give size of an arraylist
 * Rules:
 * 1. Maintain the insertion order
 * 2. index starts from 0
 * 3. we can store duplicate values
 * 
 */
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList();
		al.add(12);
		al.add(23);
		al.add(56);
		System.out.println(al);
		al.add(23);
		System.out.println(al);
		System.out.println(al.get(2));//56
		al.set(2, 90);
		System.out.println(al);
		al.remove(3);
		System.out.println(al);
		System.out.println(al.size());
		
		//al.clear();
		al.addFirst(12);
		al.addLast(34);
		System.out.println(al);
		
		System.out.println(al.contains(900));
		
		/*
		 * for(int i=0;i<al.size();i++) { System.out.println(al.get(i)); }
		 */
		
		
		for(Integer s:al) {
			System.out.println(s);
		}
		
		
		
		

	}

}
