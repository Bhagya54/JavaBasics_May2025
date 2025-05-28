package assignment;

import java.util.HashMap;
import java.util.Map;

public class CalculateFrequency {

/*
 * s - 1
 * e - 2+1==3
 * l - 1
 * n - 1
 * i - 2
 * u - 1
 * m - 1 
 * w - 1
 * t - 1
 * h - 1
 */
	public static void main(String[] args) {
		String str = "seleenium with java";
		HashMap<Character,Integer> hm = new HashMap<Character, Integer>();
		for(int i=0;i<str.length();i++) {
			char c = str.charAt(i);//i
			
			if(hm.containsKey(c)) {
				hm.put(c, (hm.get(c))+1);
			}
			else {
				hm.put(c, 1);
			}
		}
		
		for(Character key: hm.keySet()) {
			System.out.println("Key is: " + key + " value is : " + hm.get(key));
		}
		

	}

}
