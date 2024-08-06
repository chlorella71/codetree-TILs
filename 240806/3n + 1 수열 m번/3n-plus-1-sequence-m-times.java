import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner in = new Scanner(System.in);

        int m = in.nextInt();

        for (int i = 1; i<= m; i++) {
            int n= in.nextInt();
            int cnt= 0;

            while (true) {
                if ( n == 1) {
                    System.out.println(cnt);
                    break;
                } else if ( n % 2 ==0) {
                    n /=2;
                } else {
                    n *=3;
                    n +=1;
                }
                cnt++;
                
            }
        }
    }
}