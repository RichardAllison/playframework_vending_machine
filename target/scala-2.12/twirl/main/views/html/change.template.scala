
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

"""),format.raw/*5.1*/("""<p>Available change:</p>
<p>Nickels: """),_display_(/*6.14*/vendingMachine/*6.28*/.getNickels()),format.raw/*6.41*/("""</p>
<p>Dimes: """),_display_(/*7.12*/vendingMachine/*7.26*/.getDimes()),format.raw/*7.37*/("""</p>
<p>Quarters: """),_display_(/*8.15*/vendingMachine/*8.29*/.getQuarters()),format.raw/*8.43*/("""</p>
<p>Dollars: """),_display_(/*9.14*/vendingMachine/*9.28*/.getDollars()),format.raw/*9.41*/("""</p>
<p>Total: $"""),_display_(/*10.13*/vendingMachine/*10.27*/.calculateTotal),format.raw/*10.42*/("""</p>

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
                  DATE: Sat Apr 21 22:20:07 GMT 2018
                  SOURCE: /mnt/c/Users/Richard/Desktop/vendingmachine/vendingmachine/app/views/change.scala.html
                  HASH: 9e586f20a03b6046433563827266649ad7ed8d7c
                  MATRIX: 957->1|1084->33|1114->38|1152->68|1191->70|1221->74|1286->113|1308->127|1341->140|1384->157|1406->171|1437->182|1483->202|1505->216|1539->230|1584->249|1606->263|1639->276|1684->294|1707->308|1743->323|1856->406
                  LINES: 28->1|33->1|35->3|35->3|35->3|37->5|38->6|38->6|38->6|39->7|39->7|39->7|40->8|40->8|40->8|41->9|41->9|41->9|42->10|42->10|42->10|46->14
                  -- GENERATED --
              */
          