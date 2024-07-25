import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        for (int i = 1; i<=n; i++) {
            for (int j = n-i; j>=1; j--) {
                System.out.print("  ");
            }
            for (int k = 1; k<=i; k++) {
                System.out.print("@ ");
            }
            System.out.println();
        }
        for (int i = n-1; i>=1; i--) {
            for (int k = 1; k<=i; k++) {
                System.out.print("@ ");
            }
            for (int j = n-i; j>=1; j--) {
                System.out.print("  ");
            }
            System.out.println();
        }
    }
}