
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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[java.util.List[VendingItem],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(items: java.util.List[VendingItem]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),_display_(/*3.2*/main("Vending Machine")/*3.25*/ {_display_(Seq[Any](format.raw/*3.27*/("""
    """),format.raw/*4.5*/("""<h1>Vending Machine</h1>
    """),_display_(/*5.6*/if(items.isEmpty)/*5.23*/ {_display_(Seq[Any](format.raw/*5.25*/("""
        """),format.raw/*6.9*/("""<h3>Out of stock!</h3>
    """)))}/*7.7*/else/*7.12*/{_display_(Seq[Any](format.raw/*7.13*/("""
        """),format.raw/*8.9*/("""<p>Select item:</p>
        """),_display_(/*9.10*/helper/*9.16*/.form(action = routes.HomeController.newSale(), 'id -> "select_item_form")/*9.90*/ {_display_(Seq[Any](format.raw/*9.92*/("""
            """),format.raw/*10.13*/("""<table>
                <tbody>
                    """),_display_(/*12.22*/for(item <- items) yield /*12.40*/ {_display_(Seq[Any](format.raw/*12.42*/("""
                        """),format.raw/*13.25*/("""<tr>
                            <td><input type="radio" name="itemId" value="""),_display_(/*14.74*/item/*14.78*/.getId),format.raw/*14.84*/(""" """),format.raw/*14.85*/("""id="item-"""),_display_(/*14.95*/item/*14.99*/.getId),format.raw/*14.105*/(""""></td>
                            <td><label for="item-"""),_display_(/*15.51*/item/*15.55*/.getId),format.raw/*15.61*/("""">"""),_display_(/*15.64*/item/*15.68*/.getName),format.raw/*15.76*/(""" """),format.raw/*15.77*/("""- $"""),_display_(/*15.81*/item/*15.85*/.getPrice),format.raw/*15.94*/("""</label></td>
                        </tr>
                    """)))}),format.raw/*17.22*/("""
                """),format.raw/*18.17*/("""</tbody>
                <tfoot>
                    <td colspan="2"><input type="submit" name="select-item-submit" id="select-item-submit" value="Select"></td>
                </tfoot>
            </table>
        """)))}),format.raw/*23.10*/("""
    """)))}),format.raw/*24.6*/("""
""")))}),format.raw/*25.2*/("""
"""))
      }
    }
  }

  def render(items:java.util.List[VendingItem]): play.twirl.api.HtmlFormat.Appendable = apply(items)

  def f:((java.util.List[VendingItem]) => play.twirl.api.HtmlFormat.Appendable) = (items) => apply(items)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sat Apr 21 22:20:08 GMT 2018
                  SOURCE: /mnt/c/Users/Richard/Desktop/vendingmachine/vendingmachine/app/views/index.scala.html
                  HASH: 3f20be59ed7db22a3aef63eea51f95872ebf6dd3
                  MATRIX: 969->1|1099->38|1126->40|1157->63|1196->65|1227->70|1282->100|1307->117|1346->119|1381->128|1426->157|1438->162|1476->163|1511->172|1566->201|1580->207|1662->281|1701->283|1742->296|1822->349|1856->367|1896->369|1949->394|2054->472|2067->476|2094->482|2123->483|2160->493|2173->497|2201->503|2286->561|2299->565|2326->571|2356->574|2369->578|2398->586|2427->587|2458->591|2471->595|2501->604|2597->669|2642->686|2889->902|2925->908|2957->910
                  LINES: 28->1|33->2|34->3|34->3|34->3|35->4|36->5|36->5|36->5|37->6|38->7|38->7|38->7|39->8|40->9|40->9|40->9|40->9|41->10|43->12|43->12|43->12|44->13|45->14|45->14|45->14|45->14|45->14|45->14|45->14|46->15|46->15|46->15|46->15|46->15|46->15|46->15|46->15|46->15|46->15|48->17|49->18|54->23|55->24|56->25
                  -- GENERATED --
              */
          