import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner in = new Scanner(System.in);

        double a = in.nextDouble(), b = in.nextDouble();
        double c = a/b;

        System.out.printf("%.20f", c);
    }
}