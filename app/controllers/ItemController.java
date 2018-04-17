package controllers;

import play.mvc.*;
import models.VendingItem;

import java.util.List;

public class ItemController extends Controller {

    public Result index() {
        List<VendingItem> items = VendingItem.find.all();
        return ok(views.html.items.render(items));
    }


}
