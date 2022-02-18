package edu.poniyperro.criteria;

import edu.poniyperro.item.Item;
import edu.poniyperro.offer.Offer;

import java.util.List;

public interface Criteria {
    List<Offer> checkCriteria(Item item);
}
