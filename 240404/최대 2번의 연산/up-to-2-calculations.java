import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner in = new Scanner(System.in);

        int a = in.nextInt();

        if ( a % 2 == 0) {
            a = a / 2;
        }  

        if ( a % 2 != 0) {
           a = ( a + 1 ) / 2;
        } 
        System.out.print(a);
    } 
}