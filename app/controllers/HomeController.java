package controllers;

import models.Sale;
import models.VendingItem;
import models.VendingMachine;
import play.mvc.*;

import java.util.Date;
import java.util.List;
import javax.inject.Inject;
import play.data.DynamicForm;
import play.data.Form;
import play.data.FormFactory;

public class HomeController extends Controller {

    private final FormFactory formFactory;

    @Inject
    public HomeController(FormFactory formFactory) {
        this.formFactory = formFactory;
    }

    public Result index() {
        List<VendingItem> items = VendingItem.find.all();
        return ok(views.html.index.render(items));
    }

    public Result newSale() {
        Form<Sale> itemForm = formFactory.form(Sale.class).bindFromRequest();
        Sale sale = itemForm.get();
        VendingItem item = VendingItem.find.byId(Long.valueOf(sale.getItemId()));
        sale.setItemPrice(item.getPrice());
        sale.setTime(new Date());
        sale.save();
        return redirect("/sale/" + sale.getId() + "/item/" + item.getId());

    }

    public Result sale(long id, long itemId) {
        VendingItem item = VendingItem.find.byId(Long.valueOf(itemId));
        Sale sale = Sale.find.byId(Long.valueOf(id));
        return ok(views.html.sale.render(sale, item));
    }

//    public Result updateSale(long id, long itemId) {
//        Form<VendingMachine> requestDataForm = formFactory.form(VendingMachine.class).bindFromRequest();
//        VendingMachine requestData = new VendingMachine();
//        VendingMachine vendingMachine = VendingMachine.find.byId(1L);
//        VendingItem item = VendingItem.find.byId(Long.valueOf(itemId));
//        Sale sale = new Sale();
//        sale.setId(id);
//
//        sale.setNickelsPaid(requestData.getNickels());
//        sale.setDimesPaid(requestData.getDimes());
//        sale.setQuartersPaid(requestData.getQuarters());
//        sale.setDollarsPaid(requestData.getDollars());
//
////        double newAmountPaid = sale.getAmountPaid();
////        if (requestData.get("coin") == "Nickel") {
////            int nickelsPaid = sale.getNickelsPaid() + 1;
////            sale.setNickelsPaid(1);
////            vendingMachine.setNickels((vendingMachine.getNickels() + 1));
////            newAmountPaid += 0.05;
////        }
////        if (requestData.get("coin") == "Dime") {
////            int dimesPaid = sale.getDimesPaid() + 1;
////            sale.setDimesPaid(dimesPaid);
////            vendingMachine.setDimes((vendingMachine.getDimes() + 1));
////            newAmountPaid += 0.10;
////        }
////        if (requestData.get("coin") =="Quarter") {
////            int quartersPaid = sale.getQuartersPaid() + 1;
////            sale.setQuartersPaid(quartersPaid);
////            vendingMachine.setQuarters((vendingMachine.getQuarters() + 1));
////            newAmountPaid += 0.25;
////        }
////        if (requestData.get("coin")=="Dollar") {
////            int dollarsPaid = sale.getDollarsPaid() + 1;
////            sale.setDollarsPaid(dollarsPaid);
////            vendingMachine.setDollars((vendingMachine.getDollars()) + 1);
////            newAmountPaid += 1;
////        }
////
////        sale.setAmountPaid(newAmountPaid);
////
////        if (newAmountPaid == item.getPrice()) {
////            sale.setComplete(true);
////            // vending machine should vend item
////        }
//
//        sale.update();
//        requestData.save();
//        return ok(views.html.sale.render(sale, item));
////        return redirect("/sale/" + sale.getId() + "/item/" + item.getId());
//    }

    public Result insertNickel(long id, long itemId){
        VendingMachine vendingMachine = VendingMachine.find.byId(1L);
        VendingItem item = VendingItem.find.byId(Long.valueOf(itemId));
        Sale sale = Sale.find.byId(Long.valueOf(id));

        vendingMachine.setNickels((vendingMachine.getNickels() + 1));
        int nickelsPaid = sale.getNickelsPaid() + 1;
        sale.setNickelsPaid(nickelsPaid);
        double newAmountPaid = sale.getAmountPaid() + 0.05;
        sale.setAmountPaid(newAmountPaid);
        sale.update();
        return redirect("/sale/" + sale.getId() + "/item/" + item.getId());
    }
    public Result insertDime(long id, long itemId){
        VendingMachine vendingMachine = VendingMachine.find.byId(1L);
        VendingItem item = VendingItem.find.byId(Long.valueOf(itemId));
        Sale sale = Sale.find.byId(Long.valueOf(id));

        vendingMachine.setDimes((vendingMachine.getDimes() + 1));
        int dimesPaid = sale.getDimesPaid() + 1;
        sale.setDimesPaid(dimesPaid);
        double newAmountPaid = sale.getAmountPaid() + 0.10;
        sale.setAmountPaid(newAmountPaid);
        sale.update();
        return redirect("/sale/" + sale.getId() + "/item/" + item.getId());
    }
    public Result insertQuarter(long id, long itemId){
        VendingMachine vendingMachine = VendingMachine.find.byId(1L);
        VendingItem item = VendingItem.find.byId(Long.valueOf(itemId));
        Sale sale = Sale.find.byId(Long.valueOf(id));

        vendingMachine.setQuarters((vendingMachine.getQuarters() + 1));
        int quartersPaid = sale.getQuartersPaid() + 1;
        sale.setQuartersPaid(quartersPaid);
        double newAmountPaid = sale.getAmountPaid() + 0.25;
        sale.setAmountPaid(newAmountPaid);
        sale.update();
        return redirect("/sale/" + sale.getId() + "/item/" + item.getId());
    }
    public Result insertDollar(long id, long itemId){
        VendingMachine vendingMachine = VendingMachine.find.byId(1L);
        VendingItem item = VendingItem.find.byId(Long.valueOf(itemId));
        Sale sale = Sale.find.byId(Long.valueOf(id));

        vendingMachine.setDollars((vendingMachine.getDollars()) + 1);
        int dollarsPaid = sale.getDollarsPaid() + 1;
        sale.setDollarsPaid(dollarsPaid);
        double newAmountPaid = sale.getAmountPaid() + 1;
        sale.setAmountPaid(newAmountPaid);
        sale.update();
        return redirect("/sale/" + sale.getId() + "/item/" + item.getId());
    }
}
