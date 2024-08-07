import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner in = new Scanner(System.in);

        int[] arr = new int[10];
        double cnt = 0;
        int sum = 0;

        for (int i = 0; i<= 9; i++) {
            arr[i] = in.nextInt();
            if (arr[i] == 0) {
                System.out.printf("%s %.1f", sum, sum/cnt);
                break;
            }
            sum += arr[i];
            cnt++;
            if (i == 9) {
                System.out.printf("%s %.1f", sum, sum/cnt);
            }
        }
    }
}