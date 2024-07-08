import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner in = new Scanner(System.in);

        while (true) {
            int n = in.nextInt();
            if ( n == 1) {
                System.out.println("John");
                continue;
            } else if ( n == 2) {
                System.out.println("Tom");
                continue;
            } else if ( n == 3) {
                System.out.println("Paul");
                continue;
            } else if ( n == 4) {
                System.out.println("Sam");
                continue;
            } else {
                System.out.println("Vacancy");
                break;
            }
        }
    }
}