package sax;

import org.xml.sax.Attributes;
import org.xml.sax.helpers.DefaultHandler;
import sax.Productfactory.ProductFactory;

public class ProductXMLHandler extends DefaultHandler {
    Catalog myCatalog = null;
    int id;
    String name;
    String brand;
    String type;
    Double price;

    ProductFactory factory = new ProductFactory();

    String currentCharacters;


    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) {

        switch (qName) {
            case "catalog": {
                myCatalog = new Catalog();
                break;
            }
            case "product": {
                id = Integer.parseInt(attributes.getValue("id"));
                break;
            }

        }

    }

    @Override
    public void endElement(String uri, String localName, String qName) {
        switch (qName) {

            case "product": {
                myCatalog.push(factory.createProduct(id, name, brand, type, price));
                break;
            }
            case "name": {
                name = currentCharacters.trim();
                break;
            }
            case "brand": {
                brand = currentCharacters.trim();
                break;
            }
            case "type": {
                type = currentCharacters.trim();
                break;
            }
            case "price": {
                price = Double.parseDouble(currentCharacters);
                break;
            }
        }

    }

    @Override
    public void characters(char ch[], int start, int length) {
        currentCharacters = new String(ch, start, length);
    }


    public Catalog getMyCatalog() {
        return myCatalog;
    }


}
