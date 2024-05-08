import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner in = new Scanner(System.in);

        int g = in.nextInt(),  a = in.nextInt();
        
        if (a >= 19) {
            if (g == 0) {
                System.out.print("MAN");
            } else if (g == 1) {
                System.out.print("WOMAN");
            }
        } else if ( a < 19) {
            if ( g == 0) {
                System.out.print("BOY");
            } else if ( g == 1 ) {
                System.out.print("GIRL");
            }
        }
    }
}