import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner in = new Scanner(System.in);

        int a = in.nextInt(), b = in.nextInt();
        boolean s = false;

        for (int i = a; i <= b; i++) {
            if ( 1920 % i == 0 && 2880 % i == 0) {
                s = true;
            }
        }
        if ( s == true) {
            System.out.print(1);
        } else {
            System.out.print(0);
        }
    }
}