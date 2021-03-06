package controllers;

import models.Sale;
import models.VendingItem;
import models.VendingMachine;
import play.mvc.*;

import java.math.BigDecimal;
import java.util.*;
import javax.inject.Inject;
import play.data.DynamicForm;
import play.data.Form;
import play.data.FormFactory;
//import com.fasterxml.jackson.databind.JsonNode;
//import play.libs.Json;

public class HomeController extends Controller {

    private final FormFactory formFactory;

    @Inject
    public HomeController(FormFactory formFactory) {
        this.formFactory = formFactory;
    }

    public Result index() {
        List<VendingItem> availableItems = VendingItem.getAvailableItems();
        return ok(views.html.index.render(availableItems));
    }

    public Result newSale() {
        Form<Sale> itemForm = formFactory.form(Sale.class).bindFromRequest();
        Sale sale = itemForm.get();
        VendingItem item = sale.getItem();
        if (item==null){
            List<VendingItem> items = VendingItem.find.all();
            return ok(views.html.index.render(items));
        }
        sale.setItemPrice(item.getPrice());
        sale.setTime(new Date());
        sale.save();
        return redirect("/sale/" + sale.getId() + "/item/" + item.getId());
    }

    public Result sale(long id, long itemId) {
        Sale sale = Sale.find.byId(id);
        VendingItem item = VendingItem.find.byId(itemId);
        if (item.getQuantity() <= 0) {
            return redirect("/");
        }
        if (sale.amountDue().compareTo(BigDecimal.valueOf(0)) <= 0) {
            VendingMachine vendingMachine = VendingMachine.find.byId(1L);
            sale.setComplete(true);
            sale.save();
            item.setQuantity(item.getQuantity() -1);
            item.save();
            Map<String, Integer> change = vendingMachine.getChange(item.getPrice(), sale.amountTotal());

            return ok(views.html.saleComplete.render(sale, item, change));
        }
        return ok(views.html.sale.render(sale, item));
    }

    public Result insertNickel(long id, long itemId) {
        VendingMachine vendingMachine = VendingMachine.find.byId(1L);
        VendingItem item = VendingItem.find.byId(itemId);
        Sale sale = Sale.find.byId(id);

        int updatedNickels = vendingMachine.getNickels() + 1;
        vendingMachine.setNickels(updatedNickels);

        int nickelsPaid = sale.getNickelsPaid() + 1;
        sale.setNickelsPaid(nickelsPaid);

        sale.update();
        vendingMachine.update();
        return redirect("/sale/" + sale.getId() + "/item/" + item.getId());
    }

    public Result insertDime(long id, long itemId) {
        VendingMachine vendingMachine = VendingMachine.find.byId(1L);
        VendingItem item = VendingItem.find.byId(itemId);
        Sale sale = Sale.find.byId(id);

        int updatedDimes = (vendingMachine.getDimes() + 1);
        vendingMachine.setDimes(updatedDimes);

        int dimesPaid = sale.getDimesPaid() + 1;
        sale.setDimesPaid(dimesPaid);

        sale.update();
        vendingMachine.update();
        return redirect("/sale/" + sale.getId() + "/item/" + item.getId());
    }

    public Result insertQuarter(long id, long itemId) {
        VendingMachine vendingMachine = VendingMachine.find.byId(1L);
        VendingItem item = VendingItem.find.byId(itemId);
        Sale sale = Sale.find.byId(id);

        int updatedQuarters = vendingMachine.getQuarters() + 1;
        vendingMachine.setQuarters(updatedQuarters);

        int quartersPaid = sale.getQuartersPaid() + 1;
        sale.setQuartersPaid(quartersPaid);

        sale.update();
        vendingMachine.update();
        return redirect("/sale/" + sale.getId() + "/item/" + item.getId());
    }

    public Result insertDollar(long id, long itemId) {
        VendingMachine vendingMachine = VendingMachine.find.byId(1L);
        VendingItem item = VendingItem.find.byId(itemId);
        Sale sale = Sale.find.byId(id);

        int updatedDollars = vendingMachine.getDollars() + 1;
        vendingMachine.setDollars(updatedDollars);

        int dollarsPaid = sale.getDollarsPaid() + 1;
        sale.setDollarsPaid(dollarsPaid);

        sale.update();
        vendingMachine.update();
        return redirect("/sale/" + sale.getId() + "/item/" + item.getId());
    }

    public Result returnCoins(long id, long itemId) {
        VendingMachine vendingMachine = VendingMachine.find.byId(1L);
        VendingItem item = VendingItem.find.byId(itemId);
        Sale sale = Sale.find.byId(id);

        int nickelsPaid = sale.getNickelsPaid();
        int dimesPaid = sale.getDimesPaid();
        int quartersPaid = sale.getQuartersPaid();
        int dollarsPaid = sale.getDollarsPaid();

        int updatedNickels = vendingMachine.getNickels() - nickelsPaid;

        vendingMachine.setNickels(updatedNickels);
        int updatedDimes = vendingMachine.getDimes() - dimesPaid;
        vendingMachine.setDimes(updatedDimes);
        int updatedQuarters = vendingMachine.getQuarters() - quartersPaid;
        vendingMachine.setQuarters(updatedQuarters);
        int updatedDollars = vendingMachine.getDollars() - dollarsPaid;
        vendingMachine.setDollars(updatedDollars);

        sale.setNickelsPaid(0);
        sale.setDimesPaid(0);
        sale.setQuartersPaid(0);
        sale.setDollarsPaid(0);

        sale.update();
        vendingMachine.update();

        HashMap<String, Integer> coinsReturned = new HashMap<>();
        coinsReturned.put("Nickels", nickelsPaid);
        coinsReturned.put("Dimes", dimesPaid);
        coinsReturned.put("Quarters", quartersPaid);
        coinsReturned.put("Dollars", dollarsPaid);

        return ok(views.html.saleReturnCoins.render(sale, item, coinsReturned));
    }

    public Result deleteSale(long id) {
        Sale sale = Sale.find.byId(id);
        if (sale != null) {
            sale.delete();
        }
        return index();
    }

//    public Result items() {
//        List<VendingItem> items = VendingItem.find.all();
//        JsonNode itemsJson = Json.toJson(items);
//        return ok(itemsJson);
//    } // infinite recursion (stack overflow) error

}
