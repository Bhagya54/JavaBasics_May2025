package day7_differentPackage;

import day7.AccessModifiers;

public class AModi extends AccessModifiers{

	public static void main(String[] args) {
		AccessModifiers am = new AccessModifiers();
		//System.out.println(am.a);
		System.out.println(am.d);

		AModi amo = new AModi();
		
		System.out.println(amo.d);//public
		System.out.println(amo.c);//protected
	}

}
