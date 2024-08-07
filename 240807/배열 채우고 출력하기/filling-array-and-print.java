import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner in = new Scanner(System.in);

        char[] arr = new char[10];

        for (int i = 0; i<= 9; i++) {
            arr[i] = in.next().charAt(0);
        }

        for (int i = 9; i >=0; i--) {
            System.out.print(arr[i]);
        }
    }
}