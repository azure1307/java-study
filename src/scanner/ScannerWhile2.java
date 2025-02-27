package scanner;

import java.util.Scanner;

public class ScannerWhile2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //이 안내문구 까먹음
        System.out.println("첫 번째 숫자와 두 번째 숫자 모두 0을 입력하면 종료");
        
        //가독성 좋게 줄바꿈해주기
        while (true) {
            System.out.print("첫 번째 숫자:");
            int num1 = sc.nextInt();

            System.out.print("두 번째 숫자:");
            int num2 = sc.nextInt();

            if (num1 == 0 && num2 == 0) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
            
            System.out.println("두 수의 합:" + (num1 + num2));
        }
    }
}
