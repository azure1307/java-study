package array.ex;

import java.util.Scanner;

public class ArrayEx4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] inputNums = new int[5];
        int sum = 0;
        System.out.println("5개의 정수를 입력하세요:");
        for (int i = 0; i < inputNums.length; i++) {
//            inputNums[i] = sc.nextInt();
//            sum += inputNums[i];
            sum += sc.nextInt();
            //값을 따로따로 꺼낼 필요 없으면 이렇게만 해도 될 듯?
            //근데 보통은 따로따로 꺼낼 필요가 잇지않나?
        }

        System.out.println("입력한 정수의 합계: " + sum);
        double average = (double) sum / inputNums.length;
        System.out.println("입력한 정수의 평균: " + average);
    }
}
