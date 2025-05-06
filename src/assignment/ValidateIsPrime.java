package assignment;

public class ValidateIsPrime {
/*
 * You are given a number. Check if it's a prime number and
return true or false accordingly.
 */
	
	public boolean isPrime(int n) {//n=6 - 2,3,4,5
		for(int i=2;i<n;i++) {
			if(n%i==0) {//6%2 == 0
				return false;
			}			
		}
		
		return true;
	}
	
	
	public static void main(String[] args) {
		ValidateIsPrime pr = new ValidateIsPrime();
		if(pr.isPrime(6)) {
			System.out.println("Prime");
		}
		else {
			System.out.println("Not a prime number");
		}

	}

}
