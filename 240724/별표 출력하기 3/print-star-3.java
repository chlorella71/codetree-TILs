import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        for (int i = n; i >= 1; i--) {
            for (int j = 1; j<=n-i; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= 2*i-1; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}