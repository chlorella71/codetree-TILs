import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner in = new Scanner(System.in);

        int[] arr = new int[10];

        for (int i = 0; i< 10; i++) {
            arr[i] = in.nextInt();

            if ( arr[i] % 3 == 0) {
                System.out.print(arr[i-1]);
                break;
            }
        }
    }
}