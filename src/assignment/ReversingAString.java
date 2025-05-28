package assignment;

public class ReversingAString {

	public static void main(String[] args) {
		String str = "kumar";
		System.out.println(str.length());//5
		//String revStr = "ramuk";
		String revStr="";
		for(int i=str.length()-1;i>=0;i--) {//i=0
			char c1 = str.charAt(i);//k
			revStr=revStr+c1;//ramuk
		}
		
		System.out.println("Reverse of a given string is: " + revStr);

	}

}
