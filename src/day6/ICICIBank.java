package day6;

public class ICICIBank implements RBI {

	public void depositMoney() {
		System.out.println("Deposit money in ICICI Limit 500000");
	}

	@Override
	public void withDrawMoney() {
		System.out.println("Withdraw money in ICICI Limit 1000000");
		
	}

	

	
}
