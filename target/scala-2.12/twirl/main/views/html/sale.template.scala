
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

"""),_display_(/*3.2*/main("Service Vending Machine")/*3.33*/ {_display_(Seq[Any](format.raw/*3.35*/("""
    """),format.raw/*4.5*/("""<dl>
        <div><dt>Item: """),_display_(/*5.25*/item/*5.29*/.getName()),format.raw/*5.39*/(""" """),format.raw/*5.40*/("""- """),_display_(/*5.43*/item/*5.47*/.getPrice()),format.raw/*5.58*/("""</dt><dd id="item-display"></dd></div>
        <div><dt>Money due: """),_display_(/*6.30*/sale/*6.34*/.amountDue()),format.raw/*6.46*/("""</dt><dd id="due-display"></dd></div>
        <div><dt>Paid: """),_display_(/*7.25*/sale/*7.29*/.getAmountPaid()),format.raw/*7.45*/("""</dt><dd id="paid-display"></dd></div>
    </dl>

    <p>Insert coin:</p>
    <table>
        <tr>
            <td>
                """),_display_(/*14.18*/helper/*14.24*/.form(action = routes.HomeController.insertNickel(sale.getId, item.getId), 'id -> "select_coin_form")/*14.125*/ {_display_(Seq[Any](format.raw/*14.127*/("""
                    """),format.raw/*15.21*/("""<input type="submit" name="nickels" value="Nickels" id="nickel">
                """)))}),format.raw/*16.18*/("""

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

    <form id="coin-select" action="index.html" method="post">
        <button type="button" name="button">Return money</button>
    </form>
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
                  DATE: Wed Apr 18 19:17:20 GMT 2018
                  SOURCE: /mnt/c/Users/Richard/Desktop/Java Web App/play-project/vendingmachine/app/views/sale.scala.html
                  HASH: b18b45f6b50926c8e01e48dabd44f38a54b169eb
                  MATRIX: 957->1|1083->32|1113->37|1152->68|1191->70|1223->76|1279->106|1291->110|1321->120|1349->121|1378->124|1390->128|1421->139|1516->208|1528->212|1560->224|1649->287|1661->291|1697->307|1864->447|1879->453|1990->554|2031->556|2081->578|2195->661|2239->677|2308->719|2323->725|2432->824|2473->826|2523->848|2631->925|2673->939|2742->981|2757->987|2869->1089|2910->1091|2960->1113|3077->1199|3119->1213|3188->1255|3203->1261|3314->1362|3355->1364|3405->1386|3519->1469|3561->1483
                  LINES: 28->1|33->1|35->3|35->3|35->3|36->4|37->5|37->5|37->5|37->5|37->5|37->5|37->5|38->6|38->6|38->6|39->7|39->7|39->7|46->14|46->14|46->14|46->14|47->15|48->16|50->18|52->20|52->20|52->20|52->20|53->21|54->22|55->23|57->25|57->25|57->25|57->25|58->26|59->27|60->28|62->30|62->30|62->30|62->30|63->31|64->32|65->33
                  -- GENERATED --
              */
          