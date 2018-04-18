
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

"""),_display_(/*3.2*/main("Service Vending Machine")/*3.33*/ {_display_(Seq[Any](format.raw/*3.35*/("""
"""),format.raw/*4.1*/("""<h3>Coins Returned:</h3>
<dl>
    <div><dt>Dollars: """),_display_(/*6.24*/coinsReturned/*6.37*/.get("Dollars")),format.raw/*6.52*/(""" """),format.raw/*6.53*/("""</dt><dd id="dollars-display"></dd></div>
    <div><dt>Quarters: """),_display_(/*7.25*/coinsReturned/*7.38*/.get("Quarters")),format.raw/*7.54*/(""" """),format.raw/*7.55*/("""</dt><dd id="dollars-display"></dd></div>
    <div><dt>Dimes: """),_display_(/*8.22*/coinsReturned/*8.35*/.get("Dimes")),format.raw/*8.48*/(""" """),format.raw/*8.49*/("""</dt><dd id="dollars-display"></dd></div>
    <div><dt>Nickels: """),_display_(/*9.24*/coinsReturned/*9.37*/.get("Nickels")),format.raw/*9.52*/(""" """),format.raw/*9.53*/("""</dt><dd id="dollars-display"></dd></div>
</dl>


<dl>
    <div><dt>Item: """),_display_(/*14.21*/item/*14.25*/.getName()),format.raw/*14.35*/(""" """),format.raw/*14.36*/("""- """),_display_(/*14.39*/item/*14.43*/.getPrice()),format.raw/*14.54*/("""</dt><dd id="item-display"></dd></div>
    <div><dt>Money due: """),_display_(/*15.26*/sale/*15.30*/.amountDue()),format.raw/*15.42*/("""</dt><dd id="due-display"></dd></div>
    <div><dt>Paid: """),_display_(/*16.21*/sale/*16.25*/.getAmountPaid()),format.raw/*16.41*/("""</dt><dd id="paid-display"></dd></div>
</dl>

<p>Insert coin:</p>
<table>
    <tr>
        <td>
            """),_display_(/*23.14*/helper/*23.20*/.form(action = routes.HomeController.insertNickel(sale.getId, item.getId), 'id -> "select_coin_form")/*23.121*/ {_display_(Seq[Any](format.raw/*23.123*/("""
            """),format.raw/*24.13*/("""<input type="submit" name="nickels" value="Nickels" id="nickel">
            """)))}),format.raw/*25.14*/("""
        """),format.raw/*26.9*/("""</td>
        <td>
            """),_display_(/*28.14*/helper/*28.20*/.form(action = routes.HomeController.insertDime(sale.getId, item.getId), 'id -> "select_coin_form")/*28.119*/ {_display_(Seq[Any](format.raw/*28.121*/("""
            """),format.raw/*29.13*/("""<input type="submit" name="dimes" value="Dimes" id="dime">
            """)))}),format.raw/*30.14*/("""
        """),format.raw/*31.9*/("""</td>
        <td>
            """),_display_(/*33.14*/helper/*33.20*/.form(action = routes.HomeController.insertQuarter(sale.getId, item.getId), 'id -> "select_coin_form")/*33.122*/ {_display_(Seq[Any](format.raw/*33.124*/("""
            """),format.raw/*34.13*/("""<input type="submit" name="quarters" value="Quarters" id="quarter">
            """)))}),format.raw/*35.14*/("""
        """),format.raw/*36.9*/("""</td>
        <td>
            """),_display_(/*38.14*/helper/*38.20*/.form(action = routes.HomeController.insertDollar(sale.getId, item.getId), 'id -> "select_coin_form")/*38.121*/ {_display_(Seq[Any](format.raw/*38.123*/("""
            """),format.raw/*39.13*/("""<input type="submit" name="dollars" value="Dollars" id="dollar">
            """)))}),format.raw/*40.14*/("""
        """),format.raw/*41.9*/("""</td>

    </tr>
</table>

<form id="coin-select" action="index.html" method="post">
    <button type="button" name="button">Return money</button>
</form>
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
                  DATE: Wed Apr 18 20:10:39 GMT 2018
                  SOURCE: /mnt/c/Users/Richard/Desktop/Java Web App/play-project/vendingmachine/app/views/saleReturnCoins.scala.html
                  HASH: e85957203c80f266ac0dc4e894d24c24936d6bcf
                  MATRIX: 1003->1|1180->83|1210->88|1249->119|1288->121|1316->123|1397->178|1418->191|1453->206|1481->207|1574->274|1595->287|1631->303|1659->304|1749->368|1770->381|1803->394|1831->395|1923->461|1944->474|1979->489|2007->490|2114->570|2127->574|2158->584|2187->585|2217->588|2230->592|2262->603|2354->668|2367->672|2400->684|2486->743|2499->747|2536->763|2679->879|2694->885|2805->986|2846->988|2888->1002|2998->1081|3035->1091|3096->1125|3111->1131|3220->1230|3261->1232|3303->1246|3407->1319|3444->1329|3505->1363|3520->1369|3632->1471|3673->1473|3715->1487|3828->1569|3865->1579|3926->1613|3941->1619|4052->1720|4093->1722|4135->1736|4245->1815|4282->1825
                  LINES: 28->1|33->1|35->3|35->3|35->3|36->4|38->6|38->6|38->6|38->6|39->7|39->7|39->7|39->7|40->8|40->8|40->8|40->8|41->9|41->9|41->9|41->9|46->14|46->14|46->14|46->14|46->14|46->14|46->14|47->15|47->15|47->15|48->16|48->16|48->16|55->23|55->23|55->23|55->23|56->24|57->25|58->26|60->28|60->28|60->28|60->28|61->29|62->30|63->31|65->33|65->33|65->33|65->33|66->34|67->35|68->36|70->38|70->38|70->38|70->38|71->39|72->40|73->41
                  -- GENERATED --
              */
          