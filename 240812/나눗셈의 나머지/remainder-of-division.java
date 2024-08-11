import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner in = new Scanner(System.in);

        int[] arr = new int[10];

        int a = in.nextInt();

        int b = in.nextInt();

        int sum = 0;


        while(a>1) {
            int c = a%b;
            a = a/b;
            for (int i = 0; i< 10; i++) {
                if (c == i) {
                    arr[i]++;
                }
            }
        }

        for (int i = 0; i<10; i++) {
            arr[i] *= arr[i];
            sum += arr[i];
        }

        System.out.print(sum);

    }
}