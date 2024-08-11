import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner in = new Scanner(System.in);

        int[] arr = new int[105];
        int[] arr2 = new int[]{10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

        int cnt = 0;
        for (int i = 0; i< 105; i++) {
            arr[i] = in.nextInt();
            cnt++;
            if ( arr[i] ==0) {
                break;
            }
        }

        for (int i = 0; i < 10; i++) {
            int cnt2 = 0;
            for (int j = 0; j < cnt; j++) {
                if ( arr[j] / 10 == arr2[i]) {
                    cnt2++;
                }
            }
            System.out.println(arr2[i]+"0 - "+cnt2);
        }

    }
}