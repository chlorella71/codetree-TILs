import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner in = new Scanner(System.in);

        int a = in.nextInt();

        System.out.print( a % 3 == 0 || a % 5 == 0 ? 1 : 0 );

    }
}