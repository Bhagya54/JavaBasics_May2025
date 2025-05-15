package assignment;

public class CollegeTeacher {

	public static void main(String[] args) {
		Teacher t1 = new Teacher(123,"sanju","maths");
		
		t1.conductSession();
		t1.evaluateProject();
		System.out.println(t1.tid + " " + t1.tname + " " + t1.subject);
		
		Teacher.schoolName="vedantu";
		Teacher.getSchoolName();

		Teacher t2 = new Teacher(456,"tina","science");
	//restrict user to provide the inialization of variables
	//	
		System.out.println(t2.tid + " " + t2.tname + " " + t2.subject);
	}

}
