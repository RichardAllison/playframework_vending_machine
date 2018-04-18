// @GENERATOR:play-routes-compiler
// @SOURCE:/mnt/c/Users/Richard/Desktop/Java Web App/play-project/vendingmachine/conf/routes
// @DATE:Wed Apr 18 20:02:20 GMT 2018

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers.javascript {

  // @LINE:23
  class ReverseServiceController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:27
    def change: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ServiceController.change",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "service/change"})
        }
      """
    )
  
    // @LINE:33
    def saveItem: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ServiceController.saveItem",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "service/items"})
        }
      """
    )
  
    // @LINE:38
    def updateItem: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ServiceController.updateItem",
      """
        function(id0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "service/items/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:40
    def editChange: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ServiceController.editChange",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "service/change/edit"})
        }
      """
    )
  
    // @LINE:36
    def editItem: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ServiceController.editItem",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "service/items/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:26
    def items: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ServiceController.items",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "service/items"})
        }
      """
    )
  
    // @LINE:46
    def deleteItem: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ServiceController.deleteItem",
      """
        function(id0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "service/items/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0)) + "/delete"})
        }
      """
    )
  
    // @LINE:42
    def updateChange: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ServiceController.updateChange",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "service/change"})
        }
      """
    )
  
    // @LINE:31
    def newItem: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ServiceController.newItem",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "service/items/new"})
        }
      """
    )
  
    // @LINE:23
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

  
    // @LINE:14
    def insertDime: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.insertDime",
      """
        function(id0,itemId1) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "sale/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0)) + "/item/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("itemId", itemId1)) + "/dime"})
        }
      """
    )
  
    // @LINE:20
    def returnCoins: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.returnCoins",
      """
        function(id0,itemId1) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "sale/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0)) + "/item/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("itemId", itemId1)) + "/return"})
        }
      """
    )
  
    // @LINE:18
    def insertDollar: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.insertDollar",
      """
        function(id0,itemId1) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "sale/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0)) + "/item/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("itemId", itemId1)) + "/dollar"})
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
  
    // @LINE:10
    def sale: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.sale",
      """
        function(id0,itemId1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "sale/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0)) + "/item/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("itemId", itemId1))})
        }
      """
    )
  
    // @LINE:12
    def insertNickel: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.insertNickel",
      """
        function(id0,itemId1) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "sale/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0)) + "/item/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("itemId", itemId1)) + "/nickel"})
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
  
    // @LINE:16
    def insertQuarter: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.insertQuarter",
      """
        function(id0,itemId1) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "sale/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0)) + "/item/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("itemId", itemId1)) + "/quarter"})
        }
      """
    )
  
  }

  // @LINE:50
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:50
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
