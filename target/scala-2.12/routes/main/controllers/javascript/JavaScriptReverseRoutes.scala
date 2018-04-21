// @GENERATOR:play-routes-compiler
// @SOURCE:/mnt/c/Users/Richard/Desktop/vendingmachine/vendingmachine/conf/routes
// @DATE:Sat Apr 21 22:22:52 GMT 2018

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers.javascript {

  // @LINE:25
  class ReverseServiceController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:45
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
  
    // @LINE:48
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
  
    // @LINE:28
    def items: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ServiceController.items",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "service/items"})
        }
      """
    )
  
    // @LINE:42
    def deleteItem: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ServiceController.deleteItem",
      """
        function(id0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "service/items/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0)) + "/delete"})
        }
      """
    )
  
    // @LINE:53
    def sales: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ServiceController.sales",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "service/sales"})
        }
      """
    )
  
    // @LINE:50
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
  
    // @LINE:25
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
  
    // @LINE:22
    def deleteSale: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.deleteSale",
      """
        function(id0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "sale/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0)) + "/item/delete"})
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

  // @LINE:56
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:56
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
