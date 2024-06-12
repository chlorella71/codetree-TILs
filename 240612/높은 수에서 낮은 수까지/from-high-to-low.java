import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner in = new Scanner(System.in);

        int a = in.nextInt(), b = in.nextInt();

        if ( a >= b) {
            for (int i = a; i <= b; i--) {
                System.out.print(i + " ");
            }
        } else if ( b > a ) {
            for (int i = b; i >= a; i--) {
                System.out.print(i + " ");
            }
        }
    }
}