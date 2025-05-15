package day5;

public class MainMethodClass {
public static void main(String[] args) {
	Student s1 = new Student();
	s1.attendSession();
	s1.submitProject();
	s1.lunchBreak();
	s1.markAttendance();
	
	Staff st1 = new Staff();
	st1.calculateSalary();
	st1.processAttendance();
	st1.markAttendance();
	st1.lunchBreak();
	
	Teacher t1 = new Teacher();
	t1.conductSession();
	t1.evaluateProject();
	t1.markAttendance();
	t1.lunchBreak();
}
}
