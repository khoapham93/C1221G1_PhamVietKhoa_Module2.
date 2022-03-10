package ss17_io_binary_file_serialization.bai_tap.product_manager_by_binary_file.util;

import ss17_io_binary_file_serialization.bai_tap.product_manager_by_binary_file.model.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteToBinaryFile {

    public static List<Product> readProductFromBinaryFile(String path){
        List<Product> products = new ArrayList<>();
        try {
            File file = new File(path);
            if (!file.exists()){
                throw new FileNotFoundException();
            }
            if (file.length() > 0){
                FileInputStream fileInput = new FileInputStream(file);
                ObjectInputStream ObjectInput = new ObjectInputStream(fileInput);
                products = (List<Product>) ObjectInput.readObject();
                fileInput.close();
                ObjectInput.close();
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return products;
    }
    public static void writeProductToBinaryFile(String path, List<Product> products){
        try {
            File file = new File(path);
            FileOutputStream fileOutput = new FileOutputStream(file);
            ObjectOutputStream objectOutput = new ObjectOutputStream(fileOutput);
            objectOutput.writeObject(products);
            objectOutput.close();
            fileOutput.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
