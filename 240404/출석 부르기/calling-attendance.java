import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();

        if ( a == 1) {
            System.out.print("John");
        } else if ( a == 2) {
            System.out.print("Tom");
        } else if ( a == 3) { 
            System.out.print("Paul");
        } else {
            System.out.print("Vacancy");
        }
    }
}