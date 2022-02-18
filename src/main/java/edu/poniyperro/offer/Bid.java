package edu.poniyperro.offer;

public class Bid implements Offer{
    private String size = "";
    private Integer bid = 0;

    public Bid(String size,int bid) {
        this.size = size;
        this.bid = bid;
    }

    public String size() {
        return size;
    }

    public int value() {
        return bid.intValue();
    }

    public int compareTo(Offer bid) {
        return this.bid.compareTo(bid.value());
    }

    @Override
    public String toString() {
        return "Bid{" +
                "size='" + size + '\'' +
                ", bid=" + bid +
                '}';
    }
}
