package ss4_class_object.bai_tap.lop_quat;

public class Main {
    public static void main(String[] args) {
        Fan fan1 = new Fan();
        fan1.setSpeed(fan1.getFAST());
        fan1.setRadius(10.0);
        fan1.setColor("Yellow");
        fan1.setOn(true);
        System.out.println("Information of fan 1: " + fan1.toString());

        Fan fan2 = new Fan();
        fan2.setSpeed(fan1.getMEDIUM());
        fan2.setRadius(5.0);
        fan2.setColor("blue");
        fan2.setOn(false);
        System.out.println("Information of fan 2: " + fan2.toString());

    }
}
