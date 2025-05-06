package day4;

public class Student {
/*
 * Constructor Overloading
 * 	- same name
 *  -  difference in no. of parameter that are sent
 *  -  difference in type of parameter that are sent
 * 
 * this - current class variable
 * 
 */
	int sid;
	String sname;
	char grade;
	char section;
	static String schoolName;
	int age;
	String panCard;
	String aadharCard;
	public Student(int sid,String sname) {
		this.sid=sid;
		this.sname=sname;
	}
	
	public Student(int sid,int age) {
		this.sid = sid;
		this.age = age;
	}
	
	public Student(String panCard,int sid) {
		this.panCard=panCard;
		this.sid = sid;
	}
	public Student(int sid,String sname,String panCard) {
		this.sid=sid;
		this.sname=sname;
		this.panCard = panCard;
	}
	
	public Student(int sid,String sname,String panCard,String aadharCard) {
		this.sid=sid;
		this.sname=sname;
		this.panCard = panCard;
		this.aadharCard = aadharCard;
	}
	
	
	
	
}
