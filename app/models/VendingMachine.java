package models;

import javax.persistence.*;

import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;

import java.math.BigDecimal;
import java.math.MathContext;
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
    @OneToMany(mappedBy="vendingMachine")
    private List<VendingItem> vendingItems = new ArrayList<VendingItem>();

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

    public BigDecimal calculateTotal() {

        MathContext mc = new MathContext(2);

        BigDecimal total = new BigDecimal(0, mc);

        BigDecimal nickelValue = new BigDecimal(0.05, mc);
        BigDecimal dimeValue = new BigDecimal(0.10, mc);
        BigDecimal quarterValue = new BigDecimal(0.25, mc);
        BigDecimal dollarValue = new BigDecimal(1.00, mc);

        total = total.add(new BigDecimal(this.nickels, mc).multiply(nickelValue));
        total = total.add(new BigDecimal(this.dimes, mc).multiply(dimeValue));
        total = total.add(new BigDecimal(this.quarters, mc).multiply(quarterValue));
        total = total.add(new BigDecimal(this.dollars, mc).multiply(dollarValue));

        return total.setScale(2);
    }

    public List<VendingItem> getVendingItems() {
        return this.vendingItems;
    }

    public void addVendingItem(VendingItem vendingItem) {
        this.vendingItems.add(vendingItem);
    }

    public void vend(long id) {
        VendingItem item = VendingItem.find.byId(Long.valueOf(id));
        if (item.getQuantity() > 0) {
            int newQuantity = item.getQuantity() - 1;
            item.setQuantity(newQuantity);
            item.save();
        }
    }
}
