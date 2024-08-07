import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner in = new Scanner(System.in);

        int[] arr = new int[10];
        int sum = 0;
        double cnt = 0;
        boolean max = false;

        double avr;

        for (int i = 0; i<= 9; i++) {
            arr[i]= in.nextInt();
            if ( arr[i] >= 250) {
                max = true;
            }
            if ( max == false) {
                cnt++;
            }
        }
 
        for (int i = 0; i<=cnt-1; i++) {
            sum += arr[i];
        }
        avr = sum/cnt;
    
        System.out.printf("%s %.1f", sum, avr);
    }
}