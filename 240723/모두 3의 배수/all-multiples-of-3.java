import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner in = new Scanner(System.in);
        boolean satisfied = true;
        for (int i = 1; i <= 5; i++) {
            int n = in.nextInt();
            if ( n % 3 != 0) {
                satisfied = false;
            }
        
        }
        if ( satisfied == true) {
            System.out.print(1);
        } else {
            System.out.print(0);
        }
    }
}