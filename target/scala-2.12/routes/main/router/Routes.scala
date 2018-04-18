// @GENERATOR:play-routes-compiler
// @SOURCE:/mnt/c/Users/Richard/Desktop/Java Web App/play-project/vendingmachine/conf/routes
// @DATE:Wed Apr 18 13:06:50 GMT 2018

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
  // @LINE:13
  ServiceController_0: controllers.ServiceController,
  // @LINE:40
  Assets_2: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    HomeController_1: controllers.HomeController,
    // @LINE:13
    ServiceController_0: controllers.ServiceController,
    // @LINE:40
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
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """service""", """controllers.ServiceController.index()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """service/items""", """controllers.ServiceController.items()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """service/change""", """controllers.ServiceController.change()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """service/items/new""", """controllers.ServiceController.newItem()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """service/items""", """controllers.ServiceController.saveItem()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """service/items/""" + "$" + """id<[^/]+>""", """controllers.ServiceController.editItem(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """service/items/""" + "$" + """id<[^/]+>""", """controllers.ServiceController.updateItem(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """service/change/edit""", """controllers.ServiceController.editChange()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """service/change""", """controllers.ServiceController.updateChange()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """service/items/""" + "$" + """id<[^/]+>/delete""", """controllers.ServiceController.deleteItem(id:Long)"""),
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

  // @LINE:13
  private[this] lazy val controllers_ServiceController_index3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("service")))
  )
  private[this] lazy val controllers_ServiceController_index3_invoker = createInvoker(
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

  // @LINE:16
  private[this] lazy val controllers_ServiceController_items4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("service/items")))
  )
  private[this] lazy val controllers_ServiceController_items4_invoker = createInvoker(
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

  // @LINE:17
  private[this] lazy val controllers_ServiceController_change5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("service/change")))
  )
  private[this] lazy val controllers_ServiceController_change5_invoker = createInvoker(
    ServiceController_0.change(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ServiceController",
      "change",
      Nil,
      "GET",
      this.prefix + """service/change""",
      """""",
      Seq()
    )
  )

  // @LINE:21
  private[this] lazy val controllers_ServiceController_newItem6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("service/items/new")))
  )
  private[this] lazy val controllers_ServiceController_newItem6_invoker = createInvoker(
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

  // @LINE:23
  private[this] lazy val controllers_ServiceController_saveItem7_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("service/items")))
  )
  private[this] lazy val controllers_ServiceController_saveItem7_invoker = createInvoker(
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

  // @LINE:26
  private[this] lazy val controllers_ServiceController_editItem8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("service/items/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ServiceController_editItem8_invoker = createInvoker(
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

  // @LINE:28
  private[this] lazy val controllers_ServiceController_updateItem9_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("service/items/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ServiceController_updateItem9_invoker = createInvoker(
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

  // @LINE:30
  private[this] lazy val controllers_ServiceController_editChange10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("service/change/edit")))
  )
  private[this] lazy val controllers_ServiceController_editChange10_invoker = createInvoker(
    ServiceController_0.editChange(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ServiceController",
      "editChange",
      Nil,
      "GET",
      this.prefix + """service/change/edit""",
      """""",
      Seq()
    )
  )

  // @LINE:32
  private[this] lazy val controllers_ServiceController_updateChange11_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("service/change")))
  )
  private[this] lazy val controllers_ServiceController_updateChange11_invoker = createInvoker(
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

  // @LINE:36
  private[this] lazy val controllers_ServiceController_deleteItem12_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("service/items/"), DynamicPart("id", """[^/]+""",true), StaticPart("/delete")))
  )
  private[this] lazy val controllers_ServiceController_deleteItem12_invoker = createInvoker(
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

  // @LINE:40
  private[this] lazy val controllers_Assets_versioned13_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned13_invoker = createInvoker(
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
  
    // @LINE:13
    case controllers_ServiceController_index3_route(params@_) =>
      call { 
        controllers_ServiceController_index3_invoker.call(ServiceController_0.index())
      }
  
    // @LINE:16
    case controllers_ServiceController_items4_route(params@_) =>
      call { 
        controllers_ServiceController_items4_invoker.call(ServiceController_0.items())
      }
  
    // @LINE:17
    case controllers_ServiceController_change5_route(params@_) =>
      call { 
        controllers_ServiceController_change5_invoker.call(ServiceController_0.change())
      }
  
    // @LINE:21
    case controllers_ServiceController_newItem6_route(params@_) =>
      call { 
        controllers_ServiceController_newItem6_invoker.call(ServiceController_0.newItem())
      }
  
    // @LINE:23
    case controllers_ServiceController_saveItem7_route(params@_) =>
      call { 
        controllers_ServiceController_saveItem7_invoker.call(ServiceController_0.saveItem())
      }
  
    // @LINE:26
    case controllers_ServiceController_editItem8_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_ServiceController_editItem8_invoker.call(ServiceController_0.editItem(id))
      }
  
    // @LINE:28
    case controllers_ServiceController_updateItem9_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_ServiceController_updateItem9_invoker.call(ServiceController_0.updateItem(id))
      }
  
    // @LINE:30
    case controllers_ServiceController_editChange10_route(params@_) =>
      call { 
        controllers_ServiceController_editChange10_invoker.call(ServiceController_0.editChange())
      }
  
    // @LINE:32
    case controllers_ServiceController_updateChange11_route(params@_) =>
      call { 
        controllers_ServiceController_updateChange11_invoker.call(ServiceController_0.updateChange())
      }
  
    // @LINE:36
    case controllers_ServiceController_deleteItem12_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_ServiceController_deleteItem12_invoker.call(ServiceController_0.deleteItem(id))
      }
  
    // @LINE:40
    case controllers_Assets_versioned13_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned13_invoker.call(Assets_2.versioned(path, file))
      }
  }
}
