package cond.ex;

public class DistanceEx {
    public static void main(String[] args) {
        int distance = 150;
        String vehicle = "";
        //따로 변수에 담지 않고 바로 출력할 수도 있음

        if (distance <= 1) {
            vehicle = "도보";
        } else if (distance <= 10) {
            vehicle = "자전거";
        } else if (distance <= 100) {
            vehicle = "자동차";
        } else {
            vehicle = "비행기";
        }

        System.out.println("distance: " + distance);
        System.out.println(vehicle + "를 이용하세요.");
    }
}
