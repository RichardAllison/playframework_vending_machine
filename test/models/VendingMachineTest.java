package models;

import models.VendingMachine;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;
import static play.test.Helpers.*;

public class VendingMachineTest {

    VendingMachine vendingMachine;

    @Before
    public void before() {
        vendingMachine = new VendingMachine();
        vendingMachine.setId(1L);
        vendingMachine.setNickels(5);
        vendingMachine.setDimes(4);
        vendingMachine.setQuarters(3);
        vendingMachine.setDollars(2);
    }

    @Test
    public void testId() {
        assertEquals(vendingMachine.getId(), 1L);
    }

    @Test
    public void testNickels() {
        assertEquals(vendingMachine.getNickels(), 5);
    }

    @Test
    public void testDimes() {
        assertEquals(vendingMachine.getDimes(), 4);
    }

    @Test
    public void testQuarters() {
        assertEquals(vendingMachine.getQuarters(), 3);
    }

    @Test
    public void testDollars() {
        assertEquals(vendingMachine.getDollars(), 2);
    }

    @Test
    public void testCalculateTotal() {
        assertEquals(vendingMachine.calculateTotal(), BigDecimal.valueOf(3.4).setScale(2));
    }

}
