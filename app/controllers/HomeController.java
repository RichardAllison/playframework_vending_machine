package controllers;

import models.Sale;
import models.VendingItem;
import play.mvc.*;

import java.util.Date;
import java.util.List;
import javax.inject.Inject;
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
        return sale(sale.getId(), item.getId());
    }

    public Result sale(long id, long itemId) {
        VendingItem item = VendingItem.find.byId(Long.valueOf(itemId));
        Sale sale = Sale.find.byId(Long.valueOf(id));
        return ok(views.html.sale.render(item, sale));
    }

}
