package models;

import javax.persistence.*;
import java.math.BigDecimal;

import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;

import java.math.MathContext;
import java.util.Date;

@Entity
public class Sale extends Model {
    @Id
    private long id;
    private Date time;
    private int itemId;
    private BigDecimal itemPrice;
    private int nickelsPaid;
    private int dimesPaid;
    private int quartersPaid;
    private int dollarsPaid;
    private boolean complete;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public BigDecimal getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(BigDecimal itemPrice) {
        this.itemPrice = itemPrice;
    }

    public int getNickelsPaid() {
        return nickelsPaid;
    }

    public void setNickelsPaid(int nickelsPaid) {
        this.nickelsPaid = nickelsPaid;
    }

    public int getDimesPaid() {
        return dimesPaid;
    }

    public void setDimesPaid(int dimesPaid) {
        this.dimesPaid = dimesPaid;
    }

    public int getQuartersPaid() {
        return quartersPaid;
    }

    public void setQuartersPaid(int quartersPaid) {
        this.quartersPaid = quartersPaid;
    }

    public int getDollarsPaid() {
        return dollarsPaid;
    }

    public void setDollarsPaid(int dollarsPaid) {
        this.dollarsPaid = dollarsPaid;
    }

    public BigDecimal amountTotal() {
        MathContext mc = new MathContext(2);

        BigDecimal total = new BigDecimal(0, mc);

        BigDecimal nickelValue = new BigDecimal(0.05, mc);
        BigDecimal dimeValue = new BigDecimal(0.10, mc);
        BigDecimal quarterValue = new BigDecimal(0.25, mc);
        BigDecimal dollarValue = new BigDecimal(1.00, mc);

        total = total.add(new BigDecimal(this.nickelsPaid, mc).multiply(nickelValue));
        total = total.add(new BigDecimal(this.dimesPaid, mc).multiply(dimeValue));
        total = total.add(new BigDecimal(this.quartersPaid, mc).multiply(quarterValue));
        total = total.add(new BigDecimal(this.dollarsPaid, mc).multiply(dollarValue));

        return total.setScale(2);
    }

    public BigDecimal amountDue()  {
        MathContext mc = new MathContext(2);
        BigDecimal amountPaid = amountTotal();
        return this.itemPrice.subtract(amountPaid);
    }

    public boolean isComplete() {
        return complete;
    }

    public void setComplete(boolean complete) {
        this.complete = complete;
    }

    public static final Finder<Long, Sale> find = new Finder<>(Sale.class);

}
