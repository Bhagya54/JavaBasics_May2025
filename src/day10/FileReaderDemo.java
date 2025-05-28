package day10;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {
/*
 * Book - library
 * 
 * FileNotFoundException - child
 * IOException - parent
 * 
 * 
 */
	public static void main(String[] args) throws IOException {
		String path="./src/day10/data";
		
		FileReader reader = new FileReader(path);
		System.out.println("File is being read");
//		System.out.println((char)reader.read());
//		System.out.println((char)reader.read());
//		System.out.println((char)reader.read());
//		System.out.println((char)reader.read());
		
		int i=0;
		while((i=reader.read())!=-1) {
			System.out.println((char)i);
		}
		

	}

}
