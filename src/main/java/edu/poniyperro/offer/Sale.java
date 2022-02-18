package edu.poniyperro.offer;

public class Sale implements Offer{
    private String size = "";
    private Integer sale = 0;

    public Sale(String size, int sale) {
        this.size = size;
        this.sale = sale;
    }

    public String size() {
        return this.size;
    }

    public int value() {
        return this.sale.intValue();
    }

    public int compareTo(Offer sale) {
        return this.sale.compareTo(sale.value());
    }


    @Override
    public String toString() {
        return "Sale{" +
                "size='" + size + '\'' +
                ", sale=" + sale +
                '}';
    }
}
