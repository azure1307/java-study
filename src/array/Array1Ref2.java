package array;

public class Array1Ref2 {
    public static void main(String[] args) {
        int[] students; //배열 변수 선언
        students = new int[5];
//        System.out.println(students);

        //변수 값 대입
        students[0] = 90;
        students[1] = 80;
        students[2] = 70;
        students[3] = 60;
        students[4] = 50;
//        students[5] = 40; //ArrayIndexOutOfBoundsException

        //변수 값 사용
        //i의 조건식에 students.length 사용시 배열의 개수가 바뀌어도 안바꿔도됨
        for (int i = 0; i < students.length; i++) {
            System.out.println("학생" + (i + 1) + " 점수: " + students[i]);
        }
    }
}
