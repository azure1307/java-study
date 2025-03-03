package array;

public class ArrDi4 {
    public static void main(String[] args) {
        //2차원 배열
        int[][] arr = new int[5][6]; //배열 생성

        int i = 1;
        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[row].length; column++) {
                arr[row][column] = i++;
            }
        }
        
        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[row].length; column++) {
                System.out.print(arr[row][column] + " "); //0열
            }
            System.out.println(); //한 행이 끝나면 줄바꿈
        }
    }
}
