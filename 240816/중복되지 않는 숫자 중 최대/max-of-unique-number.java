import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner in= new Scanner(System.in);

        int n= in.nextInt();
        final int INT_MIN = Integer.MIN_VALUE;
        int max = INT_MIN;

        int[] arr = new int[1000];
        boolean x = false;
        int y = -1;

        for (int i = 0; i< n; i++) {
            arr[i] = in.nextInt();
            if ( arr[i] > max) {
                max = arr[i];
            } else if (arr[i] == max) {
                x = true;

            }
        }
        if (x == true) {
            System.out.print(y);
        } else {
            System.out.print(max);
        }
    }
}