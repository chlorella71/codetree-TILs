import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner in = new Scanner(System.in);

        int cnt3 = 0, cnt5 = 0;

        for (int i = 1; i <= 10; i++) {
            int n = in.nextInt();
            
            if ( n % 3 == 0 && n % 5 == 0 ) {
                cnt3++;
                cnt5++;
            } else if ( n % 3 == 0) {
                cnt3++;
            } else if ( n % 5 == 0) {
                cnt5++;
            }
        }

        System.out.print(cnt3 + " " + cnt5);
    }
}