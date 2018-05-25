package models;

import javax.persistence.*;

import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;

import java.math.BigDecimal;
import java.math.MathContext;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Entity
public class VendingMachine extends Model {

    @Id
    private Long id;
    private int pennies;
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

    public int getPennies() {
        return this.pennies;
    };

    public void setPennies(int pennies) {
        this.pennies = pennies;
    }

    public void incrementPennies() {
        this.pennies += 1;
    }

    public void decrementPennies() {
        this.pennies -= 1;
    }

    public int getNickels() {
        return this.nickels;
    }

    public void setNickels(int nickels) {
        this.nickels = nickels;
    }

    public void incrementNickels() {
        this.nickels += 1;
    }

    public void decrementNickels() {
        this.nickels -= 1;
    }

    public int getDimes() {
        return this.dimes;
    }

    public void setDimes(int dimes) {
        this.dimes = dimes;
    }

    public void incrementDimes() {
        this.dimes += 1;
    }

    public void decrementDimes() {
        this.dimes -= 1;
    }

    public int getQuarters() {
        return this.quarters;
    }

    public void setQuarters(int quarters) {
        this.quarters = quarters;
    }

    public void incrementQuarters() {
        this.quarters += 1;
    }

    public void decrementQuarters() {
        this.quarters -= 1;
    }

    public int getDollars() {
        return this.dollars;
    }

    public void setDollars(int dollars) {
        this.dollars = dollars;
    }

    public void incrementDollars() {
        this.dollars += 1;
    }

    public void decrementDollars() {
        this.dollars -= 1;
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

    public Map<String, Integer> getChange(BigDecimal price, BigDecimal cash) {
        BigDecimal change = cash.subtract(price);

        String[] moneyKeys = {"pennies", "nickels", "dimes", "quarters", "dollars"};
        BigDecimal[] moneyValues = {BigDecimal.valueOf(0.01), BigDecimal.valueOf(0.05), BigDecimal.valueOf(0.10), BigDecimal.valueOf(0.25), BigDecimal.valueOf(1.00)};
        int[] coinsInMachine = {this.pennies, this.nickels, this.dimes, this.quarters, this.dollars};

        VendingMachine vendingMachine = VendingMachine.find.byId(this.id);
        Map<String, Integer> returnedChange = new HashMap<>();
        for (Integer j = moneyKeys.length-1; j >= 0; j--) {
            int number = 0;
            if (change.compareTo(moneyValues[j]) >= 0) {
                while (coinsInMachine[j] > 0 && change.compareTo(moneyValues[j]) >= 0) {
                    change = change.subtract(moneyValues[j]);
                    coinsInMachine[j]--;
                    number++;
                    switch (moneyKeys[j]) {
                        case "pennies": vendingMachine.decrementPennies();
                            break;
                        case "nickels": vendingMachine.decrementNickels();
                            break;
                        case "dimes": vendingMachine.decrementDimes();
                            break;
                        case "quarters": vendingMachine.decrementQuarters();
                            break;
                        case "dollars": vendingMachine.decrementDollars();
                            break;
                    }
                }
                vendingMachine.update();
                if (number != 0) {
                    returnedChange.put(moneyKeys[j], number);
                }
            }
        }

        return returnedChange;
    }
}
