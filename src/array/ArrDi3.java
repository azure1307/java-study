package array;

public class ArrDi3 {
    public static void main(String[] args) {
        //2차원 배열
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6}
        }; //배열 생성
        
        //내부 반복문의 조건이 arr[row].length라는 접근이 신기했음
        //나는 처음에 arr[0].length라고 썼는데
        //arr[0]과 arr[1]의 길이가 다를수도 있으니까..
        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[row].length; column++) {
                System.out.print(arr[row][column] + " "); //0열
            }
            System.out.println(); //한 행이 끝나면 줄바꿈
        }
    }
}
