package ar.edu.unq.criptop2p.model.entity;

public class Cotizacion {
    //private Criptomoneda criptoactivo;

    //private double cotizacion;

    private String symbol;
    private double price;


    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
