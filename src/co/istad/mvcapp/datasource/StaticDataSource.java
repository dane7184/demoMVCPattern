package co.istad.mvcapp.datasource;

import co.istad.mvcapp.model.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class StaticDataSource {
    private List<Product> products;
    public StaticDataSource(){
        products = new ArrayList<>();
        products.add(new Product(UUID.randomUUID(),10099,"Mouse",12.0));
        products.add(new Product(UUID.randomUUID(),10100,"Keyboard",7.0));
        products.add(new Product(UUID.randomUUID(),10111,"Speaker",6.5));
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
