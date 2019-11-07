package rocks.zipcode.io.comparators;

import rocks.zipcode.io.Item;

import java.util.Comparator;

/**
 * @author leon on 30/01/2019.
 */
public class IdComparator implements Comparator<Item> {
    @Override
    public int compare(Item item, Item t1) {
        if(item.getId()>t1.getId()){
            return 1;
        }
        else if(item.getId()<t1.getId()){
            return -1;
        }
        else{
            return 0;
        }
    }
}
