import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner in = new Scanner(System.in);

        int[] arr = new int[10];
        int sum = 0;
        int sum2 = 0;

        for (int i = 0; i< 10; i++) {
            arr[i] = in.nextInt();
            if ((i +1) % 2 == 0) {
                sum2 += arr[i];
            } else {
                sum += arr[i];
            }
        }
        if (sum >= sum2 ) {
            System.out.print(sum-sum2);
        } else {
            System.out.print(sum2-sum);
        }
    }
}