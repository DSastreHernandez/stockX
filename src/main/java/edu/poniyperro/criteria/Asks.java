package edu.poniyperro.criteria;

import edu.poniyperro.item.Item;
import edu.poniyperro.offer.Ask;
import edu.poniyperro.offer.Offer;

import java.util.List;
import java.util.stream.Collectors;

public class Asks implements Criteria{
    public Asks() {}

    @Override
    public List<Offer> checkCriteria(Item ask) {
        return ask.offers()
                .stream()
                .filter(o -> o instanceof Ask)
                .sorted()
                .collect(Collectors.toList());
    }
}
