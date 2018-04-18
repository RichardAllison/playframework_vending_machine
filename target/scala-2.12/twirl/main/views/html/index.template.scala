
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
    <p>Select item:</p>
    <table>
        <tbody>
        """),_display_(/*8.10*/helper/*8.16*/.form(action = routes.HomeController.newSale(), 'id -> "select_item_form")/*8.90*/ {_display_(Seq[Any](format.raw/*8.92*/("""
            """),_display_(/*9.14*/for(item <- items) yield /*9.32*/ {_display_(Seq[Any](format.raw/*9.34*/("""
                """),format.raw/*10.17*/("""<tr>
                    <td><input type="radio" name="itemId" value="""),_display_(/*11.66*/item/*11.70*/.getId),format.raw/*11.76*/(""" """),format.raw/*11.77*/("""id="item-"""),_display_(/*11.87*/item/*11.91*/.getId),format.raw/*11.97*/(""""></td>
                    <td><label for="item-"""),_display_(/*12.43*/item/*12.47*/.getId),format.raw/*12.53*/("""">"""),_display_(/*12.56*/item/*12.60*/.getName),format.raw/*12.68*/(""" """),format.raw/*12.69*/("""- $"""),_display_(/*12.73*/item/*12.77*/.getPrice),format.raw/*12.86*/("""</label></td>
                </tr>
            """)))}),format.raw/*14.14*/("""
            """),format.raw/*15.13*/("""</tbody>
            <tfoot>
                <tr>
                    <td colspan="2"><input type="submit" name="select-item-submit" id="select-item-submit" value="Select"></td>
                </tr>
            </tfoot>
        """)))}),format.raw/*21.10*/("""
    """),format.raw/*22.5*/("""</table>

""")))}),format.raw/*24.2*/("""
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
                  DATE: Wed Apr 18 13:24:11 GMT 2018
                  SOURCE: /mnt/c/Users/Richard/Desktop/Java Web App/play-project/vendingmachine/app/views/index.scala.html
                  HASH: 1ab1b9b0f48d6a006a4d51c1c5d6b2b493cee05c
                  MATRIX: 969->1|1100->37|1130->42|1161->65|1200->67|1232->73|1348->163|1362->169|1444->243|1483->245|1524->260|1557->278|1596->280|1642->298|1740->369|1753->373|1780->379|1809->380|1846->390|1859->394|1886->400|1964->451|1977->455|2004->461|2034->464|2047->468|2076->476|2105->477|2136->481|2149->485|2179->494|2261->545|2303->559|2570->795|2603->801|2646->814
                  LINES: 28->1|33->1|35->3|35->3|35->3|36->4|40->8|40->8|40->8|40->8|41->9|41->9|41->9|42->10|43->11|43->11|43->11|43->11|43->11|43->11|43->11|44->12|44->12|44->12|44->12|44->12|44->12|44->12|44->12|44->12|44->12|46->14|47->15|53->21|54->22|56->24
                  -- GENERATED --
              */
          