package StringInterviewQuestions;

public class FindFirstUniqueCharacter {
    public static void main(String[] args) {
        String str = "swiss";
        Character ch=firstUniqueCharacter(str);
        if(ch!=null){
            System.out.println("First non-repeting character is: " + ch);
        }
        else{
            System.out.println("No unique character");
        }
    }

    static Character firstUniqueCharacter(String str){
        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);
            if(str.indexOf(c)==str.lastIndexOf(c)){
                return c;
            }
        }
      return null;
    }
}
