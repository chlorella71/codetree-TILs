import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner in = new Scanner(System.in);

        int y = in.nextInt();

        if ( y % 4 == 0 && y <= 400) {
            System.out.print("true");
        } else if ( y > 400 && y % 400 != 0 && y % 100 == 0) {
            System.out.print("false");
        } else if ( y % 4 == 0 && y > 400 ) {
            System.out.print("true");
            } else {
            System.out.print("false");
        }
    }
}