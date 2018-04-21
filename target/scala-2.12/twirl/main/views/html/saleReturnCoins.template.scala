
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


    <dl>
        <div><dt>Item: """),_display_(/*14.25*/item/*14.29*/.getName()),format.raw/*14.39*/(""" """),format.raw/*14.40*/("""- """),_display_(/*14.43*/item/*14.47*/.getPrice()),format.raw/*14.58*/("""</dt><dd id="item-display"></dd></div>
        <div><dt>Money due: """),_display_(/*15.30*/sale/*15.34*/.amountDue()),format.raw/*15.46*/("""</dt><dd id="due-display"></dd></div>
        <div><dt>Paid: """),_display_(/*16.25*/sale/*16.29*/.amountTotal()),format.raw/*16.43*/("""</dt><dd id="paid-display"></dd></div>
    </dl>

    <p>Insert coin:</p>
    <table>
        <tr>
            <td>
                """),_display_(/*23.18*/helper/*23.24*/.form(action = routes.HomeController.insertNickel(sale.getId, item.getId), 'id -> "select_coin_form")/*23.125*/ {_display_(Seq[Any](format.raw/*23.127*/("""
                    """),format.raw/*24.21*/("""<input type="submit" name="nickels" value="Nickels" id="nickel">
                """)))}),format.raw/*25.18*/("""
            """),format.raw/*26.13*/("""</td>
            <td>
                """),_display_(/*28.18*/helper/*28.24*/.form(action = routes.HomeController.insertDime(sale.getId, item.getId), 'id -> "select_coin_form")/*28.123*/ {_display_(Seq[Any](format.raw/*28.125*/("""
                    """),format.raw/*29.21*/("""<input type="submit" name="dimes" value="Dimes" id="dime">
                """)))}),format.raw/*30.18*/("""
            """),format.raw/*31.13*/("""</td>
            <td>
                """),_display_(/*33.18*/helper/*33.24*/.form(action = routes.HomeController.insertQuarter(sale.getId, item.getId), 'id -> "select_coin_form")/*33.126*/ {_display_(Seq[Any](format.raw/*33.128*/("""
                    """),format.raw/*34.21*/("""<input type="submit" name="quarters" value="Quarters" id="quarter">
                """)))}),format.raw/*35.18*/("""
            """),format.raw/*36.13*/("""</td>
            <td>
            """),_display_(/*38.14*/helper/*38.20*/.form(action = routes.HomeController.insertDollar(sale.getId, item.getId), 'id -> "select_coin_form")/*38.121*/ {_display_(Seq[Any](format.raw/*38.123*/("""
                """),format.raw/*39.17*/("""<input type="submit" name="dollars" value="Dollars" id="dollar">
            """)))}),format.raw/*40.14*/("""
            """),format.raw/*41.13*/("""</td>

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
                  DATE: Sat Apr 21 22:20:10 GMT 2018
                  SOURCE: /mnt/c/Users/Richard/Desktop/vendingmachine/vendingmachine/app/views/saleReturnCoins.scala.html
                  HASH: 5e2d117c06dfaeca2cad10bf113e05cec8fb134a
                  MATRIX: 1003->1|1180->83|1210->88|1238->108|1277->110|1309->116|1398->179|1419->192|1454->207|1482->208|1579->279|1600->292|1636->308|1664->309|1758->377|1779->390|1812->403|1840->404|1936->474|1957->487|1992->502|2020->503|2139->595|2152->599|2183->609|2212->610|2242->613|2255->617|2287->628|2383->697|2396->701|2429->713|2519->776|2532->780|2567->794|2734->934|2749->940|2860->1041|2901->1043|2951->1065|3065->1148|3107->1162|3176->1204|3191->1210|3300->1309|3341->1311|3391->1333|3499->1410|3541->1424|3610->1466|3625->1472|3737->1574|3778->1576|3828->1598|3945->1684|3987->1698|4052->1736|4067->1742|4178->1843|4219->1845|4265->1863|4375->1942|4417->1956
                  LINES: 28->1|33->1|35->3|35->3|35->3|36->4|38->6|38->6|38->6|38->6|39->7|39->7|39->7|39->7|40->8|40->8|40->8|40->8|41->9|41->9|41->9|41->9|46->14|46->14|46->14|46->14|46->14|46->14|46->14|47->15|47->15|47->15|48->16|48->16|48->16|55->23|55->23|55->23|55->23|56->24|57->25|58->26|60->28|60->28|60->28|60->28|61->29|62->30|63->31|65->33|65->33|65->33|65->33|66->34|67->35|68->36|70->38|70->38|70->38|70->38|71->39|72->40|73->41
                  -- GENERATED --
              */
          