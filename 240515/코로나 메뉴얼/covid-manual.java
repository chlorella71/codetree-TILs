import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner in = new Scanner(System.in);

        char A = in.next().charAt(0);
        int a = in.nextInt();
        char B = in.next().charAt(0);
        int b = in.nextInt();
        char C = in.next().charAt(0);
        int c = in.nextInt();
        
        if ( A == 'Y' && a >=37 ) {
            if ( (B == 'Y' && b >= 37) || (C == 'Y' && c >= 37)) {
                System.out.print("E");
            } else {
                System.out.print("N");
            }
        } else if ((B == 'Y' && b >=37) && (C == 'Y' && c >= 37)) {
                System.out.print("E");
        } else {
            System.out.print("N");
        }
        
    }
}