import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner in= new Scanner(System.in);

        int[] arr = new int[1005];
        final int INT_MIN = Integer.MIN_VALUE;
        final int INT_MAX = Integer.MAX_VALUE;
        int max = INT_MIN;
        int min = INT_MAX;

        for (int i = 0; i<1005; i++) {
            arr[i] = in.nextInt();
            if (arr[i] == 999 || arr[i] == -999) {
                break;
            }
            if (max < arr[i]) {
                max = arr[i];
            }
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.print(max+" " + min);
    }
}