import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int cnt =1;

        for (int i =1; i <=n; i++) {
            for (int j =1; j <=n; j++) {
                if (i % 2 !=0) {
                    System.out.print(cnt+ " ");
                    if (j == n) {
                        cnt +=2;
                    } else {
                        cnt++;
                    }
                } else {
                    System.out.print(cnt+ " ");
                    if (j < n) {
                        cnt+=2;
                    } else {
                        cnt++;
                    }
                }
            }
            System.out.println();
        }
    }
}