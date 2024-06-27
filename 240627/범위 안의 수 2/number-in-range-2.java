import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner in = new Scanner(System.in);

        int sum = 0, cnt = 0;
        

        for (int i =1; i<=10; i++) {
            int n = in.nextInt();
            if (n >= 0 && n <= 200) {
                sum += n;
                cnt++;
            }
        }

        double avr = (double)sum/cnt;

        System.out.print(sum + " ");
        System.out.printf("%.1f", avr);
    }
}