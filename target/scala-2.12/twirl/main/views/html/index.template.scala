
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
                    """),_display_(/*12.22*/for(item <- items) yield /*12.40*/ {_display_(Seq[Any](format.raw/*12.42*/("""
                        """),format.raw/*13.25*/("""<tr>
                            <td><input type="radio" name="itemId" value="""),_display_(/*14.74*/item/*14.78*/.getId),format.raw/*14.84*/(""" """),format.raw/*14.85*/("""id="item-"""),_display_(/*14.95*/item/*14.99*/.getId),format.raw/*14.105*/("""" class="item-select"></td>
                            <td><label for="item-"""),_display_(/*15.51*/item/*15.55*/.getId),format.raw/*15.61*/("""">"""),_display_(/*15.64*/item/*15.68*/.getName),format.raw/*15.76*/(""" """),format.raw/*15.77*/("""- $"""),_display_(/*15.81*/item/*15.85*/.getPrice),format.raw/*15.94*/("""</td></label>
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
                  DATE: Sun Apr 22 15:28:25 GMT 2018
                  SOURCE: /mnt/c/Users/Richard/Desktop/vendingmachine/vendingmachine/app/views/index.scala.html
                  HASH: ed2b0f110d36d4a56a9c1f995e8de2d11205435c
                  MATRIX: 969->1|1100->37|1130->42|1161->65|1200->67|1232->73|1288->104|1313->121|1352->123|1388->133|1434->163|1446->168|1484->169|1520->179|1576->209|1590->215|1672->289|1711->291|1753->305|1835->360|1869->378|1909->380|1963->406|2069->485|2082->489|2109->495|2138->496|2175->506|2188->510|2216->516|2322->595|2335->599|2362->605|2392->608|2405->612|2434->620|2463->621|2494->625|2507->629|2537->638|2635->705|2681->723|2933->944|2970->951|3003->954
                  LINES: 28->1|33->1|35->3|35->3|35->3|36->4|37->5|37->5|37->5|38->6|39->7|39->7|39->7|40->8|41->9|41->9|41->9|41->9|42->10|44->12|44->12|44->12|45->13|46->14|46->14|46->14|46->14|46->14|46->14|46->14|47->15|47->15|47->15|47->15|47->15|47->15|47->15|47->15|47->15|47->15|49->17|50->18|55->23|56->24|57->25
                  -- GENERATED --
              */
          