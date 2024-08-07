import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner in = new Scanner(System.in);

        int n =in.nextInt();
        double[] arr = new double[5];
        double sum = 0;
        int cnt = 0;
        double avg;

        for (int i = 0; i<n; i++) {
            arr[i] = in.nextDouble();
            sum += arr[i];
            cnt++;
        }
        avg = sum/cnt;
        System.out.printf("%.1f",avg);
        System.out.println();
        if (avg >= 4.0) {
            System.out.print("Perfect");
        } else if ( avg >= 3.0) {
            System.out.print("Good");
        } else {
            System.out.print("Poor");
        }
    }
}