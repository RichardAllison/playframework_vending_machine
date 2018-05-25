package models;
import javax.persistence.*;

import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


@Entity
public class VendingItem extends Model {

    @Id
    private Long id;
    private String name;
    private BigDecimal price;
    private int quantity;
    @ManyToOne
    private VendingMachine vendingMachine = new VendingMachine();

    public static final Finder<Long, VendingItem> find = new Finder<>(VendingItem.class);

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getPrice() {
        return this.price.setScale(2);
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public VendingMachine getVendingMachine() {
        return vendingMachine;
    }

    public void setVendingMachine(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    public static List<VendingItem> getAvailableItems() {
        List<VendingItem> allItems = find.all();
        List<VendingItem> availableItems = new ArrayList<VendingItem>();
        for (int i = 0; i < allItems.size(); i++) {
            if (allItems.get(i).getQuantity() > 0) {
                availableItems.add(allItems.get(i));
            }
        }
        return availableItems;
    }

}