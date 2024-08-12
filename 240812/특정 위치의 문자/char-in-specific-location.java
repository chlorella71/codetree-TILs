import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner in = new Scanner(System.in);

        char[] arr = new char[]{'L','E','B','R','O','S'};

        char a = in.next().charAt(0);

        boolean b = false;

        for (int i = 0; i < 6; i++) {
            if ( a == arr[i]) {
                b = true;
                System.out.print(i);
            }
        }
        if ( b == false) {
            System.out.print("None");
        }
    }
}