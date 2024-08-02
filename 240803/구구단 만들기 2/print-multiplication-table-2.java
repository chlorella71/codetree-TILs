import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner in = new Scanner(System.in);

        int a = in.nextInt(), b= in.nextInt();

        for (int i = 2; i<= 8; i+=2) {
            for (int j = b; j>=a; j--) {
                System.out.print(j+" * "+i+" = "+(i*j));
                if (j > a) {
                    System.out.print(" / ");
                }
            }
            System.out.println();
        }
    }
}