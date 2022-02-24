package ss7_abstract_class_interface.bai_tap.resizeable_shape;

public class TestResizeable {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(5);
        shapes[1] = new Rectangle(2, 3);
        shapes[2] = new Square(5);
        System.out.println("Area of shapes before increase:");
        for (Shape shape : shapes) {
            System.out.println(shape.getArea());
        }
        double increase = Math.floor(Math.random() * 100) + 1;
        System.out.println("Increase shape to:" + increase + " percent.");
        System.out.println("Area of shapes after increase:");
        for (Shape shape : shapes) {
            shape.resize(increase);
            System.out.println(shape.getArea());
        }
    }

}
