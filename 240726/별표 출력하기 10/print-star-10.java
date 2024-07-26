import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int cnt1 = 1;
        int cnt2 = n;


        for (int i = 1; i <= n; i++) {
            if ( i % 2 !=0 ) {
                for (int j = 1; j <= cnt1; j++) {
                    System.out.print("* ");
                }
                cnt1++;
            } else {
                for (int k = cnt2; k >=1; k--) {
                    System.out.print("* ");
                }
                cnt2--;
            }
            System.out.println();
            
        }
        for (int i = n; i >= 1; i--) {
            if ( i % 2 ==0 ) {
                for (int j = 1; j <= cnt1; j++) {
                    System.out.print("* ");
                }
                cnt1++;
            } else {
                for (int k = cnt2; k >=1; k--) {
                    System.out.print("* ");
                }
                cnt2--;
            }
            System.out.println();
            
        }

    }
}