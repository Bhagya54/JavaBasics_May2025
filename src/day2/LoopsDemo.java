package day2;

public class LoopsDemo {

	public static void main(String[] args) {
		//loop - repeting same set of statement
		/*
		 * for 
		 *   for(initial value;condition;increment/decrement)
		 * while
		 * 	initial value
		 *  while(condition){
		 *   statement;
		 *   increment/decrement
		 *   }
		 * do while
		 */
		
		/*
		 * 10 -- 100
		 */
		System.out.println("For Loop");
		for(int i=10;i<=100;i=i+10) {//i=20<=100
			System.out.println(i);//20
		}
		
		//50 40 30 20 10
		for(int j=50;j>=10;j=j-10) {
			System.out.print(j + " ");//50 40 30 20 10
		}
		System.out.println();
		System.out.println("While Loop");
		int i=500;
		while(i<=100) {//50<=10
			System.out.println(i);
			i=i+10;
		}
		
		System.out.println("do while");
		int j=500;
		do {
			System.out.println(j);//500
			j=j+10;//510
			
		}while(j<=100);
		
		
		

	}

}
