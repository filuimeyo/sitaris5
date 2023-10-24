package sax.strategies;

import sax.Catalog;
import sax.Productfactory.Product;

import java.util.List;


public class ConcreteStrategyTotal implements Strategy {
    @Override
    public double execute(Catalog catalog) {

        List<Product> productList =  catalog.getProducts();

        return productList.stream()
                .map(Product::getPrice).reduce(Double::sum)
                .orElse(-1.0);
    }
}
