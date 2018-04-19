
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
    """),format.raw/*4.5*/("""<dl>
        <div><dt>Item: """),_display_(/*5.25*/item/*5.29*/.getName()),format.raw/*5.39*/(""" """),format.raw/*5.40*/("""- $"""),_display_(/*5.44*/item/*5.48*/.getPrice()),format.raw/*5.59*/("""</dt><dd id="item-display"></dd></div>
        <div><dt>Money due: $"""),_display_(/*6.31*/sale/*6.35*/.amountDue()),format.raw/*6.47*/("""</dt><dd id="due-display"></dd></div>
        <div><dt>Paid: $"""),_display_(/*7.26*/sale/*7.30*/.amountTotal()),format.raw/*7.44*/("""</dt><dd id="paid-display"></dd></div>
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
                  DATE: Thu Apr 19 11:51:59 GMT 2018
                  SOURCE: /mnt/c/Users/Richard/Desktop/Java Web App/play-project/vendingmachine/app/views/sale.scala.html
                  HASH: 7cb10d62bc414ce94eb007d6c137516fa8f24b42
                  MATRIX: 957->1|1083->32|1113->37|1141->57|1180->59|1212->65|1268->95|1280->99|1310->109|1338->110|1368->114|1380->118|1411->129|1507->199|1519->203|1551->215|1641->279|1653->283|1687->297|1854->437|1869->443|1980->544|2021->546|2071->568|2185->651|2227->665|2296->707|2311->713|2420->812|2461->814|2511->836|2619->913|2661->927|2730->969|2745->975|2857->1077|2898->1079|2948->1101|3065->1187|3107->1201|3176->1243|3191->1249|3302->1350|3343->1352|3393->1374|3507->1457|3549->1471|3618->1514|3633->1520|3743->1620|3784->1622|3821->1632|3900->1681
                  LINES: 28->1|33->1|35->3|35->3|35->3|36->4|37->5|37->5|37->5|37->5|37->5|37->5|37->5|38->6|38->6|38->6|39->7|39->7|39->7|46->14|46->14|46->14|46->14|47->15|48->16|49->17|51->19|51->19|51->19|51->19|52->20|53->21|54->22|56->24|56->24|56->24|56->24|57->25|58->26|59->27|61->29|61->29|61->29|61->29|62->30|63->31|64->32|68->36|68->36|68->36|68->36|69->37|70->38
                  -- GENERATED --
              */
          