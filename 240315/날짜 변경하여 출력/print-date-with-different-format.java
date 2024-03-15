import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner in = new Scanner(System.in);
        in.useDelimiter("\\.");
        int yyyy = in.nextInt(), mm = in.nextInt(), dd = in.nextInt();
        System.out.printf("%s-%s-%s",mm,dd,yyyy);
    }
}