package rocks.zipcode.io.comparators;

import rocks.zipcode.io.Item;

import java.util.Comparator;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

/**
 * @author leon on 30/01/2019.
 */
public class NameComparator implements Comparator<Item> {
    @Override
    public int compare(Item o1, Item o2) {
        return 0;
    }

    @Override
    public Comparator<Item> reversed() {
        return null;
    }

    @Override
    public Comparator<Item> thenComparing(Comparator<? super Item> other) {
        return null;
    }

    @Override
    public <U> Comparator<Item> thenComparing(Function<? super Item, ? extends U> keyExtractor, Comparator<? super U> keyComparator) {
        return null;
    }

    @Override
    public <U extends Comparable<? super U>> Comparator<Item> thenComparing(Function<? super Item, ? extends U> keyExtractor) {
        return null;
    }

    @Override
    public Comparator<Item> thenComparingInt(ToIntFunction<? super Item> keyExtractor) {
        return null;
    }

    @Override
    public Comparator<Item> thenComparingLong(ToLongFunction<? super Item> keyExtractor) {
        return null;
    }

    @Override
    public Comparator<Item> thenComparingDouble(ToDoubleFunction<? super Item> keyExtractor) {
        return null;
    }
}
