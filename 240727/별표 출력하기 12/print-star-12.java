import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        for (int i= 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (i ==1 || (j % 2 != 0 && j>= i)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
                 
            System.out.println();
        }
    }
}