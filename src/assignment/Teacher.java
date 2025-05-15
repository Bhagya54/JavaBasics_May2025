package assignment;

public class Teacher {

	int tid;
	String tname;
	String subject;
	static String schoolName;
	
	public Teacher(int tid,String tname,String subject) {
		this.tid=tid;//456
		this.tname=tname;//tina
		this.subject=subject;//science
	}
	
	public void conductSession() {
		System.out.println("Teacher conducts session");
	}
	
	public void evaluateProject() {
		System.out.println("Teacher evaluates project");
	}
	
	public static void getSchoolName() {
		System.out.println("School name: " + schoolName);
	}
}
