// @GENERATOR:play-routes-compiler
// @SOURCE:/mnt/c/Users/Richard/Desktop/vendingmachine/vendingmachine/conf/routes
// @DATE:Sun Apr 22 13:48:57 GMT 2018

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  HomeController_1: controllers.HomeController,
  // @LINE:25
  ServiceController_0: controllers.ServiceController,
  // @LINE:56
  Assets_2: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    HomeController_1: controllers.HomeController,
    // @LINE:25
    ServiceController_0: controllers.ServiceController,
    // @LINE:56
    Assets_2: controllers.Assets
  ) = this(errorHandler, HomeController_1, ServiceController_0, Assets_2, "/")

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_1, ServiceController_0, Assets_2, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index"""),
    ("""POST""", this.prefix, """controllers.HomeController.newSale()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """sale/""" + "$" + """id<[^/]+>/item/""" + "$" + """itemId<[^/]+>""", """controllers.HomeController.sale(id:Long, itemId:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """sale/""" + "$" + """id<[^/]+>/item/""" + "$" + """itemId<[^/]+>/nickel""", """controllers.HomeController.insertNickel(id:Long, itemId:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """sale/""" + "$" + """id<[^/]+>/item/""" + "$" + """itemId<[^/]+>/dime""", """controllers.HomeController.insertDime(id:Long, itemId:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """sale/""" + "$" + """id<[^/]+>/item/""" + "$" + """itemId<[^/]+>/quarter""", """controllers.HomeController.insertQuarter(id:Long, itemId:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """sale/""" + "$" + """id<[^/]+>/item/""" + "$" + """itemId<[^/]+>/dollar""", """controllers.HomeController.insertDollar(id:Long, itemId:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """sale/""" + "$" + """id<[^/]+>/item/""" + "$" + """itemId<[^/]+>/return""", """controllers.HomeController.returnCoins(id:Long, itemId:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """sale/""" + "$" + """id<[^/]+>/item/delete""", """controllers.HomeController.deleteSale(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """service""", """controllers.ServiceController.index()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """service/items""", """controllers.ServiceController.items()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """service/items/new""", """controllers.ServiceController.newItem()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """service/items""", """controllers.ServiceController.saveItem()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """service/items/""" + "$" + """id<[^/]+>""", """controllers.ServiceController.editItem(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """service/items/""" + "$" + """id<[^/]+>""", """controllers.ServiceController.updateItem(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """service/items/""" + "$" + """id<[^/]+>/delete""", """controllers.ServiceController.deleteItem(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """service/change""", """controllers.ServiceController.change()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """service/change/edit""", """controllers.ServiceController.editChange()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """service/change""", """controllers.ServiceController.updateChange()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """service/sales""", """controllers.ServiceController.sales()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index0_invoker = createInvoker(
    HomeController_1.index,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      this.prefix + """""",
      """ Home page""",
      Seq()
    )
  )

  // @LINE:8
  private[this] lazy val controllers_HomeController_newSale1_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_newSale1_invoker = createInvoker(
    HomeController_1.newSale(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "newSale",
      Nil,
      "POST",
      this.prefix + """""",
      """""",
      Seq("""nocsrf""")
    )
  )

  // @LINE:10
  private[this] lazy val controllers_HomeController_sale2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("sale/"), DynamicPart("id", """[^/]+""",true), StaticPart("/item/"), DynamicPart("itemId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_sale2_invoker = createInvoker(
    HomeController_1.sale(fakeValue[Long], fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "sale",
      Seq(classOf[Long], classOf[Long]),
      "GET",
      this.prefix + """sale/""" + "$" + """id<[^/]+>/item/""" + "$" + """itemId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:12
  private[this] lazy val controllers_HomeController_insertNickel3_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("sale/"), DynamicPart("id", """[^/]+""",true), StaticPart("/item/"), DynamicPart("itemId", """[^/]+""",true), StaticPart("/nickel")))
  )
  private[this] lazy val controllers_HomeController_insertNickel3_invoker = createInvoker(
    HomeController_1.insertNickel(fakeValue[Long], fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "insertNickel",
      Seq(classOf[Long], classOf[Long]),
      "POST",
      this.prefix + """sale/""" + "$" + """id<[^/]+>/item/""" + "$" + """itemId<[^/]+>/nickel""",
      """""",
      Seq("""nocsrf""")
    )
  )

  // @LINE:14
  private[this] lazy val controllers_HomeController_insertDime4_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("sale/"), DynamicPart("id", """[^/]+""",true), StaticPart("/item/"), DynamicPart("itemId", """[^/]+""",true), StaticPart("/dime")))
  )
  private[this] lazy val controllers_HomeController_insertDime4_invoker = createInvoker(
    HomeController_1.insertDime(fakeValue[Long], fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "insertDime",
      Seq(classOf[Long], classOf[Long]),
      "POST",
      this.prefix + """sale/""" + "$" + """id<[^/]+>/item/""" + "$" + """itemId<[^/]+>/dime""",
      """""",
      Seq("""nocsrf""")
    )
  )

  // @LINE:16
  private[this] lazy val controllers_HomeController_insertQuarter5_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("sale/"), DynamicPart("id", """[^/]+""",true), StaticPart("/item/"), DynamicPart("itemId", """[^/]+""",true), StaticPart("/quarter")))
  )
  private[this] lazy val controllers_HomeController_insertQuarter5_invoker = createInvoker(
    HomeController_1.insertQuarter(fakeValue[Long], fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "insertQuarter",
      Seq(classOf[Long], classOf[Long]),
      "POST",
      this.prefix + """sale/""" + "$" + """id<[^/]+>/item/""" + "$" + """itemId<[^/]+>/quarter""",
      """""",
      Seq("""nocsrf""")
    )
  )

  // @LINE:18
  private[this] lazy val controllers_HomeController_insertDollar6_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("sale/"), DynamicPart("id", """[^/]+""",true), StaticPart("/item/"), DynamicPart("itemId", """[^/]+""",true), StaticPart("/dollar")))
  )
  private[this] lazy val controllers_HomeController_insertDollar6_invoker = createInvoker(
    HomeController_1.insertDollar(fakeValue[Long], fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "insertDollar",
      Seq(classOf[Long], classOf[Long]),
      "POST",
      this.prefix + """sale/""" + "$" + """id<[^/]+>/item/""" + "$" + """itemId<[^/]+>/dollar""",
      """""",
      Seq("""nocsrf""")
    )
  )

  // @LINE:20
  private[this] lazy val controllers_HomeController_returnCoins7_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("sale/"), DynamicPart("id", """[^/]+""",true), StaticPart("/item/"), DynamicPart("itemId", """[^/]+""",true), StaticPart("/return")))
  )
  private[this] lazy val controllers_HomeController_returnCoins7_invoker = createInvoker(
    HomeController_1.returnCoins(fakeValue[Long], fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "returnCoins",
      Seq(classOf[Long], classOf[Long]),
      "POST",
      this.prefix + """sale/""" + "$" + """id<[^/]+>/item/""" + "$" + """itemId<[^/]+>/return""",
      """""",
      Seq("""nocsrf""")
    )
  )

  // @LINE:22
  private[this] lazy val controllers_HomeController_deleteSale8_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("sale/"), DynamicPart("id", """[^/]+""",true), StaticPart("/item/delete")))
  )
  private[this] lazy val controllers_HomeController_deleteSale8_invoker = createInvoker(
    HomeController_1.deleteSale(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "deleteSale",
      Seq(classOf[Long]),
      "POST",
      this.prefix + """sale/""" + "$" + """id<[^/]+>/item/delete""",
      """""",
      Seq("""nocsrf""")
    )
  )

  // @LINE:25
  private[this] lazy val controllers_ServiceController_index9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("service")))
  )
  private[this] lazy val controllers_ServiceController_index9_invoker = createInvoker(
    ServiceController_0.index(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ServiceController",
      "index",
      Nil,
      "GET",
      this.prefix + """service""",
      """ service page""",
      Seq()
    )
  )

  // @LINE:28
  private[this] lazy val controllers_ServiceController_items10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("service/items")))
  )
  private[this] lazy val controllers_ServiceController_items10_invoker = createInvoker(
    ServiceController_0.items(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ServiceController",
      "items",
      Nil,
      "GET",
      this.prefix + """service/items""",
      """ Items list""",
      Seq()
    )
  )

  // @LINE:31
  private[this] lazy val controllers_ServiceController_newItem11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("service/items/new")))
  )
  private[this] lazy val controllers_ServiceController_newItem11_invoker = createInvoker(
    ServiceController_0.newItem(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ServiceController",
      "newItem",
      Nil,
      "GET",
      this.prefix + """service/items/new""",
      """ Add item""",
      Seq()
    )
  )

  // @LINE:33
  private[this] lazy val controllers_ServiceController_saveItem12_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("service/items")))
  )
  private[this] lazy val controllers_ServiceController_saveItem12_invoker = createInvoker(
    ServiceController_0.saveItem(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ServiceController",
      "saveItem",
      Nil,
      "POST",
      this.prefix + """service/items""",
      """""",
      Seq("""nocsrf""")
    )
  )

  // @LINE:36
  private[this] lazy val controllers_ServiceController_editItem13_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("service/items/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ServiceController_editItem13_invoker = createInvoker(
    ServiceController_0.editItem(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ServiceController",
      "editItem",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """service/items/""" + "$" + """id<[^/]+>""",
      """ Edit item""",
      Seq()
    )
  )

  // @LINE:38
  private[this] lazy val controllers_ServiceController_updateItem14_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("service/items/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ServiceController_updateItem14_invoker = createInvoker(
    ServiceController_0.updateItem(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ServiceController",
      "updateItem",
      Seq(classOf[Long]),
      "POST",
      this.prefix + """service/items/""" + "$" + """id<[^/]+>""",
      """""",
      Seq("""nocsrf""")
    )
  )

  // @LINE:42
  private[this] lazy val controllers_ServiceController_deleteItem15_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("service/items/"), DynamicPart("id", """[^/]+""",true), StaticPart("/delete")))
  )
  private[this] lazy val controllers_ServiceController_deleteItem15_invoker = createInvoker(
    ServiceController_0.deleteItem(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ServiceController",
      "deleteItem",
      Seq(classOf[Long]),
      "POST",
      this.prefix + """service/items/""" + "$" + """id<[^/]+>/delete""",
      """ Delete item""",
      Seq("""nocsrf""")
    )
  )

  // @LINE:45
  private[this] lazy val controllers_ServiceController_change16_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("service/change")))
  )
  private[this] lazy val controllers_ServiceController_change16_invoker = createInvoker(
    ServiceController_0.change(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ServiceController",
      "change",
      Nil,
      "GET",
      this.prefix + """service/change""",
      """ Change in the machine""",
      Seq()
    )
  )

  // @LINE:48
  private[this] lazy val controllers_ServiceController_editChange17_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("service/change/edit")))
  )
  private[this] lazy val controllers_ServiceController_editChange17_invoker = createInvoker(
    ServiceController_0.editChange(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ServiceController",
      "editChange",
      Nil,
      "GET",
      this.prefix + """service/change/edit""",
      """ Edit change""",
      Seq()
    )
  )

  // @LINE:50
  private[this] lazy val controllers_ServiceController_updateChange18_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("service/change")))
  )
  private[this] lazy val controllers_ServiceController_updateChange18_invoker = createInvoker(
    ServiceController_0.updateChange(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ServiceController",
      "updateChange",
      Nil,
      "POST",
      this.prefix + """service/change""",
      """""",
      Seq("""nocsrf""")
    )
  )

  // @LINE:53
  private[this] lazy val controllers_ServiceController_sales19_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("service/sales")))
  )
  private[this] lazy val controllers_ServiceController_sales19_invoker = createInvoker(
    ServiceController_0.sales(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ServiceController",
      "sales",
      Nil,
      "GET",
      this.prefix + """service/sales""",
      """ View sales""",
      Seq()
    )
  )

  // @LINE:56
  private[this] lazy val controllers_Assets_versioned20_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned20_invoker = createInvoker(
    Assets_2.versioned(fakeValue[String], fakeValue[Asset]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_HomeController_index0_route(params@_) =>
      call { 
        controllers_HomeController_index0_invoker.call(HomeController_1.index)
      }
  
    // @LINE:8
    case controllers_HomeController_newSale1_route(params@_) =>
      call { 
        controllers_HomeController_newSale1_invoker.call(HomeController_1.newSale())
      }
  
    // @LINE:10
    case controllers_HomeController_sale2_route(params@_) =>
      call(params.fromPath[Long]("id", None), params.fromPath[Long]("itemId", None)) { (id, itemId) =>
        controllers_HomeController_sale2_invoker.call(HomeController_1.sale(id, itemId))
      }
  
    // @LINE:12
    case controllers_HomeController_insertNickel3_route(params@_) =>
      call(params.fromPath[Long]("id", None), params.fromPath[Long]("itemId", None)) { (id, itemId) =>
        controllers_HomeController_insertNickel3_invoker.call(HomeController_1.insertNickel(id, itemId))
      }
  
    // @LINE:14
    case controllers_HomeController_insertDime4_route(params@_) =>
      call(params.fromPath[Long]("id", None), params.fromPath[Long]("itemId", None)) { (id, itemId) =>
        controllers_HomeController_insertDime4_invoker.call(HomeController_1.insertDime(id, itemId))
      }
  
    // @LINE:16
    case controllers_HomeController_insertQuarter5_route(params@_) =>
      call(params.fromPath[Long]("id", None), params.fromPath[Long]("itemId", None)) { (id, itemId) =>
        controllers_HomeController_insertQuarter5_invoker.call(HomeController_1.insertQuarter(id, itemId))
      }
  
    // @LINE:18
    case controllers_HomeController_insertDollar6_route(params@_) =>
      call(params.fromPath[Long]("id", None), params.fromPath[Long]("itemId", None)) { (id, itemId) =>
        controllers_HomeController_insertDollar6_invoker.call(HomeController_1.insertDollar(id, itemId))
      }
  
    // @LINE:20
    case controllers_HomeController_returnCoins7_route(params@_) =>
      call(params.fromPath[Long]("id", None), params.fromPath[Long]("itemId", None)) { (id, itemId) =>
        controllers_HomeController_returnCoins7_invoker.call(HomeController_1.returnCoins(id, itemId))
      }
  
    // @LINE:22
    case controllers_HomeController_deleteSale8_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_HomeController_deleteSale8_invoker.call(HomeController_1.deleteSale(id))
      }
  
    // @LINE:25
    case controllers_ServiceController_index9_route(params@_) =>
      call { 
        controllers_ServiceController_index9_invoker.call(ServiceController_0.index())
      }
  
    // @LINE:28
    case controllers_ServiceController_items10_route(params@_) =>
      call { 
        controllers_ServiceController_items10_invoker.call(ServiceController_0.items())
      }
  
    // @LINE:31
    case controllers_ServiceController_newItem11_route(params@_) =>
      call { 
        controllers_ServiceController_newItem11_invoker.call(ServiceController_0.newItem())
      }
  
    // @LINE:33
    case controllers_ServiceController_saveItem12_route(params@_) =>
      call { 
        controllers_ServiceController_saveItem12_invoker.call(ServiceController_0.saveItem())
      }
  
    // @LINE:36
    case controllers_ServiceController_editItem13_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_ServiceController_editItem13_invoker.call(ServiceController_0.editItem(id))
      }
  
    // @LINE:38
    case controllers_ServiceController_updateItem14_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_ServiceController_updateItem14_invoker.call(ServiceController_0.updateItem(id))
      }
  
    // @LINE:42
    case controllers_ServiceController_deleteItem15_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_ServiceController_deleteItem15_invoker.call(ServiceController_0.deleteItem(id))
      }
  
    // @LINE:45
    case controllers_ServiceController_change16_route(params@_) =>
      call { 
        controllers_ServiceController_change16_invoker.call(ServiceController_0.change())
      }
  
    // @LINE:48
    case controllers_ServiceController_editChange17_route(params@_) =>
      call { 
        controllers_ServiceController_editChange17_invoker.call(ServiceController_0.editChange())
      }
  
    // @LINE:50
    case controllers_ServiceController_updateChange18_route(params@_) =>
      call { 
        controllers_ServiceController_updateChange18_invoker.call(ServiceController_0.updateChange())
      }
  
    // @LINE:53
    case controllers_ServiceController_sales19_route(params@_) =>
      call { 
        controllers_ServiceController_sales19_invoker.call(ServiceController_0.sales())
      }
  
    // @LINE:56
    case controllers_Assets_versioned20_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned20_invoker.call(Assets_2.versioned(path, file))
      }
  }
}
