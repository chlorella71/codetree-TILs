import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner in = new Scanner(System.in);

        int a = in.nextInt(), b = in.nextInt();
        int sum = 0;
        double cnt = 0;

        for ( int i = a; i <= b; i++) {
            if (i % 5 == 0 || i % 7 == 0) {
                sum += i;
                cnt++;
            }
        }
        
        double v = sum/cnt;
        

        System.out.print(sum + " ");
        System.out.printf("%.1f", v);
    }
}