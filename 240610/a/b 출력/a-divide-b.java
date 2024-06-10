import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner in = new Scanner(System.in);

        double a = in.nextDouble(), b = in.nextDouble();
        double c = a/b;

        String d = String.format("%.20f", c);

        for ( int i = 0; i <= 21 && i <= d.length(); i++) {
            System.out.print(d.charAt(i));
        }
    }
}