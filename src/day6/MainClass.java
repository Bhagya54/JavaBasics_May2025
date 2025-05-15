package day6;

public class MainClass {
	
	

	public static void main(String[] args) {
//		HDFCBank hdfc = new HDFCBank();
//		hdfc.depositMoney();
//		hdfc.withDrawMoney();
		
		//variable - change
		int a=10;
		System.out.println(a);//10
		a=100;
		System.out.println(a);//100
		RBI rbi = new HDFCBank();
		rbi.depositMoney();
		rbi.withDrawMoney();
		
		//RBI rbi = new RBI();
		//AbstractClassDemo a = new AbstractClassDemo();
		//we can't create object for interface and abstract class
		
		rbi = new ICICIBank();
		rbi.depositMoney();
		rbi.withDrawMoney();
		
		AbstractClassDemo i = new AbstractMethodImplementationClass();
		i.abc();
		i.xyz();
		
		
		
		// WebDriver driver = new ChromeDriver();
		// driver = new FirefoxDriver();
		//driver = new EdgeDriver();
		

	}

}
