import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int[] arr = new int[100];

        for (int i = 0; i< n; i++) {
            arr[i] = in.nextInt();
        }

        final int INT_MAX = Integer.MAX_VALUE;

        int minVal = INT_MAX;

        for (int i = 0; i<n; i++) {
            if (arr[i] < minVal) {
                minVal = arr[i];
            }
        }

        int cnt= 0;

        for (int i = 0; i<n; i++) {
            if (minVal == arr[i]) {
                cnt++;
            }
        }

        System.out.printf("%s %s",minVal,cnt);
    }
}