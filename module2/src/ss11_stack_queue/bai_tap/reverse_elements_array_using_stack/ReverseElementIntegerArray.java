package ss11_stack_queue.bai_tap.reverse_elements_array_using_stack;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class ReverseElementIntegerArray {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int size;
        int[] intArray;
        Stack<Integer> intStack = new Stack<>();

        System.out.print("Enter a size:");
        size = scanner.nextInt();
        intArray = initArray(size);

        System.out.println("Array before reverse:");
        System.out.println(Arrays.toString(intArray));
        for (int element : intArray) {
            intStack.push(element);
        }
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = intStack.pop();
        }
        System.out.println("Array after reverse:");
        System.out.println(Arrays.toString(intArray));
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
