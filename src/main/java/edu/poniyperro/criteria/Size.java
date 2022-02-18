package edu.poniyperro.criteria;

import edu.poniyperro.item.Item;
import edu.poniyperro.offer.Offer;

import java.util.List;

public class Size implements Criteria{
    private String size = "";

    public Size(String size) {
        this.size = size;
    }

    @Override
    public List<Offer> checkCriteria(Item item) {

    }
}