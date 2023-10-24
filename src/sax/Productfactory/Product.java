package sax.Productfactory;

abstract public class Product {
    protected int id;
    protected String name;
    protected String brand;
    protected String type;
    protected double price;

    public Product() {
    }

    public Product(int id, String name, String brand, String type, double price) {
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.type = type;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getBrand() {
        return brand;
    }

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    public int getId() {
        return id;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Product[id = " + getId() + "]" +
                "\nname: " + getName() +
                "\nbrand: " + getBrand() +
                "\ntype: " + getType() +
                "\nprice: " + getPrice() + " byn\n\n";
    }

    abstract public void sayhello();
}

