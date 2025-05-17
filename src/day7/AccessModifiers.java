package day7;

public class AccessModifiers {
/*
 * Access Modifier:
 * 1.Private - within the class
 * 2.Protected - outside package as well but  there should be inheritance relation
 * 3.Default - within package
 * 4.public - throughout the project
 */
	private int a = 100;
	int b=10;
	protected int c=90;
	public int d=78;
	
	public void getA() {
		System.out.println(a);
	}
}
