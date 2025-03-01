package scanner.ex;

public class ChangeVarEx {
    public static void main(String[] args) {
        int a = 20;
        int b = 10;
        int temp; //a의 값 보관

        temp = a; //10
        a = b;
        b = temp;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
