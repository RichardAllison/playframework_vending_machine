// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/richard/Documents/Coding/Projects/vending_machine/vending_machine/conf/routes
// @DATE:Fri May 25 17:47:24 BST 2018


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
