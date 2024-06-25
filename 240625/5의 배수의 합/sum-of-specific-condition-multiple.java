import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner in = new Scanner(System.in);

        int a = in.nextInt(), b = in.nextInt();
        int cnt = 0;

        if (a <= b) {
            for (int i = a; i <= b; i++) {
                if ( i % 5 == 0) {
                    cnt += i;
                }
            }
        } else if ( a > b) {
            for (int i = b; i <= a; i++) {
                if ( i % 5 == 0) {
                    cnt += i;
                }
            }
        }
        System.out.print(cnt);
    }
}