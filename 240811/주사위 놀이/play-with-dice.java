import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner in = new Scanner(System.in);

        int[] arr = new int[10];

        int cnt = 0;

        for (int i =0; i<10; i++) {
            arr[i] = in.nextInt();
        }

        for (int i = 1; i<=6; i++) {
            cnt = 0;
            for(int j = 0; j<10; j++) {
                if (arr[j] == i) {
                    cnt++;
                }
            }
            System.out.println(i+" - " + cnt);
        }
    }
}