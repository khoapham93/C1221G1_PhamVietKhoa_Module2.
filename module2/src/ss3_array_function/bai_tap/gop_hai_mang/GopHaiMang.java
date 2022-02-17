package ss3_array_function.bai_tap.gop_hai_mang;

import java.util.Scanner;

public class GopHaiMang {
    public static void main(String[] args) {
        int sizeArray1;
        int[] array1;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a size of array 1:");
        sizeArray1 = scanner.nextInt();
        array1 = new int[sizeArray1];
        int i = 0;
        while (i < array1.length) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array1[i] = scanner.nextInt();
            i++;
        }
        int sizeArray2;
        int[] array2;
        System.out.print("Enter a size of array 2:");
        sizeArray2 = scanner.nextInt();
        array2 = new int[sizeArray2];
        i = 0;
        while (i < array2.length) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array2[i] = scanner.nextInt();
            i++;
        }
        System.out.printf("%-20s%s", "Elements in array 1: ", "");
        for (int j = 0; j < array1.length; j++) {
            System.out.print(array1[j] + "\t");
        }
        System.out.println();
        System.out.printf("%-20s%s", "Elements in array 2: ", "");
        for (int j = 0; j < array2.length; j++) {
            System.out.print(array2[j] + "\t");
        }
        int [] array3 = new int[sizeArray1 + sizeArray2];

        for (int j = 0; j <array1.length ; j++) {
            array3[j] = array1[j];
        }
        for (int j = 0; j <array2.length ; j++) {
            array3[array1.length+j] = array2[j];
        }
        System.out.println();
        System.out.printf("%-20s%s", "Elements in array 3: ", "");
        for (int j = 0; j < array3.length; j++) {
            System.out.print(array3[j] + "\t");
        }
    }
}
