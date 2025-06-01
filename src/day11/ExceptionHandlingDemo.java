package day11;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionHandlingDemo {
	/*
	 * Exception-unplanned event that stops the normal flow of execution
	 * Exception Handling:
	 * 1.try{ -  risky code you will place inside the try block
	 * }
	 * 2.catch(Exception e){ - handle the exception
	 * }
	 * 3. throws - you are just throwing the exception with out handling
	 * 4. throw: intentionally throwing your own exception
	 * 5. finally:which gets executed whether the exception is being handled or not
	 * 
	 * 2 types of exceptions:
	 * 1. Compile Time - FileNotFound/IO Exception
	 * 2. Runtime - 
	 * Arithmetic 
	 * ArrayIndexOutOfBoundsException
	 * NullPointerException
	 * NumberFormatException
	 */

	public static void main(String[] args) {
		String path="./src/day10/data";
		
		System.out.println("opening a file");	
		try {
			FileReader reader = new FileReader(path);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("File is being read");
		
		
		
		
		
		

	}

}
