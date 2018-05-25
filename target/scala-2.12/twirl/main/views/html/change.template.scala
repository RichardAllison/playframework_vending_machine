
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object change extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[VendingMachine,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(vendingMachine: VendingMachine):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.34*/("""

"""),_display_(/*3.2*/main("Vending Machine Change")/*3.32*/ {_display_(Seq[Any](format.raw/*3.34*/("""

    """),format.raw/*5.5*/("""<h2>Available change:</h2>
    <p>Nickels: """),_display_(/*6.18*/vendingMachine/*6.32*/.getNickels()),format.raw/*6.45*/("""</p>
    <p>Dimes: """),_display_(/*7.16*/vendingMachine/*7.30*/.getDimes()),format.raw/*7.41*/("""</p>
    <p>Quarters: """),_display_(/*8.19*/vendingMachine/*8.33*/.getQuarters()),format.raw/*8.47*/("""</p>
    <p>Dollars: """),_display_(/*9.18*/vendingMachine/*9.32*/.getDollars()),format.raw/*9.45*/("""</p>
    <p>Total: $"""),_display_(/*10.17*/vendingMachine/*10.31*/.calculateTotal),format.raw/*10.46*/("""</p>

    <p><a class="button" href="/service/change/edit">Adjust change</a></p>

""")))}),format.raw/*14.2*/("""
"""))
      }
    }
  }

  def render(vendingMachine:VendingMachine): play.twirl.api.HtmlFormat.Appendable = apply(vendingMachine)

  def f:((VendingMachine) => play.twirl.api.HtmlFormat.Appendable) = (vendingMachine) => apply(vendingMachine)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri May 25 17:47:25 BST 2018
                  SOURCE: /Users/richard/Documents/Coding/Projects/vending_machine/vending_machine/app/views/change.scala.html
                  HASH: 7f7e4a9f1c1b7d841052103b39f0208234d148e7
                  MATRIX: 957->1|1084->33|1114->38|1152->68|1191->70|1225->78|1296->123|1318->137|1351->150|1398->171|1420->185|1451->196|1501->220|1523->234|1557->248|1606->271|1628->285|1661->298|1710->320|1733->334|1769->349|1886->436
                  LINES: 28->1|33->1|35->3|35->3|35->3|37->5|38->6|38->6|38->6|39->7|39->7|39->7|40->8|40->8|40->8|41->9|41->9|41->9|42->10|42->10|42->10|46->14
                  -- GENERATED --
              */
          