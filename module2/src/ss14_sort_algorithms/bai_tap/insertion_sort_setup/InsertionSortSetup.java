package ss14_sort_algorithms.bai_tap.insertion_sort_setup;

import java.util.Arrays;

public class InsertionSortSetup {
    static int[] list = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};

    public static void main(String[] args) {
        System.out.println("Array before sort: "+Arrays.toString(list));
        insertionSort(list);
        System.out.println("Array after sort: "+Arrays.toString(list));

    }

    public static void insertionSort(int[] list) {
        int pos;
        int currentElement;
        for (int i = 1; i < list.length ; i++) {
            currentElement = list[i];
            pos = i;
            while (pos > 0 && currentElement < list[pos -1]){
                list[pos] = list[pos -1];
                pos--;
            }
            list[pos] = currentElement;
        }
    }
}
