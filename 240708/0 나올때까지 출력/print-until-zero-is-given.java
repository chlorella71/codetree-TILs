import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner in = new Scanner(System.in);

        while (true) {
            int n = in.nextInt();
            if ( n == 0) {
                break;
            }
            System.out.println(n);
        }   
    }
}