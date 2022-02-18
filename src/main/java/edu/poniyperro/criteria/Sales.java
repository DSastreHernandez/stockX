package edu.poniyperro.criteria;
import edu.poniyperro.item.Item;
import edu.poniyperro.offer.Offer;
import edu.poniyperro.offer.Sale;

import java.util.List;
import java.util.stream.Collectors;

public class Sales implements Criteria{
    public Sales() {}

    @Override
    public List<Offer> checkCriteria(Item sales) {
        return sales.offers()
                .stream()
                .filter(o -> o instanceof Sale)
                .sorted()
                .collect(Collectors.toList());
    }
}
