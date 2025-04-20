package rocks.zipcode.io.comparators;

import rocks.zipcode.io.Item;

import java.util.Comparator;

/**
 * @author leon on 30/01/2019.
 */
public class PriceComparator implements Comparator<Item> {

    public int compare(Item firstItem, Item secondItem){
        int compareItem = 0;

        if (firstItem.getId() != null && secondItem.getId() != null){
            compareItem = firstItem.getId().compareTo(secondItem.getId());
        }

        if (firstItem.getName() != null && secondItem.getName() != null){
            compareItem = firstItem.getName().compareTo(secondItem.getName());
        }
        if (firstItem.getPrice() != null && secondItem.getPrice() != null){
            compareItem = firstItem.getPrice().compareTo(secondItem.getPrice());
        }

        return compareItem;
    }

}
