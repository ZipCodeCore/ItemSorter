package rocks.zipcode.io.comparators;

import rocks.zipcode.io.Item;
import java.util.Comparator;

/**
 * @author leon on 30/01/2019.
 */
public class NameComparator implements Comparator<Item> {
    @Override
    public int compare(Item item, Item t1) {
        return item.getName().compareTo(t1.getName());
    }
}
