import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner in = new Scanner(System.in);
        int a = in.nextInt() + 87, b = in.nextInt() % 10;
        System.out.print(a + "\n" + b);
    }
}