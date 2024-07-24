import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner in = new Scanner(System.in);

        int a = in.nextInt(), b = in.nextInt();

        System.out.print(a/b+ ".");
        for (int i = 1; i<= 20; i++) {
            a %= b;
            a *= 10;
            System.out.print(a/b);
            a %= b;
        }
    }
}