package models;

import models.VendingItem;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;
import static play.test.Helpers.*;

public class VendingItemTest {

    VendingItem vendingItem;

    @Before
    public void before() {
        vendingItem = new VendingItem();
    }

    @Test
    public void testId() {
        vendingItem.setId(1L);
        assertEquals(vendingItem.getId(), 1L);
    }

    @Test
    public void testName() {
        vendingItem.setName("Item A");
        assertEquals(vendingItem.getName(), "Item A");
    }

    @Test
    public void testPrice() {
        vendingItem.setPrice(BigDecimal.valueOf(0.65));
        assertEquals(vendingItem.getPrice(), BigDecimal.valueOf(0.65));
    }

    @Test
    public void testQuantity() {
        vendingItem.setQuantity(3);
        assertEquals(vendingItem.getQuantity(), 3);
    }

}
