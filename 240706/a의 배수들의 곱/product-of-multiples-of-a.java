import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner in = new Scanner(System.in);

        int prod = 1;
        int a =in.nextInt(), b = in.nextInt();

        for (int i = 1; i <= b; i++) {
            if ( i % a ==0 ) {
                prod *= i;
            }
        }
        System.out.print(prod);
    }
}