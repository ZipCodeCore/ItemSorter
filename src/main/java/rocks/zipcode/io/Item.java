package rocks.zipcode.io;

import java.util.Comparator;

/**
 * @author leon on 30/01/2019.
 */
public class Item implements Comparator <Item> {
    private String userName;
    private Long id;
    private Double itemPrice;

    public Item() {
        this.userName = "";
        this.id = 0L;
        this.itemPrice = 0.01;
    }

    public Item(Long id, String name, Double price) {
        this.userName = name;
        this.id = id;
        this.itemPrice = price;
    }

    public String getName() {

        return this.userName;
    }

    public void setName(String name) {
        this.userName = name;
    }

    public Long getId() {

        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getPrice() {

        return this.itemPrice;
    }

    public void setPrice(Double price) {
        this.itemPrice = price;
    }


    public int compare(Item o1, Item o2) {
        return 0;
    }
}
