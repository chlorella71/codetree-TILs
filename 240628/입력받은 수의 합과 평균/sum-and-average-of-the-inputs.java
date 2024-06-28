import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int sum =0;
        double avr;

        for (int i = 1; i <=n; i++) {
            int a = in.nextInt();
            sum += a;
        }

        avr = (double)sum/n;

        System.out.print(sum+ " ");
        System.out.printf("%.1f", avr);
    }   
}