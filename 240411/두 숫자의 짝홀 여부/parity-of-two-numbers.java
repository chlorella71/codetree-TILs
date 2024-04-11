import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner in = new Scanner(System.in);

        int a = in.nextInt(), b = in.nextInt();

        if ( a%2==0) {
            System.out.print("even");
        } else if (a%2!=0) {
            System.out.print("odd");
        }
        
        System.out.println("");
        if (b%2 == 0) {
            System.out.print("even");
        } else if ( b%2 !=0) {
            System.out.print("odd");
        }
    }
}