
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

object change extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[VendingMachine,Double,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(vendingMachine: VendingMachine, total: Double):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.49*/("""

"""),_display_(/*3.2*/main("Vending Machine")/*3.25*/ {_display_(Seq[Any](format.raw/*3.27*/("""

    """),format.raw/*5.5*/("""<p>Available change:</p>
    <p>Nickels: """),_display_(/*6.18*/vendingMachine/*6.32*/.getNickels()),format.raw/*6.45*/("""</p>
    <p>Dimes: """),_display_(/*7.16*/vendingMachine/*7.30*/.getDimes()),format.raw/*7.41*/("""</p>
    <p>Quarters: """),_display_(/*8.19*/vendingMachine/*8.33*/.getQuarters()),format.raw/*8.47*/("""</p>
    <p>Dollars: """),_display_(/*9.18*/vendingMachine/*9.32*/.getDollars()),format.raw/*9.45*/("""</p>
    <p>Total: """),_display_(/*10.16*/total),format.raw/*10.21*/("""</p>

    <p><a href="/service/change/edit">Adjust change</a></p>

""")))}),format.raw/*14.2*/("""
"""))
      }
    }
  }

  def render(vendingMachine:VendingMachine,total:Double): play.twirl.api.HtmlFormat.Appendable = apply(vendingMachine,total)

  def f:((VendingMachine,Double) => play.twirl.api.HtmlFormat.Appendable) = (vendingMachine,total) => apply(vendingMachine,total)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed Apr 18 13:10:10 GMT 2018
                  SOURCE: /mnt/c/Users/Richard/Desktop/Java Web App/play-project/vendingmachine/app/views/change.scala.html
                  HASH: 78617c0d32761b729ec67a5a316c2d4618dba358
                  MATRIX: 964->1|1106->48|1136->53|1167->76|1206->78|1240->86|1309->129|1331->143|1364->156|1411->177|1433->191|1464->202|1514->226|1536->240|1570->254|1619->277|1641->291|1674->304|1722->325|1748->330|1850->402
                  LINES: 28->1|33->1|35->3|35->3|35->3|37->5|38->6|38->6|38->6|39->7|39->7|39->7|40->8|40->8|40->8|41->9|41->9|41->9|42->10|42->10|46->14
                  -- GENERATED --
              */
          