package rocks.zipcode.io.itemsorter;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcode.io.Item;
import rocks.zipcode.io.ItemSorter;
import rocks.zipcode.io.comparators.PriceComparator;

import java.util.Comparator;

/**
 * @author leon on 30/0/209.
 */
public class SortByPriceTest {
    @Test
    public void test() {
        // given
        Item item3 = new Item(null, null, 100.0);
        Item item2 = new Item(null, null, 1.5);
        Item item = new Item(null, null, 2.0);

        Item[] itemsToSort = {item,item2,item3};
        Item[] expected = {item2, item, item3};

        ItemSorter itemSorter = new ItemSorter(itemsToSort);
        Comparator<Item> comparator = (Comparator<Item>) new PriceComparator();

        Item[] actual = itemSorter.sort(comparator);

        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void test2() {
        // given
        Item item3 = new Item(null, null, 0.0);
        Item item2 = new Item(null, null, 1.0);
        Item item = new Item(null, null, 3.0);
        Item[] itemsToSort = {item2, item, item3};
        Item[] expected = {item3, item2, item};
        ItemSorter itemSorter = new ItemSorter(itemsToSort);
        Comparator<Item> comparator = (Comparator<Item>) new PriceComparator();

        // when
        Item[] actual = itemSorter.sort(comparator);

        // then
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void test3() {
        // given
        Item item3 = new Item(null, null, 17.);
        Item item2 = new Item(null, null, 0.);
        Item item = new Item(null, null, .5);
        Item[] itemsToSort = {item, item2, item3};
        Item[] expected = {item2, item, item3};
        ItemSorter itemSorter = new ItemSorter(itemsToSort);
        Comparator<Item> comparator = (Comparator<Item>) new PriceComparator();

        // when
        Item[] actual = itemSorter.sort(comparator);

        // then
        Assert.assertArrayEquals(expected, actual);
    }
}
