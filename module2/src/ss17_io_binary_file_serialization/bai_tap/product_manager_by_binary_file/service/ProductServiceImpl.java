package ss17_io_binary_file_serialization.bai_tap.product_manager_by_binary_file.service;

import ss17_io_binary_file_serialization.bai_tap.product_manager_by_binary_file.model.Product;
import ss17_io_binary_file_serialization.bai_tap.product_manager_by_binary_file.util.ReadAndWriteToBinaryFile;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductServiceImpl implements IService {
    private List<Product> productArrayList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public List<Product> getProductArrayList() {
        return productArrayList;
    }

    public void setProductArrayList(List<Product> productArrayList) {
        this.productArrayList = productArrayList;
    }

    public void display() {
        for (Product product : productArrayList) {
            System.out.println(product);
        }
    }

    public void add(Product product) {
        this.productArrayList.add(product);
    }

    public List<Product> search(String name) {
        List<Product> result = new ArrayList<>();
        for (Product product : productArrayList) {
            if (product.getProductName().toLowerCase().contains(name.toLowerCase())) {
                result.add(product);
            }
        }
        return result;
    }

    public void update(Product product) {
        int index = productArrayList.indexOf(product);
        if (index != -1) {
            productArrayList.set(index, product);
        } else {
            productArrayList.add(product);
        }
    }

//    public void delete(String id) {
//        int indexProductDelete = getProductIndexById(id);
//        if (indexProductDelete != -1) {
//            productArrayList.remove(indexProductDelete);
//            System.out.println("product's deleted");
//        } else {
//            System.out.println("product id does not exist");
//        }
//    }

//    public void edit(String id) {
//        int indexProductEditing = getProductIndexById(id);
//        int choose = -1;
//        String newProductId;
//        String newProductName;
//        double newProductPrice;
//
//        if (indexProductEditing != -1) {
//            showProductEditing(productArrayList.get(indexProductEditing));
//            while (choose != 0) {
//                System.out.print("What do you want to edit: ");
//                choose = Integer.parseInt(scanner.nextLine());
//                switch (choose) {
//                    case 1:
//                        System.out.print("Enter new id:");
//                        newProductId = scanner.nextLine();
//                        productArrayList.get(indexProductEditing).setProductId(newProductId);
//                        System.out.println("Product's updated");
//                        break;
//                    case 2:
//                        System.out.print("Enter new name:");
//                        newProductName = scanner.nextLine();
//                        productArrayList.get(indexProductEditing).setProductName(newProductName);
//                        System.out.println("Product's updated");
//                        break;
//                    case 3:
//                        System.out.print("Enter new price:");
//                        newProductPrice = Double.parseDouble(scanner.nextLine());
//                        productArrayList.get(indexProductEditing).setProductPrice(newProductPrice);
//                        System.out.println("Product's updated");
//                        break;
//                    case 4:
//                        choose = 0;
//                        break;
//                    default:
//                        System.out.println("No choice selected!");
//                }
//            }
//        } else {
//            System.out.println("product id does not exist");
//        }
//    }
//
//    public boolean getProductByName(String name) {
//        boolean result = false;
//        for (int i = 0; i < productArrayList.size(); i++) {
//            if (productArrayList.get(i).getProductName().toLowerCase().contains(name.toLowerCase())) {
//                System.out.println(productArrayList.get(i));
//                result = true;
//            }
//        }
//        return result;
//    }
//
//    public int getProductIndexById(String id) {
//        for (int i = 0; i < productArrayList.size(); i++) {
//            if (productArrayList.get(i).getProductId().equals(id)) {
//                return i;
//            }
//        }
//        return -1;
//    }
//
//    public void showProductEditing(Product product) {
//        System.out.println("Enter your selection:");
//        System.out.println("1. Id: " + product.getProductId());
//        System.out.println("2. Name: " + product.getProductName());
//        System.out.println("3. Price: " + product.getProductPrice());
//        System.out.println("4. Exit");
//    }
}
