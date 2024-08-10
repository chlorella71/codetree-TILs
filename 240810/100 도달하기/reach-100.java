import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int[] arr = new int[1005];

        arr[0] = 1;
        arr[1] = n;
        System.out.print(arr[0]+" "+ arr[1]+" ");
        for (int i=2; i< 1005; i++) {
            arr[i] = arr[i-1]+ arr[i-2];
            System.out.print(arr[i]+ " ");
            if ( arr[i]>= 100) {
                break;
            }
        }
    }
}