import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner in = new Scanner(System.in);

        int a = in.nextInt(), b = in.nextInt(), c = in.nextInt();

        if (a <= b && a <= c) {
            System.out.print(a);
        } else if (b <= a && b <= c) {
            System.out.print(b);
        } else if (c <= a && c <= b) {
            System.out.print(c);
        }
    }
}