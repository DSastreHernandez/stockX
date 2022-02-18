package edu.poniyperro.criteria;

import edu.poniyperro.item.Item;
import edu.poniyperro.offer.Offer;

import java.util.List;

public class Max implements Criteria{
    Criteria criteria = null;
    Criteria otherCriteria = null;

    public Max(Criteria criteria,Criteria otherCriteria){
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Offer> checkCriteria(Item item) {
        Criteria Criterias = new Criterias(criteria, otherCriteria);
    }
}
