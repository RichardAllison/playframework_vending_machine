
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
    <div><dt>Paid: """),_display_(/*16.21*/sale/*16.25*/.amountTotal()),format.raw/*16.39*/("""</dt><dd id="paid-display"></dd></div>
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
                  DATE: Thu Apr 19 11:48:12 GMT 2018
                  SOURCE: /mnt/c/Users/Richard/Desktop/Java Web App/play-project/vendingmachine/app/views/saleReturnCoins.scala.html
                  HASH: 04998f171907bf5ccf7e4250a44e7ef76ba77c72
                  MATRIX: 1003->1|1180->83|1210->88|1238->108|1277->110|1305->112|1386->167|1407->180|1442->195|1470->196|1563->263|1584->276|1620->292|1648->293|1738->357|1759->370|1792->383|1820->384|1912->450|1933->463|1968->478|1996->479|2103->559|2116->563|2147->573|2176->574|2206->577|2219->581|2251->592|2343->657|2356->661|2389->673|2475->732|2488->736|2523->750|2666->866|2681->872|2792->973|2833->975|2875->989|2985->1068|3022->1078|3083->1112|3098->1118|3207->1217|3248->1219|3290->1233|3394->1306|3431->1316|3492->1350|3507->1356|3619->1458|3660->1460|3702->1474|3815->1556|3852->1566|3913->1600|3928->1606|4039->1707|4080->1709|4122->1723|4232->1802|4269->1812
                  LINES: 28->1|33->1|35->3|35->3|35->3|36->4|38->6|38->6|38->6|38->6|39->7|39->7|39->7|39->7|40->8|40->8|40->8|40->8|41->9|41->9|41->9|41->9|46->14|46->14|46->14|46->14|46->14|46->14|46->14|47->15|47->15|47->15|48->16|48->16|48->16|55->23|55->23|55->23|55->23|56->24|57->25|58->26|60->28|60->28|60->28|60->28|61->29|62->30|63->31|65->33|65->33|65->33|65->33|66->34|67->35|68->36|70->38|70->38|70->38|70->38|71->39|72->40|73->41
                  -- GENERATED --
              */
          