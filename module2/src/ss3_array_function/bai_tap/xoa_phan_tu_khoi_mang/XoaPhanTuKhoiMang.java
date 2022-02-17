package ss3_array_function.bai_tap.xoa_phan_tu_khoi_mang;

import java.util.Scanner;

public class XoaPhanTuKhoiMang {
    public static void main(String[] args) {
        int[] numbers = {2,4,5,7,8,10,9,11,20};
        int indexRemove = -1;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Property list: ");
        for (int j = 0; j < numbers.length; j++) {
            System.out.print(numbers[j] + "\t");
        }
        System.out.println();
        System.out.print("Enter the number want to remove: ");
        int numberRemove = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i <numbers.length ; i++) {
            if (numbers[i] == numberRemove){
                indexRemove = i;
                break;
            }
        }

        if (indexRemove != -1){
            for (int i = indexRemove; i < numbers.length -1; i++) {
                numbers[i] = numbers[i+1];
            }
            numbers[numbers.length -1] = 0;
            System.out.print("Array After Remove: ");
            for (int j = 0; j < numbers.length; j++) {
                System.out.print(numbers[j] + "\t");
            }
            System.out.println();
        }else {
            System.out.println("The Number does not exit in array!");
        }
    }
}
