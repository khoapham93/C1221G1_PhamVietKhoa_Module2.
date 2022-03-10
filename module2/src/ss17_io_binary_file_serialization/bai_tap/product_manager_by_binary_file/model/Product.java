package ss17_io_binary_file_serialization.bai_tap.product_manager_by_binary_file.model;

import java.io.Serializable;
import java.util.Objects;

public class Product implements Serializable {
    private String productId;
    private String productName;
    private String manufactor;
    private double productPrice;

    public Product(String productId, String productName, String manufactor, double productPrice) {
        this.productId = productId;
        this.productName = productName;
        this.manufactor = manufactor;
        this.productPrice = productPrice;
    }

    public Product() {

    }

    public String getManufactor() {
        return manufactor;
    }

    public void setManufactor(String manufactor) {
        this.manufactor = manufactor;
    }
    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return getProductId().equals(product.getProductId());
    }
    @Override
    public String toString() {
        return "Product{" +
                "productId: " + productId +
                ", productName: " + productName +
                ", manufactor: " + manufactor +
                ", productPrice: " + productPrice +
                '}';
    }
}
