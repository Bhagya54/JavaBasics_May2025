package day7;

public class ArraysDemo {
/*
 * Array - multiple sets of data 
 * 3 parts:
 * 1. declaration
 * 2. Instantiation
 * 3. Initialization
 * length - gives size of an array
 * 1.  Instantiation we should give the size of an array
 * 2.  Array index starts from 0 (size - 5 --- 0,1,2,3,4)
 * 3.  Duplicate values are allowed
 * 4.  Default value will be initialized if user is not providing the value
 * 
 */
	public static void main(String[] args) {
		
		
		int[] id;//declaration
		id = new int[5];//Instantiation
		
		//declaration+Instantiation
		int[] id1 = new int[6];
		
		id1[1]=23;
		id1[2]=67;
		id1[3]=89;
		id1[4]=90;
		id1[5]=90;
		
		//declaration+Initialization
		String[] id2 = {"ram","shyam","sheela"};//size/length - 3
		for(int i=0;i<id2.length;i++) {
			System.out.println(id2[i]);
		}
		
		System.out.println(id1[7]);
		
//		System.out.println(id1[0]);
//		System.out.println(id1[1]);
//		System.out.println(id1[2]);
//		System.out.println(id1[3]);
		
		for(int i=0;i<id1.length;i++) {
			System.out.println(id1[i]);
		}

	}
	
	

}
