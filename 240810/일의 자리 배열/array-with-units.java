import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner in = new Scanner(System.in);

        int[] arr = new int[10];

        arr[0]= in.nextInt(); arr[1]= in.nextInt();

        for (int i = 2; i< 10; i++) {
            arr[i] = arr[i-1] + arr[i-2];
            if (arr[i]> 9) {
                arr[i] = arr[i] - 10;
            }
        }

        for (int i = 0; i<10; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}