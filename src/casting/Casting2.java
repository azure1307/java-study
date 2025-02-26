package casting;

public class Casting2 {
    public static void main(String[] args) {
        double doubleValue = 1.5;
        int intValue = 0;
        
//        intValue = doubleValue; //컴파일 오류 발생
        intValue = (int) doubleValue; //명시적 형변환
        System.out.println("intValue = " + intValue); //1.5가 1이 됨
        System.out.println("doubleValue = " + doubleValue);
        System.out.println();

        int z = (int) 10.5;
        System.out.println(z); //10
    }
}
