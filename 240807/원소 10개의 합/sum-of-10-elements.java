import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner in = new Scanner(System.in);

        int sum = 0;

        for (int i = 1; i<= 10; i++) {
            int n = in.nextInt();

            sum += n;
        }
        System.out.print(sum);
    }
}