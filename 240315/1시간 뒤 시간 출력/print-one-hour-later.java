import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner in = new Scanner(System.in);
        in.useDelimiter(":");
        int h = in.nextInt(), m = in.nextInt();
        System.out.print(h+ 1 + ":" + m);
    }
}