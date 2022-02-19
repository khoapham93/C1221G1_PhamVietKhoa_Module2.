package ss4_class_object.bai_tap.lop_phuong_trinh_bac_hai;

public class QuadraticEquation {
    private double a, b, c;

    public QuadraticEquation() {
    }

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return this.a;
    }

    public double getB() {
        return this.b;
    }

    public double getC() {
        return this.c;
    }

    public double getDiscriminant() {
        return (Math.pow(this.b, 2) - 4 * this.a * this.c);
    }

    public double getRoot1() {
        double numerator = -this.b + Math.sqrt(this.getDiscriminant());
        return numerator / (2 * this.a);
    }

    public double getRoot2() {
        double numerator = -this.b - Math.sqrt(this.getDiscriminant());
        return numerator / (2 * this.a);
    }

    public String display() {
        return "Your quadraticEquation is " + this.a + "*x^2 + (" + this.b + ")*x + (" + this.c + ") = 0";
    }

    public String answer() {
        double discriminant = this.getDiscriminant();
        if (discriminant > 0) {
            return "The equation has two roots " + this.getRoot1() + " and " + this.getRoot2();
        } else if (discriminant == 0) {
            return "The equation has one roots " + this.getRoot1();
        } else {
            return "The equation has no roots";
        }
    }
}
