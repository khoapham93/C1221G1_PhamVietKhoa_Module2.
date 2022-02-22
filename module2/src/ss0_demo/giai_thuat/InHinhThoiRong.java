package ss0_demo.giai_thuat;

public class InHinhThoiRong {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k <= 2 * i - 1; k++) {
                if ((k == 0) || (k == 2 * i - 1)) {
                    System.out.print(i);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        //nguoc
        for (int i = 4; i > 0; i--) {
            for (int j = 5; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k <= 2 * i - 1; k++) {
                if (k == 0 || k == 2 * i - 1) {
                    System.out.print(i);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
