package ss3_array_function.bai_tap.them_phan_tu_vao_mang;

import java.util.Scanner;

public class ThemPhanTuVaoMang {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 4, 5, 6, 8, 0};
        System.out.print("Property list: ");
        for (int j = 0; j < numbers.length; j++) {
            System.out.print(numbers[j] + "\t");
        }
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the index want to insert: ");
        int indexInsert = Integer.parseInt(scanner.nextLine());

        if (indexInsert <0 || indexInsert >=numbers.length-1){
            System.out.println("Can't Insert into array");
        }else {
            System.out.print("Enter the number want to insert: ");
            int insertNumber = Integer.parseInt(scanner.nextLine());
            int temp = 0;
            for (int i = indexInsert; i <= numbers.length -1; i++) {
                temp = numbers[i];
                numbers[i] = insertNumber;
                insertNumber = temp;
            }
            System.out.print("Property list: ");
            for (int j = 0; j < numbers.length; j++) {
                System.out.print(numbers[j] + "\t");
            }
        }
    }
}
