package sax;

import sax.Productfactory.Product;

import java.util.ArrayList;

public class Catalog {
    private ArrayList<Product> products;

    public Catalog(){
        products = new ArrayList<>();
    }

    public ArrayList<Product> getProducts(){
        return products;
    }

    public void setProducts(ArrayList<Product> products){
        this.products = products;
    }

    public  void push(Product p){
        products.add(p);
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        for(Product p: products){
            sb.append(p.toString());
        }
        return sb.toString();
    }

    public void sayHello(){
        for(Product p: products){
            p.sayhello();
        }
    }
}
