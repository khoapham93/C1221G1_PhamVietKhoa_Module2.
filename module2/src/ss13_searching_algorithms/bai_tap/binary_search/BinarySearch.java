package ss13_searching_algorithms.bai_tap.binary_search;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        int[] intArray;
        int findingValue;
        System.out.print("Enter a size: ");
        size = Integer.parseInt(scanner.nextLine());
        intArray = initArray(size);
        System.out.print("Input Array: ");
        System.out.println(Arrays.toString(intArray));
        Arrays.sort(intArray);

        System.out.print("Array sorted: ");
        System.out.println(Arrays.toString(intArray));
        System.out.print("finding value: ");
        findingValue = Integer.parseInt(scanner.nextLine());
        System.out.print("index of value in array: ");
        System.out.println(binarySearch(intArray, 0, size-1, findingValue));
    }

    public static int binarySearch(int[] array, int left, int right, int value) {
        while (left <= right) {
            int middle = (left + right) / 2;

            if (array[middle] == value) {
                return middle;
            }
            if (value > array[middle]) {
                left = middle + 1;
            }
            if (value < array[middle]) {
                right = middle - 1;
            }
            binarySearch(array, left, right, value);
        }
        return -1;
    }

    public static int[] initArray(int size) {
        int[] array = new int[size];
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        while (i < array.length) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
            i++;
        }
        return array;
    }
}
