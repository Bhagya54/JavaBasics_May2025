package day11;

public class StarPattern_2 {
/*
 *  
 *  * * * * *
 *  * * * *
 *  * * *
 *  * * 
 *  *
 * 
 */
	public static void main(String[] args) {
		int n=5;
		for(int row=0;row<n;row++) { //5<5
			for(int col=0;col<=row;col++) { //4<=4
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
