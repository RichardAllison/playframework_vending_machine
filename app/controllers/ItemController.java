package controllers;

import play.mvc.*;
import models.VendingItem;

import java.util.List;
import javax.inject.Inject;
import play.data.Form;
import play.data.FormFactory;

public class ItemController extends Controller {

    private final FormFactory formFactory;

    @Inject
    public ItemController(FormFactory formFactory) {
        this.formFactory = formFactory;
    }

    public Result index() {
        List<VendingItem> items = VendingItem.find.all();
        return ok(views.html.items.render(items));
    }

    public Result newItem() {
        Form<VendingItem> itemForm = formFactory.form(VendingItem.class);
        return ok(views.html.newItem.render(itemForm));
    }

    public Result save() {
        Form<VendingItem> itemForm = formFactory.form(VendingItem.class).bindFromRequest();
        if (itemForm.hasErrors()) {
            return badRequest(views.html.newItem.render(itemForm));
        }

        VendingItem item = itemForm.get();
        item.save();
        return index();
    }
//
//    public void edit(long id) {}
//    public void update(long id) {}


}
