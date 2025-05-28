package day9;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

	public static void main(String[] args) {
		List<Integer> ll = new LinkedList();
		ll.add(12);
		ll.add(23);
		ll.add(56);
		ll.add(23);
		System.out.println(ll);
		
		for(int i=0;i<ll.size();i++) {
			System.out.println(ll.get(i));
		}
	}

}
