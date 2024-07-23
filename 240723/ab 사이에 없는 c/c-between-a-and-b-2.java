import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        boolean satisfied = true;

        for ( int i = a; i <= b; i++) {
            if ( i % c == 0) {
                satisfied = false;
            }
        }

        if ( satisfied = true ) {
            System.out.print("YES");
        } else {
            System.out.print("NO");
        }
    }
}