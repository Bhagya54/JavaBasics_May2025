package day5;

public class MethodOverloading {
	
	public void add(int a,int b) {
		System.out.println("Sum of 2 integer values:" + (a+b));
	}
	
	public void add(int a,int b,int c) {
		System.out.println("Sum of 3 integer values:" + (a+b+c));
	}

	public void add(float a,float b) {
		System.out.println("Sum of 2 float values:" + (a+b));
	}
	public static void main(String[] args) {
		MethodOverloading m1 = new MethodOverloading();
		m1.add(34,5);
		m1.add(56.4f,5.4f);
		m1.add(2,3,5);

	}

}
