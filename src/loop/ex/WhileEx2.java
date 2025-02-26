package loop.ex;

public class WhileEx2 {
    public static void main(String[] args) {
        int num = 2;
        //count 1로 선언 후 조건문을 count <= 10으로 줘도 됨
        while (num <= 21) {
            System.out.println(num);
            num += 2;
        }
    }
}
