import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner in = new Scanner(System.in);

        int m = in.nextInt();
        
        if ( 3 <= m && m <= 5) {
            System.out.print("Spring");
        } else if ( 6 <= m && m <= 8) {
            System.out.print("Summer");
        } else if ( 9 <= m && m <= 11) {
            System.out.print("Fall");
        } else {
            System.out.print("Winter");
        }

    }
}