package sax.strategies;

import sax.Catalog;

public class Context {

    private static Context instance;
    private Strategy strategy;
    private final Catalog catalog;

    private Context(Catalog catalog) {
        this.catalog = catalog;
    }

    public static Context getInstance(Catalog catalog) {
        if (instance == null){
            instance = new Context(catalog);
        }
        return instance;
    }


    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public String getResult() {

        String result = String.format("%.2f", strategy.execute(catalog));

        return result.equals("-1,00") ? "Empty catlog" : "Result of operation: " + result + "byn";

    }
}

