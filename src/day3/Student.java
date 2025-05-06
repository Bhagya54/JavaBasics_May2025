package day3;

public class Student {

	int sid;
	String sname;
	char grade;
	char section;
	static String schoolName;
	int age;
	
	public void submitProject() {
		int a=10;//inside the method - local variable
		System.out.println("Student submits project: "+ a);
		System.out.println(sid);
	}
	
	public void attendSession() {
		System.out.println("Student attends session: ");
		System.out.println(sid);
		System.out.println(schoolName);
	}
	
	public static void getSchoolName() {
		System.out.println("School Name: " + schoolName);
		//System.out.println("id: " + sid);
	}
	
	
	
}
