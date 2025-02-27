package scanner;

import java.util.Scanner;

public class ScannerWhile3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //반복되는것과 상관없이, 반복문 바깥에 합을 담을 변수가 필요하다고 접근함
        int sum = 0;

        while (true) {
            System.out.print("정수를 입력하세요 (0을 입력하면 종료):");
            int num = sc.nextInt();
            sum += num;
            if (num == 0) {
                System.out.println("입력한 모든 정수의 합:" + sum);
                break;
            }
        }
        //합 출력을 반복문 끝나고 해도 괜찮을 듯
    }
}
