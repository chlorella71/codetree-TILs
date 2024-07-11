import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner in = new Scanner(System.in);

        while (true) {
            int x = in.nextInt();
            int y = in.nextInt();
            char a = in.next().charAt(0);

            System.out.println(x*y);
            if (a == 'C') {
                break;
            }
        }
    }
}