import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner in = new Scanner(System.in);

        int a = in.nextInt(), b = in.nextInt();

        for (int i = 1; i <= 9; i++) {
            for (int j = b; j >= a; j-=2) {
                System.out.print(j+" * "+i+" = "+(i*j));
                if (j >a) {
                    System.out.print(" / ");
                }
            }
            System.out.println();
        }
    }
}