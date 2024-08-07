import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner in = new Scanner(System.in);
        double[] arr = new double[8];
        double sum = 0;

        for (int i = 0; i<= 7; i++) {
            arr[i] = in.nextDouble();
            sum += arr[i];
        }
        System.out.printf("%.1f", sum/8);
    }
}