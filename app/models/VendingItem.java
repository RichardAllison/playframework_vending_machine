package models;

//import java.util.*;
import javax.persistence.*;

import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;


@Entity
public class VendingItem extends Model {

    @Id
    protected Long id;
    @Constraints.Required(message = "Name is required")
    protected String name;
    @Constraints.Required
    protected double price;
    @Constraints.Required
    protected int quantity;

    public static final Finder<Long, VendingItem> find = new Finder<>(VendingItem.class);

    public long getId() {
        return this.id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return this.price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return this.quantity;
    }

}

