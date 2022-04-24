package rocks.zipcode.io.comparators;

import rocks.zipcode.io.Item;

import java.util.Comparator;

/**
 * @author leon on 30/01/2019.
 */
public class PriceComparator implements Comparator<Item> {


    public int compare(Item item1, Item item2) {
        Double price1=item1.getPrice();
        Double price2=item2.getPrice();
        return price1.compareTo(price2);
    }
}
