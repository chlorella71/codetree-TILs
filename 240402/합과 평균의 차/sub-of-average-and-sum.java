import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner in = new Scanner(System.in);
        int a = in.nextInt(), b = in.nextInt(), c = in.nextInt();
        int sum = a+b+c, average = (a+b+c)/3;
        System.out.printf("%s\n%s\n%s", sum, average, sum - average); 
    }
}