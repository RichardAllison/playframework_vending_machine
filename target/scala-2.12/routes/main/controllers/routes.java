// @GENERATOR:play-routes-compiler
// @SOURCE:/mnt/c/Users/Richard/Desktop/Java Web App/play-project/vendingmachine/conf/routes
// @DATE:Tue Apr 17 16:21:13 GMT 2018

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseItemController ItemController = new controllers.ReverseItemController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseServiceController ServiceController = new controllers.ReverseServiceController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseHomeController HomeController = new controllers.ReverseHomeController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseAssets Assets = new controllers.ReverseAssets(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseItemController ItemController = new controllers.javascript.ReverseItemController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseServiceController ServiceController = new controllers.javascript.ReverseServiceController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseHomeController HomeController = new controllers.javascript.ReverseHomeController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseAssets Assets = new controllers.javascript.ReverseAssets(RoutesPrefix.byNamePrefix());
  }

}
