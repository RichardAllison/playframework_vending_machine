
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

    """),format.raw/*5.5*/("""<p>Available change:</p>
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
                  DATE: Thu Apr 19 11:48:12 GMT 2018
                  SOURCE: /mnt/c/Users/Richard/Desktop/Java Web App/play-project/vendingmachine/app/views/change.scala.html
                  HASH: 2917a986cbc132b7f65dcc3c4728319c8fd3c043
                  MATRIX: 957->1|1084->33|1114->38|1152->68|1191->70|1225->78|1294->121|1316->135|1349->148|1396->169|1418->183|1449->194|1499->218|1521->232|1555->246|1604->269|1626->283|1659->296|1708->318|1731->332|1767->347|1884->434
                  LINES: 28->1|33->1|35->3|35->3|35->3|37->5|38->6|38->6|38->6|39->7|39->7|39->7|40->8|40->8|40->8|41->9|41->9|41->9|42->10|42->10|42->10|46->14
                  -- GENERATED --
              */
          