import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner in = new Scanner(System.in);

        int[] arr = new int[10];
        int sum = 0;
        double sum2 = 0;
        double avg;
        double cnt = 0;

        for (int i = 0; i< 10; i++) {
            arr[i] = in.nextInt();


        }

        for (int i = 1; i< 10; i+=2) {
            sum += arr[i];
        }
        for (int i = 2; i<10; i+=3) {
            sum2 += arr[i];
            cnt++;
        }
        avg = sum2/cnt;

        System.out.printf("%s %.1f", sum, avg);
    }
}