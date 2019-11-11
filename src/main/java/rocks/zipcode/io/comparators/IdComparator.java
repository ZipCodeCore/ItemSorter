package rocks.zipcode.io.comparators;

import rocks.zipcode.io.Item;

import java.util.Comparator;

/**
 * @author leon on 30/01/2019.
 */
public class IdComparator implements Comparator<Item> {

    public int compare(Item firstItem, Item secondItem) {
        return firstItem.getId().compareTo(secondItem.getId());
    }
}
