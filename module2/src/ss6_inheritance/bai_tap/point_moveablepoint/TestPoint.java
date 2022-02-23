package ss6_inheritance.bai_tap.point_moveablepoint;

import java.util.Arrays;

public class TestPoint {
    public static void main(String[] args) {
        Point point = new Point(2, 3);
        System.out.println(point);

        MoveablePoint moveablePoint = new MoveablePoint(2, 2, 2, 3);
        System.out.println(moveablePoint);
        System.out.println("First position of point " + Arrays.toString(moveablePoint.getXY()));
        moveablePoint.move();
        System.out.println("Information of point after one move " + moveablePoint);

    }
}
