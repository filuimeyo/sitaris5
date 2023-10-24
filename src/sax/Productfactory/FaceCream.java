package sax.Productfactory;

public class FaceCream extends Product {
    public FaceCream(int id, String name, String brand, double price) {
        super(id, name, brand, "крем для лица", price);
    }

    @Override
    public void sayhello() {
        System.out.println("Здравстуйте, я крем для лица");
    }
}
