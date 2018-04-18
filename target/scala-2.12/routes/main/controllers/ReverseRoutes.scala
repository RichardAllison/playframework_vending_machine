// @GENERATOR:play-routes-compiler
// @SOURCE:/mnt/c/Users/Richard/Desktop/Java Web App/play-project/vendingmachine/conf/routes
// @DATE:Wed Apr 18 19:07:29 GMT 2018

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers {

  // @LINE:21
  class ReverseServiceController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:25
    def change(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "service/change")
    }
  
    // @LINE:31
    def saveItem(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "service/items")
    }
  
    // @LINE:36
    def updateItem(id:Long): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "service/items/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:38
    def editChange(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "service/change/edit")
    }
  
    // @LINE:34
    def editItem(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "service/items/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:24
    def items(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "service/items")
    }
  
    // @LINE:44
    def deleteItem(id:Long): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "service/items/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)) + "/delete")
    }
  
    // @LINE:40
    def updateChange(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "service/change")
    }
  
    // @LINE:29
    def newItem(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "service/items/new")
    }
  
    // @LINE:21
    def index(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "service")
    }
  
  }

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:14
    def insertDime(id:Long, itemId:Long): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "sale/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)) + "/item/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("itemId", itemId)) + "/dime")
    }
  
    // @LINE:18
    def insertDollar(id:Long, itemId:Long): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "sale/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)) + "/item/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("itemId", itemId)) + "/dollar")
    }
  
    // @LINE:8
    def newSale(): Call = {
      
      Call("POST", _prefix)
    }
  
    // @LINE:10
    def sale(id:Long, itemId:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "sale/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)) + "/item/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("itemId", itemId)))
    }
  
    // @LINE:12
    def insertNickel(id:Long, itemId:Long): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "sale/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)) + "/item/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("itemId", itemId)) + "/nickel")
    }
  
    // @LINE:6
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
    // @LINE:16
    def insertQuarter(id:Long, itemId:Long): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "sale/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)) + "/item/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("itemId", itemId)) + "/quarter")
    }
  
  }

  // @LINE:48
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:48
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }


}
