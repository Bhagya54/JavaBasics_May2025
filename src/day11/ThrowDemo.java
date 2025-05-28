package day11;

public class ThrowDemo {
	
	static void validate(int age) throws Exception {
		if(age>18) {
			System.out.println("You are allowed to vote");
		}
		else {
			throw new Exception("Your age is not greater than 18");
		}
		
	}

	public static void main(String[] args) throws Exception {
		validate(12);

	}

}
