import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        for (int i = 1; i<=2*n+1; i++) {
            if (i % 2 != 0) {
                for (int j=1; j<=2*n+1; j++) {
                    System.out.print("* ");
                }
            } else {
                for (int k = 1; k <= n+1; k++) {
                    System.out.print("*   ");
                }
            }
            System.out.println();
            
        }
    }
}