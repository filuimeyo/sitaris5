package sax;

import org.xml.sax.SAXException;
import sax.strategies.ConcreteStrategyAvg;
import sax.strategies.ConcreteStrategyMax;
import sax.strategies.ConcreteStrategyMin;
import sax.strategies.ConcreteStrategyTotal;
import sax.strategies.Context;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.*;

public class Main {

    private final static String menu = """
            \nMenu:
            \t1. find total price
            \t2. find avg price
            \t3. find max price
            \t4. find min price
            \t5. view catalog
            \t0. exit
            Enter menu num:\s""";

    public static void main(String[] args) {

        String path = new File("D:/sitaris/sitaris4/src/sax/products.xml").getAbsolutePath();
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
            SAXParserFactory factory = SAXParserFactory.newInstance();
            SAXParser parser = factory.newSAXParser();
            ProductXMLHandler handler = new ProductXMLHandler();
            parser.parse(new File(path), handler);

            Catalog m = handler.getMyCatalog();

            Context context = Context.getInstance(m);

            boolean stopflag = false;
            while (!stopflag){
                System.out.print(menu);
                int c = Integer.parseInt(reader.readLine());
                switch (c){
                    case 1:{
                        context.setStrategy(new ConcreteStrategyTotal());
                        System.out.println(context.getResult());
                        break;
                    }
                    case 2:{
                        context.setStrategy(new ConcreteStrategyAvg());
                        System.out.println(context.getResult());
                        break;
                    }
                    case 3:{
                        context.setStrategy(new ConcreteStrategyMax());
                        System.out.println(context.getResult());
                        break;
                    }
                    case 4:{
                        context.setStrategy(new ConcreteStrategyMin());
                        System.out.println(context.getResult());
                        break;
                    }

                    case 5:{
                        System.out.println(m);
                        break;
                    }
                    case 0:{
                        stopflag = true;
                        break;
                    }
                    default:{
                        System.out.println("there is no such menu num");
                        break;
                    }
                }
            }


        } catch (IOException e){
            System.err.println(e);
        } catch (ParserConfigurationException | SAXException e){
            e.printStackTrace();
        }
    }
}