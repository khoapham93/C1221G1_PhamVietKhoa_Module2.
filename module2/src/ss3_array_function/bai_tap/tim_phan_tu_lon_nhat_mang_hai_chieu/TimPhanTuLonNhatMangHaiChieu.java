package ss3_array_function.bai_tap.tim_phan_tu_lon_nhat_mang_hai_chieu;

import java.util.Scanner;

public class TimPhanTuLonNhatMangHaiChieu {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Row of array: ");
        int row = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter Column of array: ");
        int col = Integer.parseInt(scanner.nextLine());

        double[][] arrays = new double[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("Enter element "+(i+1)+"_"+(j+1)+" ");
                arrays[i][j] = Double.parseDouble(scanner.nextLine());
            }
        }
        System.out.println("Array elements:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++){
                System.out.print(arrays[i][j] + "\t");
            }
            System.out.println();
        }

        double max = 0;
        int indexRow = 0;
        int indexCol = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++){
                if (max < arrays[i][j]){
                    max = arrays[i][j];
                    indexRow = i +1;
                    indexCol = j+1;
                }
            }
        }
        System.out.println("Max value in Array is "+max+" at row "+ indexRow+ " colunm "+indexCol);

    }
}
