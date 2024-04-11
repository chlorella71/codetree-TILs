import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner in = new Scanner(System.in);

        int a = in.nextInt(), b = in.nextInt(), c = in.nextInt();
        
        System.out.print(a <= b && a <= c ? 1 : 0);
        System.out.print(" ");
        System.out.print(a == b && a ==c ? 1 : 0);
    }
}