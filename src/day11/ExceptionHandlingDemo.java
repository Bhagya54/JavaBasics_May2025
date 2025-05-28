package day11;

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
	 */

	public static void main(String[] args) {
		String path="./src/day10/data";
		try {
		System.out.println("opening a file");	
		FileReader reader = new FileReader(path);
		System.out.println("File is being read");
		
		}
		
		catch(Exception e) {
			System.out.println("File is not found . Please check the path");
			
		}
		
		finally {
			System.out.println("closing the file ");
		}

	}

}
