package rocks.zipcode.io.comparators;

import rocks.zipcode.io.Item;

import java.util.Comparator;

/**
 * @author leon on 30/01/2019.
 */
public class NameComparator implements Comparator<Item> {


    public int compare(Item item1, Item item2)
    {
        String name1 = item1.getName();
        String name2 = item2.getName();
        return name1.compareTo(name2);
    }
}
