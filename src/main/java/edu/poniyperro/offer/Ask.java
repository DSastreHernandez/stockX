package edu.poniyperro.offer;

public class Ask implements Offer{
    private String size = "";
    private Integer ask = 0;

    public Ask(String size, int sale) {
        this.size = size;
        this.ask = sale;
    }

    public String size() {
        return this.size;
    }

    public int value() {
        return this.ask.intValue();
    }

    public int compareTo(Offer ask) {
        return this.ask.compareTo(ask.value());
    }


    @Override
    public String toString() {
        return "Sale{" +
                "size='" + size + '\'' +
                ", sale=" + ask +
                '}';
    }
}
