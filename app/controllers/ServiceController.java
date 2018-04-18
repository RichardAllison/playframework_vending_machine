package controllers;

import models.VendingItem;
import models.VendingMachine;
import play.mvc.*;

import java.util.List;
import javax.inject.Inject;
import play.data.Form;
import play.data.FormFactory;

public class ServiceController extends Controller {

    private final FormFactory formFactory;

    @Inject
    public ServiceController(FormFactory formFactory) {
        this.formFactory = formFactory;
    }

    public Result index() {
        return ok(views.html.service.render());
    }

    public Result items() {
        List<VendingItem> items = VendingItem.find.all();
        return ok(views.html.items.render(items));
    }

    public Result newItem() {
        Form<VendingItem> itemForm = formFactory.form(VendingItem.class);
        return ok(views.html.newItem.render(itemForm));
    }

    public Result saveItem() {
        Form<VendingItem> itemForm = formFactory.form(VendingItem.class).bindFromRequest();
        if (itemForm.hasErrors()) {
            return badRequest(views.html.newItem.render(itemForm));
        }

        VendingItem item = itemForm.get();
        item.save();
        return items();
    }

    public Result editItem(long id) {
        VendingItem item = VendingItem.find.byId(id);
        Form<VendingItem> itemForm = formFactory.form(VendingItem.class);
        return ok(views.html.editItem.render(id, item, itemForm));
    }

    public Result updateItem(long id) {
        Form<VendingItem> itemForm = formFactory.form(VendingItem.class).bindFromRequest();
        if (itemForm.hasErrors()) {
            VendingItem item = VendingItem.find.byId(id);
            return badRequest(views.html.editItem.render(id, item, itemForm));
        }
        VendingItem updatedItem = itemForm.get();
        updatedItem.setId(id);
        updatedItem.update();
        return items();
    }

    public Result deleteItem(Long id) {
        VendingItem item = VendingItem.find.byId(id);
        if (item != null) {
            item.delete();
        }
        return items();
    }

    public Result change() {
        VendingMachine vendingMachine = VendingMachine.find.byId(1L);
        if (vendingMachine == null){
            vendingMachine = new VendingMachine();
            vendingMachine.setId(1);
            vendingMachine.setDimes(1);
            vendingMachine.setNickels(0);
            vendingMachine.setQuarters(0);
            vendingMachine.setDollars(0);
            vendingMachine.save();
        }
        double total = vendingMachine.calculateTotal();
        return ok(views.html.change.render(vendingMachine, total));
    }

    public Result editChange() {
        VendingMachine vendingMachine = VendingMachine.find.byId(1L);
        Form<VendingMachine> vendingMachineForm = formFactory.form(VendingMachine.class);
        return ok(views.html.editChange.render(vendingMachine, vendingMachineForm));
    }

    public Result updateChange() {
        Form<VendingMachine> vendingMachineForm = formFactory.form(VendingMachine.class).bindFromRequest();
        if (vendingMachineForm.hasErrors()) {
            VendingMachine vendingMachine = VendingMachine.find.byId(1L);
            return badRequest(views.html.editChange.render(vendingMachine, vendingMachineForm));
        }
        VendingMachine updatedVendingMachine = vendingMachineForm.get();
        updatedVendingMachine.setId(1L);
        updatedVendingMachine.update();
        return index();
    }

}