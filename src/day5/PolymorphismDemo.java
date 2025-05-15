package day5;

public class PolymorphismDemo {

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.lunchBreak();
		
		Staff st1 = new Staff();
		st1.lunchBreak();
		
		Teacher t1 = new Teacher();
		t1.lunchBreak();
		

	}

}
