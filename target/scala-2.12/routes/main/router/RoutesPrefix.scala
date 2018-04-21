// @GENERATOR:play-routes-compiler
// @SOURCE:/mnt/c/Users/Richard/Desktop/vendingmachine/vendingmachine/conf/routes
// @DATE:Sat Apr 21 22:22:52 GMT 2018


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
