package ss17_io_binary_file_serialization.bai_tap.product_manager_by_binary_file.controller;

import ss17_io_binary_file_serialization.bai_tap.product_manager_by_binary_file.model.Product;
import ss17_io_binary_file_serialization.bai_tap.product_manager_by_binary_file.service.IService;
import ss17_io_binary_file_serialization.bai_tap.product_manager_by_binary_file.service.ProductServiceImpl;
import ss17_io_binary_file_serialization.bai_tap.product_manager_by_binary_file.util.ReadAndWriteToBinaryFile;

import java.util.List;
import java.util.Scanner;

public class ProductController {
    static IService productService = new ProductServiceImpl();
    Scanner scanner = new Scanner(System.in);
    final static String PRODUCT_SOURCE_FILE = "src\\ss17_io_binary_file_serialization\\bai_tap\\product_manager_by_binary_file\\data\\Product.txt";

    static {
        productService.setProductArrayList(ReadAndWriteToBinaryFile.readProductFromBinaryFile(PRODUCT_SOURCE_FILE));
    }

    public void addNewProduct() {
        System.out.print("Product id: ");
        String productId = scanner.nextLine();

        System.out.print("Product name: ");
        String productName = scanner.nextLine();

        System.out.print("Product manufactor: ");
        String productManufactor = scanner.nextLine();

        System.out.print("Product price: ");
        double productPrice = Double.parseDouble(scanner.nextLine());

        Product newProduct = new Product(productId, productName, productManufactor, productPrice);
        productService.add(newProduct);
        System.out.println("Product was added!");
    }

    public void displayProductList() {
        System.out.println("Product's list: ");
        productService.display();
    }

    public void searchProduct(String name) {
        List<Product> result = productService.search(name);
        if (result.size() > 0) {
            System.out.println("Search results:");
            for (Product product : result) {
                System.out.println(product);
            }
        } else {
            System.out.println("Can't find product!");
        }
    }

    public void editProduct(String id) {

    }

    public void saveToBianryFile() {
        ReadAndWriteToBinaryFile.writeProductToBinaryFile(PRODUCT_SOURCE_FILE, productService.getProductArrayList());
        System.out.println("Data saved!");
    }
}
