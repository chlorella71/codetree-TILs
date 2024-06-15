import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        for (int i = 1; i <= n; i++) {
            if ( i % 3 == 0) {
                System.out.print(0);
            } else if (i % 3 != 0 ) {
                if ( i < 10 ) {
                    String a = Integer.toString(i);
                    char b = a.charAt(0);
                    if (b == '3' || b == '6' || b =='9') {
                        System.out.print(0 + " ");
                    } else { 
                        System.out.print(i + " ");
                    }
                } else if ( i > 10) {
                    String a = Integer.toString(i);
                    char b = a.charAt(0);
                    char c = a.charAt(1);
                    if (b == '3' || b == '6' || b == '9') {
                        System.out.print(0 + " ");
                    } else if (c == '3' || c == '6' || c == '9') { 
                        System.out.print(0 + " ");
                    } else {
                        System.out.print(i + " ");
                    }

                }
            }
        }
    }
}