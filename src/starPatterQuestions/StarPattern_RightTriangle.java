package starPatterQuestions;
/*
        *
      * *
    * * *
  * * * *
* * * * *

1.Decreasing space
2.Increasing star
 */
public class StarPattern_RightTriangle {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=i;j<=n;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
