package loop.ex;

public class NestedEx2 {
    public static void main(String[] args) {
        int rows = 5;

        //별찍기 문제다
        //시작하기전에 아래처럼 출력 예시를 반복문없이 찍어보셨는데, 이 접근이 신기했음

//        System.out.print("*");
//        System.out.println();
//
//        System.out.print("*");
//        System.out.print("*");
//        System.out.println();
//
//        System.out.print("*");
//        System.out.print("*");
//        System.out.print("*");
//        System.out.println();

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
