import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        for(int i = 1; i <= n; i++) {
            for (int k = 1; k <= i-1; k++) {
                System.out.print("  ");
            }
            for(int j = 2*n-2*i+1; j>=1; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for(int i = 1; i <= n-1; i++) {
            for (int k = n-1-i; k >= 1; k--) {
                System.out.print("  ");
            }
            for(int j = 1; j<=2*i+1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}