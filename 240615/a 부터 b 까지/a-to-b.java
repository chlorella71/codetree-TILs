import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner in = new Scanner(System.in);

        int a = in.nextInt(), b = in.nextInt();

        for ( int i = a; i <= b;) {
            if ( (i % 2) != 0) {
                System.out.print(i + " ");
                i *= 2;
            } else {
                System.out.print(i+ " ");
                i += 3;
            }

        }
    }
}