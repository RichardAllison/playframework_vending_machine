package models;

import javax.persistence.*;

import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;

import java.util.Date;

@Entity
public class Sale extends Model  {

    @Id
    private long id;
    private Date time;
    private int itemId;
    private double itemPrice;
    private int nickelsPaid;
    private int dimesPaid;
    private int quartersPaid;
    private int dollarsPaid;
    private double amountPaid;
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

    public double getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(double itemPrice) {
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

    public double getAmountPaid() {
        return amountPaid;
    }

    public void setAmountPaid(double amountPaid) {
        this.amountPaid = amountPaid;
    }

    public double amountDue()  {
        return this.itemPrice - this.amountPaid;
    }

    public boolean isComplete() {
        return complete;
    }

    public void setComplete(boolean complete) {
        this.complete = complete;
    }

    public static final Finder<Long, Sale> find = new Finder<>(Sale.class);
}
