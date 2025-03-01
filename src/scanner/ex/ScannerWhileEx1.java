package scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 두번째 작동부터 이름, 나이 입력하라는 부분이 동시에 나오면서 InputMatchException 발생
        // 이름 입력하면 age에 넣으려고 하는것같은데..
        // 이거 nextLine() 쓴게 문제였음 
        // next()로 수정하니까 잘 돌아감
        // nextLine(): 공백 포함해서 읽음, next(): 공백 전까지만 저장
        while (true) {
            System.out.print("이름을 입력하세요 (종료를 입력하면 종료): ");
            String name = sc.next();

            if (name.equals("종료")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            System.out.print("나이를 입력하세요: ");
            int age = sc.nextInt();

            System.out.println("입력한 이름: " + name + ", 나이: " + age);
        }
    }
}
