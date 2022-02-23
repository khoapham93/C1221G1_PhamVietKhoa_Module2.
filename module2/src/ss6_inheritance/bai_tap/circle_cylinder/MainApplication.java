package ss6_inheritance.bai_tap.circle_cylinder;

public class MainApplication {
    public static void main(String[] args) {
        Circle circle = new Circle(1, "Blue");
        System.out.println(circle);
        System.out.println("Area of circle " + circle.getArea());

        Cylinder cylinder = new Cylinder(3, 5, "Red");
        System.out.println(cylinder);
        System.out.println("Volume of cylinder " + cylinder.getVolume());
    }
}
