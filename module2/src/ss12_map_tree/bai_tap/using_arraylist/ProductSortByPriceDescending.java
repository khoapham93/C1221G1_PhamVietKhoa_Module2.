package ss12_map_tree.bai_tap.using_arraylist;

import java.util.Comparator;

public class ProductSortByPriceDescending implements Comparator<Product> {

    @Override
    public int compare(Product product1, Product product2) {
        if (product1.getProductPrice() == product2.getProductPrice()) {
            return 0;
        } else if (product2.getProductPrice() > product1.getProductPrice()) {
            return 1;
        } else {
            return -1;
        }
    }
}
