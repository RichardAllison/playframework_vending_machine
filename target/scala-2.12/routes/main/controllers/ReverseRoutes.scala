// @GENERATOR:play-routes-compiler
// @SOURCE:/mnt/c/Users/Richard/Desktop/Java Web App/play-project/vendingmachine/conf/routes
// @DATE:Tue Apr 17 16:21:13 GMT 2018

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers {

  // @LINE:11
  class ReverseItemController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:26
    def delete(id:Long): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "service/items/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)) + "/delete")
    }
  
    // @LINE:20
    def edit(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "service/items/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:22
    def update(id:Long): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "service/items/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:17
    def save(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "service/items")
    }
  
    // @LINE:15
    def newItem(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "service/items/new")
    }
  
    // @LINE:11
    def index(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "service/items")
    }
  
  }

  // @LINE:8
  class ReverseServiceController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:8
    def index(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "service")
    }
  
  }

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:6
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
  }

  // @LINE:30
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:30
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }


}
