package ss4_class_object.bai_tap.lop_quat;

public class Fan {
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;
    private int speed = this.SLOW;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";

    public Fan() {
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if (speed <= 0 || speed > 3) {
            System.out.println("The speed is invalid, the slow was assigned");
            this.speed = this.SLOW;
        } else {
            this.speed = speed;
        }
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        if (this.on) {
            return "speed " + this.getSpeed() + " color " + this.getColor() + " radius " + this.getRadius() + " fan is on ";
        } else {
            return "color " + this.getColor() + " radius " + this.getRadius() + " fan is off ";
        }
    }

}
