package edu.poniyperro.criteria;

import edu.poniyperro.item.Item;
import edu.poniyperro.offer.Ask;
import edu.poniyperro.offer.Offer;

import java.util.List;
import java.util.Optional;

public class minAsk implements Criteria{
    public minAsk() {}

    @Override
    public List<Offer> checkCriteria(Item ask) {
        Optional<Offer> minAsk = ask.offers()
                .stream()
                .filter(o -> o instanceof Ask)
                .min(Offer::compareTo);
        return minAsk.isPresent() ? List.of(minAsk.get()) : List.of();
    }
}
