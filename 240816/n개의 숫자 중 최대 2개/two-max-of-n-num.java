import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] arr= new int[100];
        int[] arr2 = new int[100];
        final int INT_MIN = Integer.MIN_VALUE;
        final int INT_MAX = Integer.MAX_VALUE;
        int min = INT_MAX;
        int max = INT_MIN;
        int cnt = 0;

        for (int i = 0; i< n; i++) {
            arr[i] = in.nextInt();
        }

        for (int i= 0; i<n; i++) {
            max = INT_MIN;
            for (int j = 0; j<n; j++) {
                if (arr[j] > max) {
                    max = arr[j];
                    cnt = j;
                }

                if (j == n-1) {
                    arr2[i] = arr[cnt];
                    arr[cnt] = 0;
                }
            }
        }
        System.out.print(arr2[0]+" "+arr2[1]);
    }
}