package day2;

public class OperatorsDemo {

	public static void main(String[] args) {
		/*
		 * Unary Operator - 1 operand
		 * 		>Post Increment / Pre increment
		 * 		>Post Decrement / Pre Decrement
		 * Binary Op - 2 operands
		 * 		> Relational Operators: < , <=, > , >=, ==
		 * 		> Logical Operators : && - AND,|| - OR,!
		 * 		> Arithmetic Operator: +,-,*,/,%
		 * 
		 * cond 1 && cond 2 -- true and true --- true
		 * cond 1 && cond 2 -- false and true --- false
		 * cond 1 && cond 2 -- true and false --- false
		 * cond 1 && cond 2 -- false and false --- false
		 * 
		 * cond 1 || cond 2 -- true and true --- true
		 * cond 1 || cond 2 -- false and true --- true
		 * cond 1 || cond 2 -- true and false --- true
		 * cond 1 || cond 2 -- false and false --- false
		 * 
		 * ! - true > false
		 * 	false > true
		 * 
		 * Ternary : 3 operand
		 * condition ? statement 1 : statement 2
		 * 
		 * Assignment operator : =
		 * 
		 * a+b 
		 */
		System.out.println("Unary Operator");
		int a = 10;
		System.out.println(a++);//10 > 11
		System.out.println(a);//11
		
		int b=20;
		System.out.println(++b);//21
		
		int c=12;
		System.out.println(c--);//12 >> 11
		
		int d=23;
		System.out.println(--d);//22
		
		int e = 12;
		System.out.println(e++ + ++d + c--);//12 + 23 + 11 - 35
		
		System.out.println("Binary Operators");
		
		int s1 = 23;
		int s2 = 23;
		System.out.println(s1<s2);//false
		System.out.println(s1==s2);//true
		System.out.println(s1<=s2);//true
		
		int l1=6;
		int l2=74;
		int l3=54;
		System.out.println("Logical Operator");
		System.out.println(l1<l2 && l1<l3); //true && false - false
		System.out.println(l1<l2 || l1<l3);//true || false - true
		System.out.println(!(l1<l2));//false
		
		int j=12;
		//condition ? statement 1 : statement 2
		System.out.println(j<10?"j is less than 10":"j is not less than 10");
		
		//find the smallest of 3 numbers
		
		System.out.println((l1<l2 && l1<l3)?"l1 is the smallest":(l2<l3?"l2 is the smallest":"l3 is the smallest"));
		
		int i1=45;
		int i2=9;
		
		System.out.println(i1+i2);
		System.out.println(i1-i2);
		System.out.println(i1*i2);
		System.out.println(i1/i2);//quotient
		System.out.println(i1%i2);//remainder
	}

}
