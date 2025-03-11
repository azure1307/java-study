package method.ex;

public class MethodEx2 {
    public static void main(String[] args) {
        String message = "Hello, world!";
        printMsg(3, message);
        printMsg(5, message);
        printMsg(7, message);
    }

    //변수명 그냥 int a로 받았는데, 몇 번 반복할지에 대한 변수니까 times라고 짓는게 좋겠다
    //메서드명도 printMsg라고 괜히 줄이지말고 printMessage로 쓰는게 나은가? 후자도 그렇게 길진않아서
    public static void printMsg(int times, String message) {
        for (int i = 0; i < times; i++) {
            System.out.println(message);
        }
    }
}
