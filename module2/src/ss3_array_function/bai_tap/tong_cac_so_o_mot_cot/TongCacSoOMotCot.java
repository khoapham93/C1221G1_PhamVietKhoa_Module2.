package ss3_array_function.bai_tap.tong_cac_so_o_mot_cot;

import java.util.Scanner;

public class TongCacSoOMotCot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Row of array: ");
        int row = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter Column of array: ");
        int col = Integer.parseInt(scanner.nextLine());

        double[][] arrays = new double[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("Enter element " + (i + 1) + "_" + (j + 1) + " ");
                arrays[i][j] = Double.parseDouble(scanner.nextLine());
            }
        }
        System.out.println("Array elements:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arrays[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.print("Enter the column want to calculate (start at 0): ");
        int colSum = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        if (colSum < 0 || colSum>arrays.length){
            System.out.println("Out of range!");
        }else {
            for (int i = 0; i < row; i++) {
                sum += arrays[i][colSum];
            }
            System.out.println("Sum of elements at column "+colSum+ " is "+sum);
        }
    }
}
