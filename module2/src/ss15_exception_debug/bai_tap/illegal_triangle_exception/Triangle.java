package ss15_exception_debug.bai_tap.illegal_triangle_exception;

public class Triangle {
    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(double sideA, double sideB, double sideC) throws IllegalTriangleException {
        boolean isSidesOfTriangle = sideA + sideB > sideC && sideC + sideB > sideA && sideA + sideC > sideB;
        boolean isNegativeNumber = sideA <= 0 || sideB <= 0 || sideC <= 0;
        if (isNegativeNumber) {
            throw new IllegalTriangleException("Triangle sides must be positive.");
        }else if (!isSidesOfTriangle) {
            throw new IllegalTriangleException("Sum of two sides must be greater than other one.");
        } else {
            this.sideA = sideA;
            this.sideB = sideB;
            this.sideC = sideC;
        }
    }
    public Triangle(){

    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public double getSideC() {
        return sideC;
    }

    public void setSideC(double sideC) {
        this.sideC = sideC;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "sideA=" + sideA +
                ", sideB=" + sideB +
                ", sideC=" + sideC +
                '}';
    }
}
