// @GENERATOR:play-routes-compiler
// @SOURCE:/mnt/c/Users/Richard/Desktop/Java Web App/play-project/vendingmachine/conf/routes
// @DATE:Wed Apr 18 13:06:50 GMT 2018

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers.javascript {

  // @LINE:13
  class ReverseServiceController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:17
    def change: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ServiceController.change",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "service/change"})
        }
      """
    )
  
    // @LINE:23
    def saveItem: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ServiceController.saveItem",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "service/items"})
        }
      """
    )
  
    // @LINE:28
    def updateItem: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ServiceController.updateItem",
      """
        function(id0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "service/items/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:30
    def editChange: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ServiceController.editChange",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "service/change/edit"})
        }
      """
    )
  
    // @LINE:26
    def editItem: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ServiceController.editItem",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "service/items/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:16
    def items: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ServiceController.items",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "service/items"})
        }
      """
    )
  
    // @LINE:36
    def deleteItem: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ServiceController.deleteItem",
      """
        function(id0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "service/items/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0)) + "/delete"})
        }
      """
    )
  
    // @LINE:32
    def updateChange: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ServiceController.updateChange",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "service/change"})
        }
      """
    )
  
    // @LINE:21
    def newItem: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ServiceController.newItem",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "service/items/new"})
        }
      """
    )
  
    // @LINE:13
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ServiceController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "service"})
        }
      """
    )
  
  }

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:10
    def sale: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.sale",
      """
        function(id0,itemId1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "sale/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0)) + "/item/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("itemId", itemId1))})
        }
      """
    )
  
    // @LINE:8
    def newSale: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.newSale",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + """"})
        }
      """
    )
  
    // @LINE:6
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
  }

  // @LINE:40
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:40
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[play.api.mvc.PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }


}
