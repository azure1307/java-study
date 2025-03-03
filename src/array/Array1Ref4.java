package array;

public class Array1Ref4 {
    public static void main(String[] args) {
        //배열 생성과 초기화
        int[] students = {90, 80, 70, 60, 50, 40, 30};

        //이렇게는 안됨
//        int[] students;
//        students = {90, 80, 70, 60, 50};
        

        //변수 값 사용
        //students.length 사용시 배열 길이가 바뀌어도 안바꿔도됨
        for (int i = 0; i < students.length; i++) {
            System.out.println("학생" + (i + 1) + " 점수: " + students[i]);
        }
    }
}
