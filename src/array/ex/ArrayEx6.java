package array.ex;

import java.util.Scanner;

public class ArrayEx6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("입력받을 숫자의 개수를 입력하세요:");
        int count = sc.nextInt();
        int[] nums = new int[count];

        System.out.println(count + "개의 정수를 입력하세요:");
        for (int i = 0; i < count; i++) {
            nums[i] = sc.nextInt();
        }

//        int min = 0, max = 0;
        //3개면 2번, 5개면 4번 비교
        //근데 같은 수를 입력받으면 안됨
        //뭔가 이상한데..

        //min, max에 첫번째 값을 넣어두고,
        //더 작거나 큰 값이 있을 때만 갱신
        int min, max;
        min = max = nums[0];
        for (int i = 1; i < count; i++) {
            if (nums[i] < min) {
                min = nums[i];
            }
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        System.out.println("가장 큰 정수:" + max);
        System.out.println("가장 작은 정수:" + min);

    }
}
