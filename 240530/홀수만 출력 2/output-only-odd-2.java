import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner in = new Scanner(System.in);

        int b = in.nextInt(), a = in.nextInt();

        for (int i = b; i >= a; i -= 2) {
            System.out.print(i + " ");
        }
    }
}