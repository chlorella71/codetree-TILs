import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner in = new Scanner(System.in);

        int n = in.nextInt(), q = in.nextInt();
        int[] arr = new int[105];

        for( int i = 0; i< n; i++) {
            arr[i] = in.nextInt();
        }
        for (int i = 0; i<q; i++) {
            int x = in.nextInt();
            if (x == 1) {
                int a = in.nextInt();
                System.out.println(arr[a-1]);
            } else if (x == 2) {
                int b = in.nextInt();
                boolean tf = false;
                for (int j = 0; j<n; j++) {
                    if (arr[j] == b) {
                        System.out.println(j+1);
                        tf = true;
                        break;
                    }
                }
                if (tf == false) {
                    System.out.println(0);
                }
            } else if ( x == 3) {
                int s = in.nextInt(), e = in.nextInt();
                for (int j = s-1; j < e; j++) {
                    System.out.print(arr[j]+ " ");
                }
                System.out.println();
            }
        }
    }
}