package ss7_abstract_class_interface.bai_tap.colorable_shape;

public class TestColorable {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(4);
        shapes[1] = new Square(6);
        shapes[2] = new Rectangle(2, 6);
        System.out.println("Area of shapes: ");
        for (Shape shape : shapes) {
            System.out.println(shape.getArea());

            if (shape instanceof Square) {
                System.out.println("shape square has a Colorable");
                ((Square) shape).howToColor();
            }
        }
    }

}
