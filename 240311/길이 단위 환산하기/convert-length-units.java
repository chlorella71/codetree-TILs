import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner in = new Scanner(System.in);
        double ft = in.nextDouble()*30.48;
        System.out.printf("%.1f", ft);
    }
}