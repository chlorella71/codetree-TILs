import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner in = new Scanner(System.in);
        int am = in.nextInt(), ae = in.nextInt();
        int bm = in.nextInt(), be = in.nextInt();
        
        if ( am > bm ) {
            System.out.print("A");
        } else if ( am < bm) {
            System.out.print("B");
        } else if ( am == bm) {
            if ( ae > be) {
                System.out.print("A");
                } else if ( ae < be ) {
                    System.out.print("B");
                }
            }
        }

    }