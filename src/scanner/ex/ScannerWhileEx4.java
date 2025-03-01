package scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;

        while (true) {
            System.out.println("1: 상품 입력, 2: 결제, 3: 프로그램 종료");
            int option = sc.nextInt();

            if (option == 3) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            if (option == 1) {
                System.out.print("상품명을 입력하세요: ");
                String name = sc.next();
                System.out.print("상품의 가격을 입력하세요: ");
                int price = sc.nextInt();
                System.out.print("구매 수량을 입력하세요: ");
                int quantity = sc.nextInt();

                sum += (price * quantity);
                System.out.println("상품명:" + name +" 가격:" + price + " 수량:" + quantity + " 합계:" + sum);
            }

            if (option == 2) {
                System.out.println("총 비용: " + sum);
                //총 비용 초기화는 여기서 해줘야함
                sum = 0;
            }

//            switch (option) {
//                case 1:
//                    System.out.print("상품명을 입력하세요: ");
//                    String name = sc.next();
//                    System.out.print("상품의 가격을 입력하세요: ");
//                    int price = sc.nextInt();
//                    System.out.print("구매 수량을 입력하세요: ");
//                    int quantity = sc.nextInt();
//                    sum += (price * quantity);
//                    System.out.println("상품명:" + name +" 가격:" + price + " 수량:" + quantity + "합계:" + sum);
//                    break;
//                case 2:
//                    System.out.println("총 비용: " + sum);
//                    break;
//                case 3:
//                    System.out.println("프로그램을 종료합니다.");
//                    break;
//            }
        }
    }
}
