package method.ex;

import java.util.Scanner;

public class MethodEx4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int balance = 0;

        while (true) {
            System.out.println("---------------------------------------");
            System.out.println("1. 입금 | 2. 출금 | 3. 잔액 확인 | 4. 종료");
            System.out.println("---------------------------------------");

            System.out.print("선택: ");
            int menu = sc.nextInt();

            if (menu == 1) {
                System.out.print("입금액을 입력하세요: ");
                int depositMount = sc.nextInt();
                balance = deposit(balance, depositMount);
            } else if (menu == 2) {
                System.out.print("출금액을 입력하세요: ");
                int withdrawMount = sc.nextInt();
                balance = withdraw(balance, withdrawMount);
            } else if (menu == 3) {
                System.out.println("현재 잔액: " + balance + "원");
            } else if (menu == 4) {
                System.out.println("시스템을 종료합니다.");
                break;
            } else {
                System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
            }
        }

    }

    private static int deposit(int balance, int mount) {
        balance += mount;
        System.out.println(mount + "원을 입금하였습니다. 현재 잔액: " + balance + "원");
        return balance;
    }

    private static int withdraw(int balance, int mount) {
        if (balance >= mount) {
            balance -= mount;
            System.out.println(mount + "원을 출금하였습니다. 현재 잔액: " + balance + "원");
        } else {
            System.out.println(mount + "원을 출금하려 했으나 잔액이 부족합니다.");
        }
        return balance;
    }
}
