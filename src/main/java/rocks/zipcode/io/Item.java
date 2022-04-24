package rocks.zipcode.io;

/**
 * @author leon on 30/01/2019.
 */
public class Item {
    String name;
    Long id;
    Double price;



    public Item()
    {
        this.name = "";
        this.id = 0L;
        this.price = 0.01;
    }

    public Item(Long inputId, String inputName, Double inputPrice) {
        this.name = inputName;
        this.id = inputId;
        this.price = inputPrice;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String inputName) {
        this.name = inputName;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long inputId)
    {
        this.id = inputId;
    }

    public Double getPrice() {
        return this.price;
    }

    public void setPrice(Double inputPrice) {
        this.price=inputPrice;
    }
}
