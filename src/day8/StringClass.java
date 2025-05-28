package day8;

public class StringClass {
	/*
	 * String : Non- primitive datatype
	 * class
	 * store sequence of characters
	 * Selenium With Java
	 * muineles
	 * 
	 * String object is immutable
	 * 2 ways create a String
	 * 1. String Literal
	 * String s2 = "hdhas";
	 * 2. new keyword
	 * String st1 = new String("")
	 * 
	 */

	public static void main(String[] args) {
//		String s1 = new String("selenium");
//		System.out.println(s1);
//		s1=s1.concat(" with java");
//		System.out.println(s1);
		
		int i1 = 23;
		int i2 = 23;
		System.out.println(i1==i2);
		
		
		String sl1 = "java";
		String sl2 = "python";
		String sl3 = "java";
		
		System.out.println(sl1==sl2);//2 references are pointint to same object or not
		System.out.println(sl1==sl3);//true
		
		
		System.out.println(sl1.equals(sl2));//comparing values inside sl1 and sl2
		System.out.println(sl1.equalsIgnoreCase(sl3));//true
		
		System.out.println("Using new Keyword");
		
		String sn1 = new String("coffee");
		String sn2 = new String("tea");
		String sn3 = new String("coffee");
		
		System.out.println(sn1==sn2);//false
		System.out.println(sn1==sn3);//false
		
		
		System.out.println(sn1.equals(sn3));//true
		
		System.out.println(sn2.charAt(2));//a
		System.out.println(sn2.length());//3
		
		System.out.println(sn1.contains("f"));//true
		System.out.println(sn1.contains("z"));//false
		
		System.out.println(sn1.endsWith("ffee"));
		System.out.println(sn1.startsWith("cod"));
		
		System.out.println(sl1.indexOf('a'));//1 - java
		System.out.println(sl1.lastIndexOf('a'));//3
		
		String so = " ";
		System.out.println(so.isBlank());//true
		System.out.println(so.isEmpty());//false
		
		System.out.println(sl1.replace('a', 'z'));
		
		String st1 = "CHROMIUMdriver in java";
		System.out.println(st1.substring(3));
		System.out.println(st1.substring(3,8));
		
		System.out.println(st1.toUpperCase());
		
		char[] c1=st1.toCharArray();
		for(int i=0;i<c1.length;i++) {
			System.out.print(c1[i]);//CH
		}
		
		
		// String s1 = "kumar" -- Reverse - charAt() length()-1 -- 0
		//StringBuffer is muttable - can change its value
		
		System.out.println();
		StringBuffer sb1 = new StringBuffer("kumar");
		sb1.append(" Student");
		System.out.println(sb1);
		
		System.out.println(sb1.reverse());
		
		

	}

}
