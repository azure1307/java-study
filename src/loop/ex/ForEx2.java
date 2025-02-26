package loop.ex;

public class ForEx2 {
    public static void main(String[] args) {
        //초기식, 조건식, 증감식 부분에 여러개 선언하는것도 가능
//        for (int num = 2, count = 1; count <= 10; num += 2, count++) {
//            System.out.println(num);
//        }
//        System.out.println();

        //count는 오직 for문에서만 사용되는 변수.
        //이렇게 쓰는게 더 의미가 확실한것같다
        int num = 2;
        for (int count = 1; count <= 10; count++) {
            System.out.println(num);
            num += 2;
        }

//        for (int i = 2; i < 21; i += 2) {
//            System.out.println(i);
//        }
    }
}
