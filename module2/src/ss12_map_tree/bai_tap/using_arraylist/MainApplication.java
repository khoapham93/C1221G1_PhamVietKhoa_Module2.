package ss12_map_tree.bai_tap.using_arraylist;

import java.util.Scanner;

public class MainApplication {
    static ProductManager productManager = new ProductManager();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String productId;
        String productName;
        int choice = -1;
        while (choice != 0) {
            System.out.println("Main menu:\n" +
                    "1. Add new product\n" +
                    "2. Edit product information\n" +
                    "3. Delete product\n" +
                    "4. Display product list\n" +
                    "5. Searching product\n" +
                    "6. sort products by ascending price\n" +
                    "7. sort products by descending price\n" +
                    "8. Exit");
            System.out.print("Enter your choice: ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    productManager.add();
                    break;
                case 2:
                    System.out.print("Enter product id: ");
                    productId = scanner.nextLine();
                    productManager.edit(productId);
                    break;
                case 3:
                    System.out.print("Enter product id: ");
                    productId = scanner.nextLine();
                    productManager.delete(productId);
                    break;
                case 4:
                    System.out.println("Product's list: ");
                    productManager.display();
                    break;
                case 5:
                    System.out.print("Enter product name: ");
                    productName = scanner.nextLine();
                    boolean checkingProductvalid = productManager.getProductByName(productName);
                    if (!checkingProductvalid) {
                        System.out.println("product id does not exist");
                    }
                    break;
                case 6:
                    productManager.sortProductByPriceAscending();
                    productManager.display();
                    break;
                case 7:
                    productManager.sortProductByPriceDescending();
                    productManager.display();
                    break;
                case 8:
                    System.exit(0);
                    break;
                default:
                    System.out.println("No choice selected");
            }
        }
    }
}
