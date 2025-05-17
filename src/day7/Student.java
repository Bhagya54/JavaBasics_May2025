package day7;
/*
 * Encapsulation : hiding the data - variables
 * 
 * 
 * read - write
 * 
 * getter - read and setter - write
 */
public class Student {

	private int id=100;
	private String name;
	private char grade;
	private char section;
	static String schoolName;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public char getGrade() {
		return grade;
	}
	public char getSection() {
		return section;
	}
	public static String getSchoolName() {
		return schoolName;
	}
	
	
	
	
}
