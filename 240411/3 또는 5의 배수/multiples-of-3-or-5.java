import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

     
       
       Scanner in = new Scanner(System.in);

       int a = in.nextInt();

        String b =(a % 3 == 0 ) ? "YES" : "NO";
        System.out.println(b);

        String c =(a % 5 == 0) ? "YES" : "NO";
        System.out.print(c);

    }
}