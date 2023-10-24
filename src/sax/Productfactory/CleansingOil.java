package sax.Productfactory;

public class CleansingOil extends Product {
    public CleansingOil(int id, String name, String brand, double price) {
        super(id, name, brand, "гидрофильное масло", price);
    }




    @Override
    public String toString() {
        return "Product[id = " + getId() + "]" +
                "\nname: " + getName() +
                "\nbrand: " + getBrand() +
                "\ntype: " + getType() +
                "\nprice: " + getPrice() + " byn\n\n";
    }

    @Override
    public void sayhello() {
        System.out.println("Привет.... Я.. гидрофильное масло...");
    }

}
