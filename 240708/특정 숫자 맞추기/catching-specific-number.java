import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner in = new Scanner(System.in);

        while (true) {
            int n = in.nextInt();
            if (n < 25) {
                System.out.println("Higher");
                continue;
            } else if (n > 25) {
                System.out.println("Lower");
                continue;
            } else if ( n ==25) {
                System.out.println("Good");
                break;
            }
        }
    }
}