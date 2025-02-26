package loop.ex;

public class ForEx1 {
    public static void main(String[] args) {
        int count = 1;
        // 카운터변수를 count로 주는것도 가능
        for (int i = 0; i < 10; i++) {
            System.out.println(count);
            count++;
        }
    }
}
