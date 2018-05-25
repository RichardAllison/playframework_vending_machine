package models;

import models.Sale;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.Date;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static play.test.Helpers.*;

public class SaleTest {

    Sale sale;

    @Before
    public void before() {
        sale = new Sale();
        sale.setId(1L);
        sale.setTime(new Date(0));
        sale.setItemId(1);
        sale.setItemPrice(BigDecimal.valueOf(1.5));
        sale.setNickelsPaid(1);
        sale.setDimesPaid(1);
        sale.setQuartersPaid(1);
        sale.setDollarsPaid(1);
    }

    @Test
    public void testId() {
        assertEquals(sale.getId(), 1L);
    }

    @Test
    public void testTime() {
        assertEquals(sale.getTime(), new Date(0));
    }

    @Test
    public void testFormattedTime() {
        assertEquals(sale.getFormattedTime(), "1970.01.01 00:00");
    }


    @Test
    public void testItemId() {
        assertEquals(sale.getItemId(), 1);
    }

    @Test
    public void testItemPrice() {
        assertEquals(sale.getItemPrice(), BigDecimal.valueOf(1.5));
    }

    @Test
    public void testNickelsPaid() {
        assertEquals(sale.getNickelsPaid(), 1);
    }

    @Test
    public void testDimesPaid() {
        assertEquals(sale.getDimesPaid(), 1);
    }

    @Test
    public void testQuartersPaid() {
        assertEquals(sale.getQuartersPaid(), 1);
    }

    @Test
    public void testDollarsPaid() {
        assertEquals(sale.getDollarsPaid(), 1);
    }

    @Test
    public void testCompleteFalse() {
        assertFalse(sale.isComplete());
    }

    @Test
    public void testCompleteTrue() {
        sale.setDimesPaid(2);
        sale.setComplete(true);
        assertTrue(sale.isComplete());
    }

    @Test
    public void testAmountTotal() {
        assertEquals(sale.amountTotal(), BigDecimal.valueOf(1.4).setScale(2));
    }

    @Test
    public void testAmountDue() {
        assertEquals(sale.amountDue(), BigDecimal.valueOf(0.1).setScale(2));
    }

}
