import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner in = new Scanner(System.in);

        int[] arr = new int[10];

        final int INT_MIN = Integer.MIN_VALUE;
        int maxValue = INT_MIN;
        for (int i = 0; i< 10; i++) {
            arr[i] = in.nextInt();
            if (maxValue < arr[i]) {
                maxValue = arr[i];
            }
        }
        System.out.print(maxValue);
    }
}