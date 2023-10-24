package sax.strategies;

import sax.Catalog;
import sax.Productfactory.Product;

import java.util.List;

public class ConcreteStrategyAvg implements Strategy {
    @Override
    public double execute(Catalog catalog) {

        List<Product> productList =  catalog.getProducts();

        return productList.stream()
                .map(Product::getPrice).reduce(Double::sum).map(it->it/productList.size())
                .orElse(-1.0);
    }
}