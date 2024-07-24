import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner in = new Scanner(System.in);

        int cnt = 0;
        while (true) {
            int n= in.nextInt();
            cnt++;
            if (n % 2 !=0) {
                continue;
            } else {
                System.out.println(n / 2);
            }
            if ( cnt >= 3) {
                break;
            }
        }
    }
}