package day2;

public class ControlStatements {
	/*
	 * if
	 * if else
	 * if else if else
	 * switch
	 * 
	 * 
	 */

	public static void main(String[] args) {
		int age = 10;
		
		if(age>18) {
			System.out.println("allowed to vote");
		}
		else {
			System.out.println("not allowed to vote");
		}
		
		/*
		 * marks>=75 -- A
		 * marks<75 && marks>=60 -- B
		 * marks<60 && marks>=50 -- C
		 * marks<50 && marks>=40 -- D
		 * marks<40  -- fail
		 * 
		 */
		
		int marks = 79;
		if(marks>=75) {
			System.out.println("A");
		}
		else if(marks<75 && marks>=60) {
			System.out.println("B");
		}
		else if(marks<60 && marks>=50) {
			System.out.println("C");
		}
		else if(marks<50 && marks>=40) {
			System.out.println("D");
		}
		else  {
			System.out.println("Fail");
		}
		/*
		 * else { System.out.println("no match"); }
		 */
		
		
		int day =6;
		switch (day) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;
		default:
			System.out.println("Invalid input");
			break;
		}

	}

}
