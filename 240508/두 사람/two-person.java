import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner in = new Scanner(System.in);
        
        int aa = in.nextInt();
        char ag = in.next().charAt(0);
        int ba = in.nextInt();
        char bg = in.next().charAt(0);

        if (( aa >= 19 && ag == 'M') || ( ba >= 19 && bg == 'M')){
            System.out.print(1);
        } else {
            System.out.print(0);
        }
    }
}