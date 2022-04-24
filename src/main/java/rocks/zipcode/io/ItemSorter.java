package rocks.zipcode.io;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

/**
 * @author leon on 30/01/2019.
 */
public class ItemSorter {
    Item[] itemArray;
    public ItemSorter(Item[] items)
    {
        this.itemArray = items;
    }

    public Item[] sort(Comparator<Item> comparator)
    {
        Arrays.sort(itemArray, comparator);
        return itemArray;


    }
}
