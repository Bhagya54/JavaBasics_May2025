package day10;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderDemo {

	public static void main(String[] args) throws IOException {
		String path="./src/day10/data";
		FileReader reader = new FileReader(path);
		BufferedReader br = new BufferedReader(reader);
		//System.out.println(br.readLine());
		
		String s=null;
		while((s=br.readLine())!=null) {
			System.out.println(s);
		}
	}

}
