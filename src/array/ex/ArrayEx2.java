package array.ex;

import java.util.Scanner;

public class ArrayEx2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] inputNums = new int[5];
        System.out.println("5개의 정수를 입력하세요:");
        for (int i = 0; i < inputNums.length; i++) {
            inputNums[i] = sc.nextInt();
        }

        System.out.println("출력");
        for (int i = 0; i < inputNums.length; i++) {
            if (i != inputNums.length-1) {
                System.out.print(inputNums[i]+", ");
            } else {
                System.out.print(inputNums[i]);
            }
        }
    }
}
