package edu.poniyperro.item;

import edu.poniyperro.offer.Bid;
import edu.poniyperro.offer.Offer;

import java.util.ArrayList;
import java.util.List;

public class Sneaker implements  Item{
    private String style = "";
    private String name = "";
    private int sale = 0;
    private int ask = 0;
    private int bid = 0;
    private List<Offer> offers = new ArrayList<Offer>();

    public Sneaker(String style,String name) {
        this.style = style;
        this.name = name;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSale() {
        return sale;
    }

    public void setSale(int sale) {
        this.sale = sale;
    }

    public int getAsk() {
        return ask;
    }

    public void setAsk(int ask) {
        this.ask = ask;
    }

    public int getBid() {
        return bid;
    }

    public void setBid(int bid) {
        this.bid = bid;
    }

    public void add(Offer offer) {
        this.offers.add(offer);
    }

    public List<Offer> offers() {
        return this.offers;
    }

    @Override
    public String toString() {
        return "Sneaker{" +
                "style='" + style + '\'' +
                ", name='" + name + '\'' +
                ", sale=" + sale +
                ", ask=" + ask +
                ", bid=" + bid +
                '}';
    }
}
