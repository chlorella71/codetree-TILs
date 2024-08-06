import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        for (int i = 1; i<=n; i++) {
            int a = in.nextInt(), b = in.nextInt();
            int sum = 0;

            for ( int j = a; j <= b; j++) {
                if (j % 2 ==0) {
                    sum += j;
                }
            }
            System.out.println(sum);
        }
    }
}