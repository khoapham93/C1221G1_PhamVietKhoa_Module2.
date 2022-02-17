package ss2_loop.bai_tap.in_ra_cac_loai_hinh;

import java.util.Scanner;

public class InRaCacLoaiHinh {
    public static void main(String[] args) {
        int choice = -1;
        Scanner input = new Scanner(System.in);
        while (choice != 0) {
            System.out.println("Menu\n" +
                    "1. Print the rectangle\n" +
                    "2. Print the square triangle\n" +
                    "3. Print isosceles triangle\n" +
                    "4. Exit");
            System.out.println("Enter your choice: ");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter Row");
                    int row = input.nextInt();
                    System.out.println("Enter column");
                    int col = input.nextInt();
                    for (int i = 0; i <row ; i++) {
                        for (int j = 0; j <col ; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    System.out.println("Enter height");
                    int height = input.nextInt();
                    //bottom left
                    System.out.println("bottom left");
                    for (int i = 1; i <= height; i++) {
                        for (int j = 1; j <=i ; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    System.out.println();
                    //top left
                    System.out.println("top left");
                    for (int i = height; i >= 1; i--) {
                        for (int j = 1; j <=i ; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    System.out.println();
                    //top Right
                    System.out.println("top Right");
                    for (int i = height; i >= 1; i--) {
                        for (int j = height; j >=1 ; j--) {
                            if (j<=i){
                                System.out.print("* ");
                            }else {
                                System.out.print("  ");
                            }
                        }
                        System.out.println();
                    }
                    System.out.println();
                    //bottom Right
                    System.out.println("bottom Right");
                    for (int i = height; i >= 1; i--) {
                        for (int j = 1; j <= height ; j++) {
                            if (j>=i){
                                System.out.print("* ");
                            }else {
                                System.out.print("  ");
                            }
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    System.out.println("Enter height");
                    int heightIsoscelesTri = input.nextInt();
                    for (int i = 1; i <= heightIsoscelesTri; i++) {
                        for (int j = heightIsoscelesTri; j >i; j--) {
                            System.out.print("  ");
                        }
                        for (int k = 1; k <=2*i-1 ; k++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("No choice");
            }
        }
    }
}
