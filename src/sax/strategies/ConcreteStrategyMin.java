package sax.strategies;

import sax.Catalog;
import sax.Productfactory.Product;

import java.util.List;

public class ConcreteStrategyMin implements Strategy {
    @Override
    public double execute(Catalog catalog) {

        List<Product> productList =  catalog.getProducts();

        return productList.stream()
                .map(Product::getPrice).reduce(Double::min)
                .orElse(-1.0);
    }
}