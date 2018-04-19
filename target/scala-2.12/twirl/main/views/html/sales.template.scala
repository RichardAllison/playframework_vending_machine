
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

object sales extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[java.util.List[VendingItem],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(items: java.util.List[VendingItem]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.38*/("""

"""),_display_(/*3.2*/main("Service Vending Machine")/*3.33*/ {_display_(Seq[Any](format.raw/*3.35*/("""

"""),format.raw/*5.1*/("""<table id='sales_list' class="table">

    <thead>
    <tr class="table">
        <th>Name</th>
        <th>Price</th>
        <th>Quantity</th>
        <th colspan="2">Actions</th>
    </tr>
    </thead>
    <tbody>
    """),_display_(/*16.6*/for(item <- items) yield /*16.24*/ {_display_(Seq[Any](format.raw/*16.26*/("""
    """),format.raw/*17.5*/("""<tr>
        <td>"""),_display_(/*18.14*/item/*18.18*/.getName),format.raw/*18.26*/("""</td>
        <td>"""),_display_(/*19.14*/item/*19.18*/.getPrice),format.raw/*19.27*/("""</td>
        <td>"""),_display_(/*20.14*/item/*20.18*/.getQuantity),format.raw/*20.30*/("""</td>
        <td>
            <a href="/service/items/"""),_display_(/*22.38*/item/*22.42*/.getId),format.raw/*22.48*/("""">
                Edit
            </a>
        </td>
        <td>
            <form action="/service/items/"""),_display_(/*27.43*/item/*27.47*/.getId),format.raw/*27.53*/("""/delete" method="POST">
                <input type="submit" value="Delete">
            </form>
        </td>
    </tr>
    """)))}),format.raw/*32.6*/("""
    """),format.raw/*33.5*/("""</tbody>
</table>
<p><a class="button" href="/service/items/new">Add Item</a></p>
""")))}),format.raw/*36.2*/("""
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
                  DATE: Thu Apr 19 09:28:43 GMT 2018
                  SOURCE: /mnt/c/Users/Richard/Desktop/Java Web App/play-project/vendingmachine/app/views/sales.scala.html
                  HASH: 485aafbd330fd542a4f8c294ff05e1a66f843225
                  MATRIX: 969->1|1100->37|1130->42|1169->73|1208->75|1238->79|1497->312|1531->330|1571->332|1604->338|1650->357|1663->361|1692->369|1739->389|1752->393|1782->402|1829->422|1842->426|1875->438|1960->496|1973->500|2000->506|2142->621|2155->625|2182->631|2343->762|2376->768|2492->854
                  LINES: 28->1|33->1|35->3|35->3|35->3|37->5|48->16|48->16|48->16|49->17|50->18|50->18|50->18|51->19|51->19|51->19|52->20|52->20|52->20|54->22|54->22|54->22|59->27|59->27|59->27|64->32|65->33|68->36
                  -- GENERATED --
              */
          