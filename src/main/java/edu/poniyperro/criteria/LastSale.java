package edu.poniyperro.criteria;

import edu.poniyperro.item.Item;
import edu.poniyperro.offer.Offer;

import java.util.List;

public class LastSale implements Criteria{
    public LastSale() {}

    @Override
    public List<Offer> checkCriteria(Item sale) {
        Criteria sales = new Sales();
        List<Offer> listSales = checkCriteria(sale);

        return listSales.isEmpty()? List.of() : List.of(listSales.get(listSales.size() - 1));
    }
}
