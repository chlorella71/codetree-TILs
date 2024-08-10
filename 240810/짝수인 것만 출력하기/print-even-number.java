import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner in = new Scanner(System.in);

        int[] arr = new int[105];

        int n =in.nextInt();

        for (int i = 0; i< n; i++) {
            arr[i] = in.nextInt();

            if ( arr[i] % 2 == 0) {
                System.out.print(arr[i]+ " ");
            }
        }
    }
}