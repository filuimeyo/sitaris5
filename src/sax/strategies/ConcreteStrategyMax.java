package sax.strategies;

import sax.Catalog;
import sax.Productfactory.Product;

import java.util.List;

public class ConcreteStrategyMax implements Strategy {
    @Override
    public double execute(Catalog catalog) {

        List<Product> productList =  catalog.getProducts();

        return productList.stream()
                .map(Product::getPrice).reduce(Double::max)
                .orElse(-1.0);
    }
}

