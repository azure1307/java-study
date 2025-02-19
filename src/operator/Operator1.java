package operator;

public class Operator1 {
    public static void main(String[] args) {
        //변수 초기화
        int a = 5;
        int b = 2;

        //덧셈
        int sum = a + b;
        System.out.println("a + b = " + sum); //출력

        //뺄셈
        int diff = a - b;
        System.out.println("a - b = " + diff);

        //곱셈
        int multi = a * b;
        System.out.println("a * b = " + multi);

        //나눗셈
        int div = a / b; //2.5가 아니라 2
        System.out.println("a / b = " + div);

        //나머지
        int mod = a % b; //1
        System.out.println("a % b = " + mod);

        //0으로 나눌 수 없음
        //int z = 10 / 0; //ArithmeticException
    }
}
