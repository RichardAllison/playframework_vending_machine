
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

object saleReturnCoins extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[Sale,VendingItem,java.util.HashMap[String, Integer],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(sale: Sale, item: VendingItem, coinsReturned: java.util.HashMap[String, Integer]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.84*/("""

"""),_display_(/*3.2*/main("Return Coins")/*3.22*/ {_display_(Seq[Any](format.raw/*3.24*/("""
    """),format.raw/*4.5*/("""<h3>Coins Returned:</h3>
    <dl>
        <div><dt>Dollars: """),_display_(/*6.28*/coinsReturned/*6.41*/.get("Dollars")),format.raw/*6.56*/(""" """),format.raw/*6.57*/("""</dt><dd id="dollars-display"></dd></div>
        <div><dt>Quarters: """),_display_(/*7.29*/coinsReturned/*7.42*/.get("Quarters")),format.raw/*7.58*/(""" """),format.raw/*7.59*/("""</dt><dd id="dollars-display"></dd></div>
        <div><dt>Dimes: """),_display_(/*8.26*/coinsReturned/*8.39*/.get("Dimes")),format.raw/*8.52*/(""" """),format.raw/*8.53*/("""</dt><dd id="dollars-display"></dd></div>
        <div><dt>Nickels: """),_display_(/*9.28*/coinsReturned/*9.41*/.get("Nickels")),format.raw/*9.56*/(""" """),format.raw/*9.57*/("""</dt><dd id="dollars-display"></dd></div>
    </dl>

    <p><a class="button" href="/sale/"""),_display_(/*12.39*/sale/*12.43*/.getId),format.raw/*12.49*/("""/item/"""),_display_(/*12.56*/item/*12.60*/.getId),format.raw/*12.66*/("""">Return to Purchase</a></p>

""")))}))
      }
    }
  }

  def render(sale:Sale,item:VendingItem,coinsReturned:java.util.HashMap[String, Integer]): play.twirl.api.HtmlFormat.Appendable = apply(sale,item,coinsReturned)

  def f:((Sale,VendingItem,java.util.HashMap[String, Integer]) => play.twirl.api.HtmlFormat.Appendable) = (sale,item,coinsReturned) => apply(sale,item,coinsReturned)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Apr 22 15:25:33 GMT 2018
                  SOURCE: /mnt/c/Users/Richard/Desktop/vendingmachine/vendingmachine/app/views/saleReturnCoins.scala.html
                  HASH: 6e7568ac0579a21724912499b30690e14a1efa47
                  MATRIX: 1003->1|1180->83|1210->88|1238->108|1277->110|1309->116|1398->179|1419->192|1454->207|1482->208|1579->279|1600->292|1636->308|1664->309|1758->377|1779->390|1812->403|1840->404|1936->474|1957->487|1992->502|2020->503|2141->597|2154->601|2181->607|2215->614|2228->618|2255->624
                  LINES: 28->1|33->1|35->3|35->3|35->3|36->4|38->6|38->6|38->6|38->6|39->7|39->7|39->7|39->7|40->8|40->8|40->8|40->8|41->9|41->9|41->9|41->9|44->12|44->12|44->12|44->12|44->12|44->12
                  -- GENERATED --
              */
          