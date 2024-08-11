import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner in = new Scanner(System.in);

        int[] arr2 = new int[3];
        char[] arr = new char[3];
        int[] arr3 = new int[4];

        for (int i = 0; i< 3; i++) {
            arr[i] = in.next().charAt(0);
            arr2[i] = in.nextInt();
        }

        for (int i = 0; i<3; i++) {
            if (arr[i] == 'Y' && arr2[i] >=37) {
                arr3[0]++;
            } else if (arr[i] == 'N' && arr2[i] >= 37) {
                arr3[1]++;
            } else if (arr[i] == 'Y' && arr2[i] < 37) {
                arr3[2]++;
            } else if (arr[i] == 'N' && arr2[i] <37) {
                arr3[3]++;
            }
        }

        for (int i = 0; i<4; i++) {
            System.out.print(arr3[i] + " ");
        }
        if (arr3[0] >=2) {
            System.out.print('E');
        }
    }
}