package edu.poniyperro.criteria;

import edu.poniyperro.item.Item;
import edu.poniyperro.offer.Bid;
import edu.poniyperro.offer.Offer;

import java.util.List;
import java.util.stream.Collectors;

public class Bids implements Criteria{
    public Bids() {}

    @Override
    public List<Offer> checkCriteria(Item bid) {
        return bid.offers()
                .stream()
                .filter(o -> o instanceof Bid)
                .sorted()
                .collect(Collectors.toList());
    }
}
