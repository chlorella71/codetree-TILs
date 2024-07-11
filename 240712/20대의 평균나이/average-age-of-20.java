import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner in = new Scanner(System.in);
        double sum = 0;
        int cnt = 0;

        while (true) {
            int n = in.nextInt();
            if ( 20<= n && n <= 29) {
            sum += n;
            cnt++;
            continue;
            } else if ( n < 20 || n >= 30) {
                break;
            }
        }

        System.out.printf("%.2f", sum/cnt);
    }
}