import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner in = new Scanner(System.in);

        int[] arr =new int [4];
        int n = in.nextInt();
        int sum = 0;
        int cnt = 0;

        for (int i = 1;i <= n; i++) {
            sum = 0;
            for (int j = 0; j<=3; j++) {
                arr[j] = in.nextInt();
                sum += arr[j];
            }
            if ( sum/4 >= 60) {
                System.out.println("pass");
                cnt++;
            } else {
                System.out.println("fail");
            }
        }
        System.out.print(cnt);
    }
}