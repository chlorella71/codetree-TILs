import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner in= new Scanner(System.in);

        int n= in.nextInt();
        final int INT_MIN = Integer.MIN_VALUE;
        int max = INT_MIN;

        int[] arr = new int[1000];
        int[] arr2 = new int[1000];
        int idx = 0;
        boolean x = false;
        boolean y = true;

        for (int i = 0; i< n; i++) {
            arr[i] = in.nextInt();
        }

        for (int i = 0; i< n; i++) {
            x = false;
            for (int j = 0; j <n; j++) {
                if ( i == j) {
                    continue;
                } else {
                    if (arr[i] == arr[j]) {
                        x = true;
                    }
                }
            }
            if (x == false) {
                arr2[idx] = arr[i];
                idx++;
                y = false;
            }
        }
        if (y == true) {
            System.out.print(-1);
        } else {
            for (int i = 0; i<= idx; i++) {
                if (max < arr2[i]) {
                    max = arr2[i];
                }
            }
            System.out.print(max);
        }     
    }
}