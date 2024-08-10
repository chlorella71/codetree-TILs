import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner in = new Scanner(System.in);

        int[] arr = new int[10];

        arr[0]= in.nextInt();
        arr[1] = in.nextInt();
        System.out.print(arr[0]+ " "+ arr[1]+ " ");

        for (int i=2; i< 10; i++) {
            arr[i] = arr[i-1]+ 2*arr[i-2];
            System.out.print(arr[i]+" ");
        }
    }
}