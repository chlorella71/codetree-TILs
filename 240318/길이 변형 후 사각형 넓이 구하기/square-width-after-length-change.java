import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner in = new Scanner(System.in);
        int x = in.nextInt(), y = in.nextInt();
        x += 8;
        y *= 3;
        System.out.printf("%s\n%s\n%s", x, y, x * y);
    }
}