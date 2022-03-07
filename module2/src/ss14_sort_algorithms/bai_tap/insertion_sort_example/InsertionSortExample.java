package ss14_sort_algorithms.bai_tap.insertion_sort_example;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSortExample {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter list size:");
        int size = Integer.parseInt(scanner.nextLine());
        int[] list = new int[size];
        for (int i = 0; i < list.length; i++) {
            System.out.print("Enter values " + (i+1) + " :");
            list[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.print("Your input list: "+ Arrays.toString(list));

        System.out.println("\nBegin sort processing...");
        System.out.println();
        insertionSortStepByStep(list);
    }

    public static void insertionSortStepByStep(int[] list) {
        int pos;
        int currentElement;
        for (int i = 1; i < list.length; i++) {
            currentElement = list[i];
            System.out.println("Take " + currentElement + " out of list.");
            pos = i;
            while (pos > 0 && currentElement < list[pos - 1]) {
                System.out.println("Move " + list[pos -1] + " to backward");
                list[pos] = list[pos - 1];
                pos--;
            }
            System.out.println("Replace " + currentElement + " to " + list[pos]);
            list[pos] = currentElement;

            System.out.println("List after the  " + i + "' sort: "+Arrays.toString(list));
        }
    }
}
