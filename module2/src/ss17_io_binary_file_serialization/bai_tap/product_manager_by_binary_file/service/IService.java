package ss17_io_binary_file_serialization.bai_tap.product_manager_by_binary_file.service;

import ss17_io_binary_file_serialization.bai_tap.product_manager_by_binary_file.model.Product;

import java.util.List;

public interface IService {
    void display();
    void add(Product product);
//    void delete(String id);
//    void edit(String id);
    List<Product> search(String name);
    List<Product> getProductArrayList();
    void setProductArrayList(List<Product> productArrayList);
}
