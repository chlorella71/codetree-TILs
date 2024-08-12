import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner in = new Scanner(System.in);

        int n = in.nextInt(), m = in.nextInt();

        int[] arr = new int[105];

        int cnt =0;

        for (int i= 0; i < n; i++) {
            arr[i] = in.nextInt();
            if (arr[i] == m) {
                cnt++;
            }
        }
        System.out.print(cnt);
    }
}