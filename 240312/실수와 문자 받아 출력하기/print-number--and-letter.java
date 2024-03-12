import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner in = new Scanner(System.in);
        String s = in.next();
        double a = in.nextDouble(), b = in.nextDouble();
        char c = s.charAt(0);
        System.out.printf("%s\n%.2f\n%.2f", c, a, b);
    }
}