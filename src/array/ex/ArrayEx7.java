package array.ex;

import java.util.Scanner;

public class ArrayEx7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] score = new int[4][3];
        int[] sums = new int[4];
        double[] averages = new double[4];
        //과목명을 배열로 담아두고 출력한다는 접근을 못했다.. 신기
        String[] subjects = {"국어", "영어", "수학"};

        for (int i = 0; i < 4; i++) {
            System.out.println((i + 1) + "번 학생의 성적을 입력하세요:");
            for (int j = 0; j < 3; j++) {
                System.out.print(subjects[j] + " 점수:");
                score[i][j] = sc.nextInt();
                sums[i] += score[i][j];
            }
            averages[i] = (double) sums[i] / 3;
        }

        for (int i = 0; i < 4; i++) {
            System.out.print((i + 1) + "번 학생의 총점: " + sums[i] + ", ");
            System.out.println("평균: " + averages[i]);
        }
    }
}
