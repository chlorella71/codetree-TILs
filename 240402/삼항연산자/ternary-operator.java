import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        a = a== 100 ? 0 : 9;
        if ( a == 0) {
            System.out.print("pass");
        } else {
            System.out.print("failure");
        }
    }
}