package assignment;

public class ArraysAssignment {

	public static void main(String[] args) {
		//1 to 10
		//a1 - {1,2,3,4,... 10}
		//a2 - { 10, 20, 30.. 100}
		
		int[] id = new int[10];
		
		id[0] = 1;
		id[1] = 2;
		id[2] = 3;
		id[9] = 9;

		for(int i=0;i<id.length;i++) {//i=1
			id[i] = 10*(i+1);//id[1] = 10*2=20
			System.out.println(id[i]);
		}
		
		
		
 		
	}

}
