import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner in = new Scanner(System.in);

        int[] arr1 = new int[105];
        int[] arr2 = new int[105];

        String ans = "No";
        int cnt =0;

        int n1 = in.nextInt(), n2 = in.nextInt();

        for (int i = 0; i< n1; i++) {
            arr1[i] =in.nextInt();
        }

        for (int i = 0; i<n2; i++) {
            arr2[i] =in.nextInt();
        }

        for (int i = 0; i<n1; i++) {
            if (arr1[i] == arr2[0]) {
                for (int j=1; j<n2; j++) {
                    if (arr1[i+cnt] == arr2[j]) {
                        cnt++;
                        if (j == n2 -1) {
                            ans = "Yes";
                        }
                    }
                }

            }
        }
        System.out.print(ans);
    }
}