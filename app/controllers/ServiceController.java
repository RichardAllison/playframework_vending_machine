package controllers;

import play.mvc.*;

public class ServiceController extends Controller {

    public Result index() {
        return ok(views.html.service.render());
    }


}