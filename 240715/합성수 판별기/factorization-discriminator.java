import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        boolean s = false;

        for ( int i = 2; i < n; i++) {
            if ( n % i == 0) {
                s = true;
            }
        }

        if ( s == true) {
            System.out.print('C');
        } else {
            System.out.print('N');
        }
    }
}