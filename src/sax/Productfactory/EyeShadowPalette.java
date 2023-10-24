package sax.Productfactory;

public class EyeShadowPalette extends Product {
    public EyeShadowPalette(int id, String name, String brand, double price) {
        super(id, name, brand, "палетка теней", price);
    }


    @Override
    public void sayhello() {
        System.out.println("Добрый день, это палетка теней");
    }
}