import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner in= new Scanner(System.in);

        int n= in.nextInt();
        final int INT_MIN = Integer.MIN_VALUE;
        int max = INT_MIN;
        // int max2 = INT_MIN;

        int[] arr = new int[1000];
        int[] arr2 = new int[1000];
        int idx = 0;
        int cnt = 0;
        boolean x = false;
        boolean y = false;
        // int y = -1;

        for (int i = 0; i< n; i++) {
            arr[i] = in.nextInt();
        }

        for (int i = 0; i< n; i++) {
            x = false;
            if (i != n-1) {
                for (int j = 0; j< n; j++) {
                    if (i == j) {
                        continue;
                    }else if (arr[i] == arr[j]) {
                        x = true;
                    }
                    if (j == n-1 && x == false) {
                        arr2[idx] = arr[i];
                        idx++;
                        cnt++;
                    }   
                }
            } else {
                for (int k = 0; i < n-1; i++) {
                    if (arr[k] == arr[n-1]) {
                        y = true;
                    } 
                }
                if ( y == false) {
                    arr[idx] = arr[n-1];
                }
            }
        }
        if (cnt == 0 ) {
            System.out.print(-1);
        } else {
            for (int i = 0; i <= idx; i++) {
                if (max < arr2[i]) {
                    max = arr2[i];
                }
            }
            System.out.print(max);
        }
    }


        // for (int i = 0; i< n; i++) {
        //     for (int j =i+1; j<n; j++) {
        //         if (arr[i] == arr[j]) {
        //             continue;
        //         }
        //         if (j == n-1) {
        //             arr2[idx] = arr[i];
        //             idx++;
        //         }
        //     }
        // }
        // if ( x == false) {
        //     System.out.print(-1);
        // } else {
        //     for (int i = 0; i <= idx; i++) {
        //         if (max < arr2[i]) {
        //             max = arr2[i];
        //         }
        //     }
        //     System.out.print(max);
        // }
}