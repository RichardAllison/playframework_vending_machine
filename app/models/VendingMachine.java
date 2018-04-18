package models;

//import java.util.*;
import javax.persistence.*;

import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class VendingMachine extends Model {

    @Id
    private Long id;
    private int nickels;
    private int dimes;
    private int quarters;
    private int dollars;
    @ManyToMany
    public List<VendingItem> vendingItems = new ArrayList<VendingItem>();

    public static final Finder<Long, VendingMachine> find = new Finder<>(VendingMachine.class);

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getNickels() {
        return this.nickels;
    }

    public void setNickels(int nickels) {
        this.nickels = nickels;
    }

    public int getDimes() {
        return this.dimes;
    }

    public void setDimes(int dimes) {
        this.dimes = dimes;
    }

    public int getQuarters() {
        return this.quarters;
    }

    public void setQuarters(int quarters) {
        this.quarters = quarters;
    }

    public int getDollars() {
        return this.dollars;
    }

    public void setDollars(int dollars) {
        this.dollars = dollars;
    }

    public double calculateTotal() {
        double total = 0.0;
        total += (this.nickels * 0.05);
        total += (this.dimes * 0.10);
        total += (this.quarters * 0.25);
        total += (this.dollars);
        return total;
    }

    public List<VendingItem> getVendingItems() {
        return vendingItems;
    }

    public VendingItem vend(long id) {
        VendingItem item = VendingItem.find.byId(Long.valueOf(id));
        int newQuantity = item.getQuantity() -1;
        item.setQuantity(newQuantity);
        item.save();
        return item;
    }
}
