import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int cnt = 0;

        for (int i = 1; i <= 5000; i++) {
            cnt++;
            n = n / i;
            if (n <= 1) {
                break;
            }
        }
        System.out.print(cnt);
    }
}