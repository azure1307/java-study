package method.ex;

public class MethodEx1 {
    public static void main(String[] args) {
        System.out.println("평균값: " + average(1, 2, 3));
        System.out.println("평균값: " + average(15, 25, 35));
    }

    //처음엔 메서드 안에 println까지 다 넣었는데
    //그럼 메인 메서드만 봤을 때 무슨 내용인지 짐작이 안감
    //기능만 따로 빼고 출력은 메인메서드에 두는게 나은 것 같다
    private static double average(int a, int b, int c) {
        int sum = a + b + c;
        return sum / 3.0;
    }
}
