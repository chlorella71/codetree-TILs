import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner in= new Scanner(System.in);

        int start = in.nextInt(), end = in.nextInt();
        int cnt = 0;
        int sum = 0;

        for (int i = start; i<= end; i++) {
            for ( int j= 1; j < i; j++) {
                if ( i % j == 0) {
                    sum += j;
                }
            }
            if ( sum == i) {
                cnt++;
            }
        }
        System.out.print(cnt);
    }
}