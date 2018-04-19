package models;

//import java.util.*;
import javax.persistence.*;

import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;

import java.util.ArrayList;
import java.util.List;


@Entity
public class VendingItem extends Model {

    @Id
    private Long id;
    @Constraints.Required
    private String name;
    @Constraints.Required
    private double price;
    @Constraints.Required
    private int quantity;
    @ManyToMany
    private List<VendingMachine> vendingMachines = new ArrayList<VendingMachine>();

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

    public List<VendingMachine> getVendingMachines() {
        return vendingMachines;
    }

    public void addVendingMachine(VendingMachine vendingMachine) {
        this.vendingMachines.add(vendingMachine);
    }
}

