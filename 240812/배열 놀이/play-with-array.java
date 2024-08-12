import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner in = new Scanner(System.in);

        int n = in.nextInt(), q = in.nextInt();
        int[] arr = new int[105];
        int[] arr2 = new int[105];
        boolean tf = false;

        for( int i = 0; i< n; i++) {
            arr[i] = in.nextInt();
        }

        int q1 = in.nextInt(), a = in.nextInt();
        System.out.println(arr[a-1]);

        int q2 = in.nextInt(), b = in.nextInt();
        for (int i = 0; i<n; i++) {
            if (arr[i] == b) {
                System.out.println(i+1);
                tf = true;
                break;
            }
        }
        if (tf == false) {
            System.out.println(0);
        }

        int q3 = in.nextInt(), s = in.nextInt(), e = in.nextInt();
        for (int i = s-1; i < e; i++) {
            System.out.print(arr[i]+ " ");
        }
    }
}