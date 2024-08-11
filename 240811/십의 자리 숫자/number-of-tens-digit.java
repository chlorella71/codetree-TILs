import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner in = new Scanner(System.in);

        int[] arr = new int[105];
        int cnt =0 ;

        for (int i = 0; i< 105; i++) {
            arr[i] = in.nextInt();
            // System.out.printf("arr1 : %s\n", arr[i]);
            cnt++;
            if (arr[i] == 0) {
                break;
            }
            arr[i] = arr[i] /10;
        }

        for (int i = 1; i <= 9; i++) {
            int cnt2 =0;
            for (int j = 0; j<cnt; j++) {
                if ( arr[j] == i) {
                    cnt2++;
                    // System.out.printf("arr : %s\n", arr[j]);
                }
            }
            System.out.println(i + " - "+ cnt2);
        }

    }
}