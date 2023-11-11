package classwork.homework1.onlineStore.storage;

import classwork.homework1.onlineStore.model.Product;

import java.io.Serializable;

public class ProductStorage implements Serializable {
    private Product[] products = new Product[10];
    private int size;

    public void add(Product product) {
        if (products.length == size) {
            extend();
        }
        products[size++] = product;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(products[i]);

        }
    }

    private void extend() {
        Product[] tmp = new Product[products.length + 10];
        System.arraycopy(products, 0, tmp, 0, products.length);
        products = tmp;
    }

    public Product getById(String id) {
        for (int i = 0; i < size; i++) {
            if (products[i].getId().equals(id) && !products[i].isRemoved()) {
                return products[i];
            }
        }
        return null;
    }

}


