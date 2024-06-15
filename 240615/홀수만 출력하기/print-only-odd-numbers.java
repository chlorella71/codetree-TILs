import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        for (int i = 1; i <=n; i++) {
            int a = in.nextInt();
            if (a % 2 == 1 && a % 3 == 0) {
                System.out.println(a);
            }
        }
    }
}