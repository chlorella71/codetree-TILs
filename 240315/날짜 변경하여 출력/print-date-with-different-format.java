import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner in = new Scanner(System.in);
        in.useDelimiter(".");
        String yyyy = in.next(), mm = in.next(), dd = in.next();
        System.out.printf("%s-%s-%s",mm,dd,yyyy);
    }
}