import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        for (int i = 1; i<= n; i++) {
            for (int j = 1; j<=n; j++) {
                if (j % 2 !=0) {
                    System.out.print(i);
                } else {
                    System.out.print(n -i +1);
                }
            }
            System.out.println();
        }
    }
}