import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner in = new Scanner(System.in);
        int mathOfA = in.nextInt(), engOfA = in.nextInt();
        int mathOfB = in.nextInt(), engOfB = in.nextInt();

        if ( mathOfA > mathOfB && engOfA > engOfB )
        System.out.print(1);
        else {
            System.out.print(0);
        }
    }
}