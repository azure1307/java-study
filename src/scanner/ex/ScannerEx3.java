package scanner.ex;

import java.util.Scanner;

public class ScannerEx3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("음식 이름을 입력해주세요: ");
        String foodName = sc.nextLine();

        System.out.print("음식의 가격을 입력해주세요: ");
        int foodPrice = sc.nextInt();

        System.out.print("음식의 수량을 입력해주세요: ");
        int foodQuantity = sc.nextInt();

        System.out.print(foodName + " " + foodQuantity +"개를 주문하셨습니다.");
        System.out.print(" 총 가격은 " + (foodPrice * foodQuantity) + "원입니다.");
    }
}
