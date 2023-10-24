package sax.Productfactory;

public class ProductFactory {

    public Product createProduct(int id, String name, String brand, String type, double price){

        Product toReturn = null;
        switch (type){

            case "Гидрофильное масло":{
                toReturn = new CleansingOil(id, name, brand, price);
                break;
            }
            case "Крем для лица":{
                toReturn = new FaceCream(id, name, brand, price);
                break;
            }
            case "Палетка теней":{
                toReturn = new EyeShadowPalette(id, name, brand, price);
                break;
            }
            default:
                throw new IllegalArgumentException("Ошибка типа:" + type);
        }
        return toReturn;
    }
}
