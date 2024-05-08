import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner in = new Scanner(System.in);
        int a = in.nextInt(), b = in.nextInt();

        if ( a >= 90) {
            if ( b >= 95) {
                System.out.print(100000);
            } else if ( b >= 90) {
                System.out.print(50000);
            } else {
                System.out.print(0);
            }
        } else {
                System.out.print(0);
            }
    }
}