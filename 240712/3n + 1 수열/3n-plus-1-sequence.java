import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int cnt = 0;
        while (true) {

            if ( n % 2 == 0 ) {
                n = n/2;
                cnt++;
            } else if ( n %2 != 0 && n != 1) {
                n = n*3 + 1;
                cnt++;
            } else if ( n == 1) {
                System.out.print(cnt);
                break;
            }
        } 
    }
}