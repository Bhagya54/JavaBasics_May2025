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
		for(int row=1;row<=n;row++) { //5<5
			for(int col=row;col<=n;col++) { //5<=5
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
