import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a = 1;
        int cnt = 0;


        while (true) {
            a *= 2;
            cnt++;
            if ( n == a) {
                System.out.print(cnt);
                break;
            }
        }
    }
}