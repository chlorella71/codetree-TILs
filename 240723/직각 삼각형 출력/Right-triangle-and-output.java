import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        System.out.println('*');
        if (n % 2 == 0) {
            for (int i = 1; i < n; i++) {
                for (int j = 1; j <= i+1; j++) {
                    System.out.print('*');
                }
                System.out.println();
            }
        } else {
            for (int i = 1; i < n; i++) {
                for (int j = 1; j <= (2*i+1); j++) {
                    System.out.print('*');
                }
                System.out.println();
            }
        }
    }
}