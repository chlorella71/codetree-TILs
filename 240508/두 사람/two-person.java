import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner in = new Scanner(System.in);
        
        // 한 줄에 입력을 받고 공백으로 분리하여 배열에 저장
        String[] input1 = in.nextLine().split(" ");
        String[] input2 = in.nextLine().split(" ");
        
        // 각각의 요소를 정수로 변환
        int aa = Integer.parseInt(input1[0]);
        String ag = input1[1];
        int ba = Integer.parseInt(input2[0]);
        String bg = input2[1];

        if (( aa >= 19 && ag.equals("M")) || ( ba >= 19 && bg.equals("M"))){
            System.out.print(1);
        } else {
            System.out.print(0);
        }
    }
}