
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

object items extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[java.util.List[VendingItem],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(items: java.util.List[VendingItem]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.38*/("""

"""),_display_(/*3.2*/main("Service Vending Machine")/*3.33*/ {_display_(Seq[Any](format.raw/*3.35*/("""
    """),format.raw/*4.5*/("""<p><a href="/service/items/new">Add Item</a></p>

    <table id='items_list' class="table">

        <thead>
        <tr class="table">
            <th>Name</th>
            <th>Price</th>
            <th>Quantity</th>
            <th colspan="2">Actions</th>
        </tr>
        </thead>
        <tbody>
        """),_display_(/*17.10*/for(item <- items) yield /*17.28*/ {_display_(Seq[Any](format.raw/*17.30*/("""
        """),format.raw/*18.9*/("""<tr>
            <td>"""),_display_(/*19.18*/item/*19.22*/.getName),format.raw/*19.30*/("""</td>
            <td>"""),_display_(/*20.18*/item/*20.22*/.getPrice),format.raw/*20.31*/("""</td>
            <td>"""),_display_(/*21.18*/item/*21.22*/.getQuantity),format.raw/*21.34*/("""</td>
            <td>
                <a href="/service/items/"""),_display_(/*23.42*/item/*23.46*/.getId),format.raw/*23.52*/("""">
                    edit
                </a>
            </td>
            <td>
                <form action="/service/items/"""),_display_(/*28.47*/item/*28.51*/.getId),format.raw/*28.57*/("""/delete" method="POST">
                    <input type="submit" value="Delete">
                </form>
            </td>
        </tr>
        """)))}),format.raw/*33.10*/("""
        """),format.raw/*34.9*/("""</tbody>
    </table>
""")))}))
      }
    }
  }

  def render(items:java.util.List[VendingItem]): play.twirl.api.HtmlFormat.Appendable = apply(items)

  def f:((java.util.List[VendingItem]) => play.twirl.api.HtmlFormat.Appendable) = (items) => apply(items)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed Apr 18 09:45:13 GMT 2018
                  SOURCE: /mnt/c/Users/Richard/Desktop/Java Web App/play-project/vendingmachine/app/views/items.scala.html
                  HASH: 59a4b3905106d421aa2d568091c596ecc449a364
                  MATRIX: 969->1|1100->37|1130->42|1169->73|1208->75|1240->81|1596->410|1630->428|1670->430|1707->440|1757->463|1770->467|1799->475|1850->499|1863->503|1893->512|1944->536|1957->540|1990->552|2083->618|2096->622|2123->628|2285->763|2298->767|2325->773|2507->924|2544->934
                  LINES: 28->1|33->1|35->3|35->3|35->3|36->4|49->17|49->17|49->17|50->18|51->19|51->19|51->19|52->20|52->20|52->20|53->21|53->21|53->21|55->23|55->23|55->23|60->28|60->28|60->28|65->33|66->34
                  -- GENERATED --
              */
          