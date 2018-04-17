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

    public Result edit(long id) {
        VendingItem item = VendingItem.find.byId(id);
        Form<VendingItem> itemForm = formFactory.form(VendingItem.class);
        return ok(views.html.editItem.render(id, item, itemForm));
    }

    public Result update(long id) {
        VendingItem item = VendingItem.find.byId(id);
        Form<VendingItem> itemForm = formFactory.form(VendingItem.class).bindFromRequest();
        if (itemForm.hasErrors()) {
            return badRequest(views.html.newItem.render(itemForm));
        }
        VendingItem updatedItem = itemForm.get();
        updatedItem.setId(id);
        updatedItem.update();
        return index();
    }

    public Result delete(Long id) {
        VendingItem item = VendingItem.find.byId(id);
        if (item != null) {
            item.delete();
        }
        return index();
    }


}
