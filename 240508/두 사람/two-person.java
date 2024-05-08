import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner in = new Scanner(System.in);
        
        int aa = in.nextInt();
        String ag = in.nextLine();
        
        int ba = in.nextInt();
        String bg = in.nextLine();

        if (( aa >= 19 && ag.equals("M")) || ( ba >= 19 && bg.equals("M"))){
            System.out.print(1);
        } else {
            System.out.print(0);
        }
    }
}