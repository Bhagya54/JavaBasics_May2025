package assignment;

import java.util.ArrayList;
import java.util.List;

public class AddingTwoArrayListValues {
	/*
	 * al1 -- 34,12,45,67,89
	 * al2 -- 89,23,12,60
	 * 
	 * al1 -- 34,12,45,67,89,89,23,12,60
	 * 
	 * int a=12;
	 * 
	 */

	public static void main(String[] args) {
		List<Integer> al1 = new ArrayList<>();
		al1.add(34);
		al1.add(12);
		al1.add(45);
		al1.add(67);
		al1.add(89);
		System.out.println(al1);
		
		List<Integer> al2 = new ArrayList<Integer>();
		al2.add(89);
		al2.add(23);
		al2.add(12);
		al2.add(60);
		System.out.println(al2);
		
		for(int i=0;i<al2.size();i++) {
			al1.add(al2.get(i));
		}
		
		System.out.println(al1.size());//9
		System.out.println(al1);
		
		
		
		

	}

}
