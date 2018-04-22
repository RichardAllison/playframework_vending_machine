
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

object sale extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Sale,VendingItem,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(sale: Sale, item: VendingItem):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.33*/("""

"""),_display_(/*3.2*/main("Ongoing Sale")/*3.22*/ {_display_(Seq[Any](format.raw/*3.24*/("""
    """),format.raw/*4.5*/("""<h2>Purchase Item</h2>
    <dl>
        <div><dt>Item: """),_display_(/*6.25*/item/*6.29*/.getName()),format.raw/*6.39*/(""" """),format.raw/*6.40*/("""- $"""),_display_(/*6.44*/item/*6.48*/.getPrice()),format.raw/*6.59*/("""</dt><dd id="item-display"></dd></div>
        <div><dt>Money due: $"""),_display_(/*7.31*/sale/*7.35*/.amountDue()),format.raw/*7.47*/("""</dt><dd id="due-display"></dd></div>
        <div><dt>Paid: $"""),_display_(/*8.26*/sale/*8.30*/.amountTotal()),format.raw/*8.44*/("""</dt><dd id="paid-display"></dd></div>
    </dl>

    <p>Insert coin:</p>
    <table>
        <tr>
            <td>
                """),_display_(/*15.18*/helper/*15.24*/.form(action = routes.HomeController.insertNickel(sale.getId, item.getId), 'id -> "select_coin_form")/*15.125*/ {_display_(Seq[Any](format.raw/*15.127*/("""
                    """),format.raw/*16.21*/("""<input type="submit" name="nickels" value="Nickels" id="nickel">
                """)))}),format.raw/*17.18*/("""
            """),format.raw/*18.13*/("""</td>
            <td>
                """),_display_(/*20.18*/helper/*20.24*/.form(action = routes.HomeController.insertDime(sale.getId, item.getId), 'id -> "select_coin_form")/*20.123*/ {_display_(Seq[Any](format.raw/*20.125*/("""
                    """),format.raw/*21.21*/("""<input type="submit" name="dimes" value="Dimes" id="dime">
                """)))}),format.raw/*22.18*/("""
            """),format.raw/*23.13*/("""</td>
            <td>
                """),_display_(/*25.18*/helper/*25.24*/.form(action = routes.HomeController.insertQuarter(sale.getId, item.getId), 'id -> "select_coin_form")/*25.126*/ {_display_(Seq[Any](format.raw/*25.128*/("""
                    """),format.raw/*26.21*/("""<input type="submit" name="quarters" value="Quarters" id="quarter">
                """)))}),format.raw/*27.18*/("""
            """),format.raw/*28.13*/("""</td>
            <td>
                """),_display_(/*30.18*/helper/*30.24*/.form(action = routes.HomeController.insertDollar(sale.getId, item.getId), 'id -> "select_coin_form")/*30.125*/ {_display_(Seq[Any](format.raw/*30.127*/("""
                    """),format.raw/*31.21*/("""<input type="submit" name="dollars" value="Dollars" id="dollar">
                """)))}),format.raw/*32.18*/("""
            """),format.raw/*33.13*/("""</td>
        </tr>
    </table>
    """),_display_(/*36.6*/helper/*36.12*/.form(action = routes.HomeController.returnCoins(sale.getId, item.getId), 'id -> "return_coin_form")/*36.112*/ {_display_(Seq[Any](format.raw/*36.114*/("""
        """),format.raw/*37.9*/("""<input type="submit" value="Return Coins">
    """)))}),format.raw/*38.6*/("""
    """),_display_(/*39.6*/helper/*39.12*/.form(action = routes.HomeController.deleteSale(sale.getId), 'id -> "return_coin_form")/*39.99*/ {_display_(Seq[Any](format.raw/*39.101*/("""
        """),format.raw/*40.9*/("""<input type="submit" value="Cancel">
    """)))}),format.raw/*41.6*/("""
""")))}))
      }
    }
  }

  def render(sale:Sale,item:VendingItem): play.twirl.api.HtmlFormat.Appendable = apply(sale,item)

  def f:((Sale,VendingItem) => play.twirl.api.HtmlFormat.Appendable) = (sale,item) => apply(sale,item)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Apr 22 21:14:16 GMT 2018
                  SOURCE: /mnt/c/Users/Richard/Desktop/vendingmachine/vendingmachine/app/views/sale.scala.html
                  HASH: 6efecc8ce698ceb2a6c7940c00884af7015c3aca
                  MATRIX: 957->1|1083->32|1113->37|1141->57|1180->59|1212->65|1296->123|1308->127|1338->137|1366->138|1396->142|1408->146|1439->157|1535->227|1547->231|1579->243|1669->307|1681->311|1715->325|1882->465|1897->471|2008->572|2049->574|2099->596|2213->679|2255->693|2324->735|2339->741|2448->840|2489->842|2539->864|2647->941|2689->955|2758->997|2773->1003|2885->1105|2926->1107|2976->1129|3093->1215|3135->1229|3204->1271|3219->1277|3330->1378|3371->1380|3421->1402|3535->1485|3577->1499|3644->1540|3659->1546|3769->1646|3810->1648|3847->1658|3926->1707|3959->1714|3974->1720|4070->1807|4111->1809|4148->1819|4221->1862
                  LINES: 28->1|33->1|35->3|35->3|35->3|36->4|38->6|38->6|38->6|38->6|38->6|38->6|38->6|39->7|39->7|39->7|40->8|40->8|40->8|47->15|47->15|47->15|47->15|48->16|49->17|50->18|52->20|52->20|52->20|52->20|53->21|54->22|55->23|57->25|57->25|57->25|57->25|58->26|59->27|60->28|62->30|62->30|62->30|62->30|63->31|64->32|65->33|68->36|68->36|68->36|68->36|69->37|70->38|71->39|71->39|71->39|71->39|72->40|73->41
                  -- GENERATED --
              */
          