import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        for (int i = n; i>=1; i--) {
            for (int l = 1; l <= 2; l++) {
                for (int j = i; j>= 1; j--) {
                    System.out.print('*');
                }
                for (int k = 1; k<=n-i; k++) {
                    System.out.print("  ");
                }
            }
            

            System.out.println();
        }
    }
}