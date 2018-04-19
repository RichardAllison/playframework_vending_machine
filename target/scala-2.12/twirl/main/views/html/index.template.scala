
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


Seq[Any](format.raw/*1.38*/("""

"""),_display_(/*3.2*/main("Vending Machine")/*3.25*/ {_display_(Seq[Any](format.raw/*3.27*/("""
    """),format.raw/*4.5*/("""<h1>Vending Machine</h1>
    """),_display_(/*5.6*/if(items.isEmpty)/*5.23*/ {_display_(Seq[Any](format.raw/*5.25*/("""
        """),format.raw/*6.9*/("""<h3>Out of stock!</h3>
    """)))}/*7.7*/else/*7.12*/{_display_(Seq[Any](format.raw/*7.13*/("""
        """),format.raw/*8.9*/("""<p>Select item:</p>
        """),_display_(/*9.10*/helper/*9.16*/.form(action = routes.HomeController.newSale(), 'id -> "select_item_form")/*9.90*/ {_display_(Seq[Any](format.raw/*9.92*/("""
            """),format.raw/*10.13*/("""<table>
                <tbody>
                """),_display_(/*12.18*/for(item <- items) yield /*12.36*/ {_display_(Seq[Any](format.raw/*12.38*/("""
                    """),format.raw/*13.21*/("""<tr>
                        <td><input type="radio" name="itemId" value="""),_display_(/*14.70*/item/*14.74*/.getId),format.raw/*14.80*/(""" """),format.raw/*14.81*/("""id="item-"""),_display_(/*14.91*/item/*14.95*/.getId),format.raw/*14.101*/(""""></td>
                        <td><label for="item-"""),_display_(/*15.47*/item/*15.51*/.getId),format.raw/*15.57*/("""">"""),_display_(/*15.60*/item/*15.64*/.getName),format.raw/*15.72*/(""" """),format.raw/*15.73*/("""- $"""),_display_(/*15.77*/item/*15.81*/.getPrice),format.raw/*15.90*/("""</label></td>
                    </tr>
                """)))}),format.raw/*17.18*/("""
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
                  DATE: Thu Apr 19 10:40:51 GMT 2018
                  SOURCE: /mnt/c/Users/Richard/Desktop/Java Web App/play-project/vendingmachine/app/views/index.scala.html
                  HASH: cb957e3f2ed4eb1882d41c034ac9de4246a88f18
                  MATRIX: 969->1|1100->37|1130->42|1161->65|1200->67|1232->73|1288->104|1313->121|1352->123|1388->133|1434->163|1446->168|1484->169|1520->179|1576->209|1590->215|1672->289|1711->291|1753->305|1831->356|1865->374|1905->376|1955->398|2057->473|2070->477|2097->483|2126->484|2163->494|2176->498|2204->504|2286->559|2299->563|2326->569|2356->572|2369->576|2398->584|2427->585|2458->589|2471->593|2501->602|2591->661|2637->679|2889->900|2926->907|2959->910
                  LINES: 28->1|33->1|35->3|35->3|35->3|36->4|37->5|37->5|37->5|38->6|39->7|39->7|39->7|40->8|41->9|41->9|41->9|41->9|42->10|44->12|44->12|44->12|45->13|46->14|46->14|46->14|46->14|46->14|46->14|46->14|47->15|47->15|47->15|47->15|47->15|47->15|47->15|47->15|47->15|47->15|49->17|50->18|55->23|56->24|57->25
                  -- GENERATED --
              */
          