import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        for (int i = 1; i <= 2; i++) {
            for (int j = 1; j <= n; j++) {
                for(int k = 1; k <= n; k++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}