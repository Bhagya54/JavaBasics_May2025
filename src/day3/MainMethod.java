package day3;

public class MainMethod {

	public static void main(String[] args) {
		//Object creation - particular student enrolled into school
		//classname ref = new classname();
		
		Student s1 = new Student();// obj1
		s1.sid=1;
		s1.sname = "raj";
		s1.grade = '1';
		s1.section='a';
		Student.schoolName="kairos";
		
		Student s2 = new Student();// obj1
		s2.sid=12;
		s2.sname = "sheela";
		s2.grade = '2';
		s2.section='b';
		
		
		System.out.println("Student 1 details: " + s1.sid + " " + s1.sname);
		s1.attendSession();
		s1.submitProject();
		System.out.println("Student 2 details: " + s2.sid + " " + s2.sname );
		s2.attendSession();
		s2.submitProject();
		
		Student.getSchoolName();
	
	}

}
