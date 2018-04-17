// @GENERATOR:play-routes-compiler
// @SOURCE:/mnt/c/Users/Richard/Desktop/Java Web App/play-project/vendingmachine/conf/routes
// @DATE:Tue Apr 17 16:21:13 GMT 2018

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
  // @LINE:8
  ServiceController_0: controllers.ServiceController,
  // @LINE:11
  ItemController_3: controllers.ItemController,
  // @LINE:30
  Assets_2: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    HomeController_1: controllers.HomeController,
    // @LINE:8
    ServiceController_0: controllers.ServiceController,
    // @LINE:11
    ItemController_3: controllers.ItemController,
    // @LINE:30
    Assets_2: controllers.Assets
  ) = this(errorHandler, HomeController_1, ServiceController_0, ItemController_3, Assets_2, "/")

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_1, ServiceController_0, ItemController_3, Assets_2, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """service""", """controllers.ServiceController.index()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """service/items""", """controllers.ItemController.index()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """service/items/new""", """controllers.ItemController.newItem()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """service/items""", """controllers.ItemController.save()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """service/items/""" + "$" + """id<[^/]+>""", """controllers.ItemController.edit(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """service/items/""" + "$" + """id<[^/]+>""", """controllers.ItemController.update(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """service/items/""" + "$" + """id<[^/]+>/delete""", """controllers.ItemController.delete(id:Long)"""),
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
      """ An example controller showing a sample home page""",
      Seq()
    )
  )

  // @LINE:8
  private[this] lazy val controllers_ServiceController_index1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("service")))
  )
  private[this] lazy val controllers_ServiceController_index1_invoker = createInvoker(
    ServiceController_0.index(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ServiceController",
      "index",
      Nil,
      "GET",
      this.prefix + """service""",
      """""",
      Seq()
    )
  )

  // @LINE:11
  private[this] lazy val controllers_ItemController_index2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("service/items")))
  )
  private[this] lazy val controllers_ItemController_index2_invoker = createInvoker(
    ItemController_3.index(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ItemController",
      "index",
      Nil,
      "GET",
      this.prefix + """service/items""",
      """ Items list""",
      Seq()
    )
  )

  // @LINE:15
  private[this] lazy val controllers_ItemController_newItem3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("service/items/new")))
  )
  private[this] lazy val controllers_ItemController_newItem3_invoker = createInvoker(
    ItemController_3.newItem(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ItemController",
      "newItem",
      Nil,
      "GET",
      this.prefix + """service/items/new""",
      """ Add item""",
      Seq()
    )
  )

  // @LINE:17
  private[this] lazy val controllers_ItemController_save4_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("service/items")))
  )
  private[this] lazy val controllers_ItemController_save4_invoker = createInvoker(
    ItemController_3.save(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ItemController",
      "save",
      Nil,
      "POST",
      this.prefix + """service/items""",
      """""",
      Seq("""nocsrf""")
    )
  )

  // @LINE:20
  private[this] lazy val controllers_ItemController_edit5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("service/items/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ItemController_edit5_invoker = createInvoker(
    ItemController_3.edit(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ItemController",
      "edit",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """service/items/""" + "$" + """id<[^/]+>""",
      """ Edit item""",
      Seq()
    )
  )

  // @LINE:22
  private[this] lazy val controllers_ItemController_update6_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("service/items/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ItemController_update6_invoker = createInvoker(
    ItemController_3.update(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ItemController",
      "update",
      Seq(classOf[Long]),
      "POST",
      this.prefix + """service/items/""" + "$" + """id<[^/]+>""",
      """""",
      Seq("""nocsrf""")
    )
  )

  // @LINE:26
  private[this] lazy val controllers_ItemController_delete7_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("service/items/"), DynamicPart("id", """[^/]+""",true), StaticPart("/delete")))
  )
  private[this] lazy val controllers_ItemController_delete7_invoker = createInvoker(
    ItemController_3.delete(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ItemController",
      "delete",
      Seq(classOf[Long]),
      "POST",
      this.prefix + """service/items/""" + "$" + """id<[^/]+>/delete""",
      """ Delete item""",
      Seq("""nocsrf""")
    )
  )

  // @LINE:30
  private[this] lazy val controllers_Assets_versioned8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned8_invoker = createInvoker(
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
    case controllers_ServiceController_index1_route(params@_) =>
      call { 
        controllers_ServiceController_index1_invoker.call(ServiceController_0.index())
      }
  
    // @LINE:11
    case controllers_ItemController_index2_route(params@_) =>
      call { 
        controllers_ItemController_index2_invoker.call(ItemController_3.index())
      }
  
    // @LINE:15
    case controllers_ItemController_newItem3_route(params@_) =>
      call { 
        controllers_ItemController_newItem3_invoker.call(ItemController_3.newItem())
      }
  
    // @LINE:17
    case controllers_ItemController_save4_route(params@_) =>
      call { 
        controllers_ItemController_save4_invoker.call(ItemController_3.save())
      }
  
    // @LINE:20
    case controllers_ItemController_edit5_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_ItemController_edit5_invoker.call(ItemController_3.edit(id))
      }
  
    // @LINE:22
    case controllers_ItemController_update6_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_ItemController_update6_invoker.call(ItemController_3.update(id))
      }
  
    // @LINE:26
    case controllers_ItemController_delete7_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_ItemController_delete7_invoker.call(ItemController_3.delete(id))
      }
  
    // @LINE:30
    case controllers_Assets_versioned8_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned8_invoker.call(Assets_2.versioned(path, file))
      }
  }
}
