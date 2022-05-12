package task;

public class Cylinder {
    Circle bottom;
    double height; // 필드로 선언

    double getVolume() { //가상의 원통의 높이를 구하는 메서드. 원통의 넓이 = 밑면 * 높이
        double volume = bottom.getArea() * height;
        return volume;
    }

    Cylinder(Circle bottom, double height) {
        this.bottom = bottom;
        this.height = height;
    }

    public static void main(String[] args) {
        Cylinder cd = new Cylinder(new Circle(2.8), 5.6);
        //cd는 bottom과 height를 가지는 실린더 객체
        System.out.print(cd.getVolume());
    }
}
