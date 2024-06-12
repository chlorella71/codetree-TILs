import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner in = new Scanner(System.in);

        char c = in.next().charAt(0);
        int n = in.nextInt();

        if (c == 'A') {
            for (int i = 1; i <= n; i++) {
                System.out.print(i + " ");
            }
        } else if (c == 'D') {
            for (int i = n; i >= 1; i--) {
                System.out.print(i + " ");
            }
        }
    }
}