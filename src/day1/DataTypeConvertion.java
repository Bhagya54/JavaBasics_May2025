package day1;

public class DataTypeConvertion {
	/*
	 * B1 : 5l capacity - 2l water
	 * B2 : 3l capacity
	 * 
	 * Task 1: B2 > B1 - done
	 * Task 2: B1 > B2 - 2l wasted. chances of data loss.
	 * 
	 * 
	 */
	

	public static void main(String[] args) {
		int i1 = 12;//12 - B1 - 5l
		byte b1 = (byte) i1;//B2 - 3l
		
		System.out.println(i1);//129
		System.out.println(b1);//12
		
		byte b2 = 34;
		int i2 = b2;
		System.out.println(b2);//34
		System.out.println(i2);//34
		
		float f1=56.27f;
		int i3 = (int) f1;
		System.out.println(f1);//56.27
		System.out.println(i3);//56
		
		int i4 = 67;
		double d1 = i4;
		System.out.println(i4);//67
		System.out.println(d1);//67.0
		
		char c1 = '@';
		int i5 = c1;
		System.out.println(c1);//d
		System.out.println(i5);//100
		
		int i6=56;
		char c2 = (char) i6;
		System.out.println(i6);//56
		System.out.println(c2);//8
		
		
		String str1 = "234";
		//String str3 = "etertr";
		int i7=Integer.parseInt(str1);
		System.out.println(str1+1);//2341
		System.out.println(i7+1);//235
		
		double i8=45.6;
		String str2 = Double.toString(i8);
		System.out.println(i8+1);//46.6
		System.out.println(str2+1);//45.61
		

	}

}
