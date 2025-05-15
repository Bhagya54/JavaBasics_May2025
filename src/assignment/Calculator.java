package assignment;

public class Calculator {
	
	public static int sum(int a, int b) {
		int c=a+b;//45+5=50
		//System.out.println(a+b);
		return c;//50
	}
	
	public static int subtract(int a,int b) {
		int c=a-b;
		return c;
	}
	
	public static int divide(int a,int b) {//static method
		int c = a/b;//
		return c;//9
	}
	
	public int remainder(int a,int b) {//instance method
		int c = a%b;//
		return c;//0
	}
	
	public static void main(String[] args) {
		Calculator s1 = new Calculator();//object creation /instantiation
		System.out.println(sum(45,5));//50
		System.out.println(subtract(45, 5));//40
		System.out.println(divide(45, 5));//9
		System.out.println(s1.remainder(45, 5));//0
	}

}
