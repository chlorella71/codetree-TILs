import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner in = new Scanner(System.in);
        int[] arr = new int[10];

        for (int i = 0; i<= 9; i++) {
            arr[i] = in.nextInt();
            if (arr[i] == 0) {
                for (int j = i-1; j>=0; j--) {
                    System.out.print(arr[j]+" ");
                }
                break;
            } else if (i == 9) {
                for (int j = i; j>=0; j--) {
                    System.out.print(arr[j]+ " ");
                }
            }
        }
        
    }
}