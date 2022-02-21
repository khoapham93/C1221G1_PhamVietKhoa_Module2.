package ss5_accessmodifier_static.bai_tap.access_modifier;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle(10);
        System.out.println("The radius of circle is " + circle.getRadius());
        System.out.println("The area of circle is " + circle.getArea());
    }
}
