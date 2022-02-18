package edu.poniyperro.criteria;

import edu.poniyperro.item.Item;
import edu.poniyperro.offer.Bid;
import edu.poniyperro.offer.Offer;

import java.util.List;
import java.util.Optional;

public class MaxBid implements Criteria{
    public MaxBid() {}

    @Override
    public List<Offer> checkCriteria(Item bid) {
        Optional<Offer> maxBid = bid.offers()
                .stream()
                .filter(o -> o instanceof Bid)
                .max(Offer::compareTo);
        return maxBid.isPresent() ? List.of(maxBid.get()) : List.of();
    }
}
