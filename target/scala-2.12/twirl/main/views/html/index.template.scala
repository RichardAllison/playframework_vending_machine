
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

    """),_display_(/*5.6*/if(items.isEmpty)/*5.23*/ {_display_(Seq[Any](format.raw/*5.25*/("""
        """),format.raw/*6.9*/("""<p id="description">Sorry, the machine is out of stock!</p>
    """)))}/*7.7*/else/*7.12*/{_display_(Seq[Any](format.raw/*7.13*/("""
        """),format.raw/*8.9*/("""<p id="description">Select item:</p>
        """),_display_(/*9.10*/helper/*9.16*/.form(action = routes.HomeController.newSale(), 'id -> "select-item-form")/*9.90*/ {_display_(Seq[Any](format.raw/*9.92*/("""
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
                  DATE: Fri May 25 17:47:25 BST 2018
                  SOURCE: /Users/richard/Documents/Coding/Projects/vending_machine/vending_machine/app/views/index.scala.html
                  HASH: d24aaeadbccd777be23a8097e52f543c18d7102e
                  MATRIX: 969->1|1100->37|1130->42|1161->65|1200->67|1234->76|1259->93|1298->95|1334->105|1417->172|1429->177|1467->178|1503->188|1576->235|1590->241|1672->315|1711->317|1753->331|1835->386|1869->404|1909->406|1963->432|2069->511|2082->515|2109->521|2138->522|2175->532|2188->536|2216->542|2322->621|2335->625|2362->631|2392->634|2405->638|2434->646|2463->647|2494->651|2507->655|2537->664|2635->731|2681->749|2933->970|2970->977|3003->980
                  LINES: 28->1|33->1|35->3|35->3|35->3|37->5|37->5|37->5|38->6|39->7|39->7|39->7|40->8|41->9|41->9|41->9|41->9|42->10|44->12|44->12|44->12|45->13|46->14|46->14|46->14|46->14|46->14|46->14|46->14|47->15|47->15|47->15|47->15|47->15|47->15|47->15|47->15|47->15|47->15|49->17|50->18|55->23|56->24|57->25
                  -- GENERATED --
              */
          