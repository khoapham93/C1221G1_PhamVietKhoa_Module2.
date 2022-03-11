package ss17_io_binary_file_serialization.bai_tap.product_manager_by_binary_file.view;

import ss17_io_binary_file_serialization.bai_tap.product_manager_by_binary_file.controller.ProductController;

import java.util.Scanner;

public class View {
    public static void main(String[] args) {
        ProductController productController = new ProductController();
        Scanner scanner = new Scanner(System.in);
        String productName;
        int choice = -1;
        while (choice != 0) {
            System.out.println("-----------------------------------------\n" +
                    "Main menu:\n" +
                    "1. Add new product\n" +
                    "2. Edit product\n" +
                    "3. Delete product\n" +
                    "4. Display product list\n" +
                    "5. Searching product\n" +
                    "6. Save to file\n"+
                    "7. Exit");
            System.out.print("Enter your choice: ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    productController.addNewProduct();
                    break;
                case 2:
                    System.out.print("Comming soon: ");
                    break;
                case 3:
                    System.out.print("Comming soon: ");
                    break;
                case 4:
                    productController.displayProductList();
                    break;
                case 5:
                    System.out.print("Enter product name: ");
                    productName = scanner.nextLine();
                    productController.searchProduct(productName);
                    break;
                case 6:
                    productController.saveToBianryFile();
                    break;
                    case 7:
                    System.exit(0);
                    break;
                default:
                    System.out.println("No choice selected");
            }
        }
    }
}
