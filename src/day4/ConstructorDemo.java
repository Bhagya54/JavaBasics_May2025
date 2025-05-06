package day4;

public class ConstructorDemo {
	
	/*Constructor -
	 * will have same name as that of the class name
	 * will not have a return type
	 * 
	 * 
	 */
	
	public ConstructorDemo() {
		System.out.println("Without Parameters");
	}
	
	public ConstructorDemo(int a) {
		System.out.println("With Parameters");
	}

	public void add() {
		System.out.println(1+2);
	}
	public static void main(String[] args) {
		ConstructorDemo c1 = new ConstructorDemo();
		c1.add();
	}

}
