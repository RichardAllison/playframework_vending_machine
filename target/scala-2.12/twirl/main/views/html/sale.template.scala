
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
            """),format.raw/*17.13*/("""</td>
            <td>
                """),_display_(/*19.18*/helper/*19.24*/.form(action = routes.HomeController.insertDime(sale.getId, item.getId), 'id -> "select_coin_form")/*19.123*/ {_display_(Seq[Any](format.raw/*19.125*/("""
                    """),format.raw/*20.21*/("""<input type="submit" name="dimes" value="Dimes" id="dime">
                """)))}),format.raw/*21.18*/("""
            """),format.raw/*22.13*/("""</td>
            <td>
                """),_display_(/*24.18*/helper/*24.24*/.form(action = routes.HomeController.insertQuarter(sale.getId, item.getId), 'id -> "select_coin_form")/*24.126*/ {_display_(Seq[Any](format.raw/*24.128*/("""
                    """),format.raw/*25.21*/("""<input type="submit" name="quarters" value="Quarters" id="quarter">
                """)))}),format.raw/*26.18*/("""
            """),format.raw/*27.13*/("""</td>
            <td>
                """),_display_(/*29.18*/helper/*29.24*/.form(action = routes.HomeController.insertDollar(sale.getId, item.getId), 'id -> "select_coin_form")/*29.125*/ {_display_(Seq[Any](format.raw/*29.127*/("""
                    """),format.raw/*30.21*/("""<input type="submit" name="dollars" value="Dollars" id="dollar">
                """)))}),format.raw/*31.18*/("""
            """),format.raw/*32.13*/("""</td>

        </tr>
    </table>
    """),_display_(/*36.6*/helper/*36.12*/.form(action = routes.HomeController.returnCoins(sale.getId, item.getId), 'id -> "return_coin_form")/*36.112*/ {_display_(Seq[Any](format.raw/*36.114*/("""
        """),format.raw/*37.9*/("""<input type="submit" value="Return Coins">
    """)))}),format.raw/*38.6*/("""
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
                  DATE: Wed Apr 18 20:07:16 GMT 2018
                  SOURCE: /mnt/c/Users/Richard/Desktop/Java Web App/play-project/vendingmachine/app/views/sale.scala.html
                  HASH: 259ce952a8177251f76204581a2ceecd4dea4327
                  MATRIX: 957->1|1083->32|1113->37|1152->68|1191->70|1223->76|1279->106|1291->110|1321->120|1349->121|1378->124|1390->128|1421->139|1516->208|1528->212|1560->224|1649->287|1661->291|1697->307|1864->447|1879->453|1990->554|2031->556|2081->578|2195->661|2237->675|2306->717|2321->723|2430->822|2471->824|2521->846|2629->923|2671->937|2740->979|2755->985|2867->1087|2908->1089|2958->1111|3075->1197|3117->1211|3186->1253|3201->1259|3312->1360|3353->1362|3403->1384|3517->1467|3559->1481|3628->1524|3643->1530|3753->1630|3794->1632|3831->1642|3910->1691
                  LINES: 28->1|33->1|35->3|35->3|35->3|36->4|37->5|37->5|37->5|37->5|37->5|37->5|37->5|38->6|38->6|38->6|39->7|39->7|39->7|46->14|46->14|46->14|46->14|47->15|48->16|49->17|51->19|51->19|51->19|51->19|52->20|53->21|54->22|56->24|56->24|56->24|56->24|57->25|58->26|59->27|61->29|61->29|61->29|61->29|62->30|63->31|64->32|68->36|68->36|68->36|68->36|69->37|70->38
                  -- GENERATED --
              */
          