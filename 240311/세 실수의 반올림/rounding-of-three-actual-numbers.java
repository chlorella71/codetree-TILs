import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner in = new Scanner(System.in);
        double a = in.nextDouble(), b = in.nextDouble(), c = in.nextDouble();
        System.out.printf("%.3f\n" + "%.3f\n" + "%.3f\n", a, b, c);
    }
}