package array.ex;

import java.util.Scanner;

public class ArrayEx8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("학생수를 입력하세요:");
        int student = sc.nextInt();

        int[][] score = new int[student][3];
        int[] sums = new int[student];
        double[] averages = new double[student];
        String[] subjects = {"국어", "영어", "수학"};

        for (int i = 0; i < student; i++) {
            System.out.println((i + 1) + "번 학생의 성적을 입력하세요:");
            for (int j = 0; j < 3; j++) {
                System.out.print(subjects[j] + " 점수:");
                score[i][j] = sc.nextInt();
                sums[i] += score[i][j];
            }
            averages[i] = (double) sums[i] / 3;
        }

        for (int i = 0; i < student; i++) {
            System.out.print((i + 1) + "번 학생의 총점: " + sums[i] + ", ");
            System.out.println("평균: " + averages[i]);
        }
    }
}
