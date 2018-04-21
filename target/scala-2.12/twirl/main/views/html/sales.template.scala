
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

object sales extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[java.util.List[Sale],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(sales: java.util.List[Sale]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.31*/("""

"""),_display_(/*3.2*/main("Vending Machine Sales")/*3.31*/ {_display_(Seq[Any](format.raw/*3.33*/("""

"""),format.raw/*5.1*/("""<table id='items_list' class="table">

    <thead>
    <tr class="table">
        <th>Time</th>
        <th>Item</th>
        <th>Price</th>
        <th>Paid</th>
        <th>Complete</th>
        <th>Delete</th>
    </tr>
    </thead>
    <tbody>
    """),_display_(/*18.6*/for(sale <- sales) yield /*18.24*/ {_display_(Seq[Any](format.raw/*18.26*/("""
    """),format.raw/*19.5*/("""<tr>
        <td>"""),_display_(/*20.14*/sale/*20.18*/.getTime()),format.raw/*20.28*/("""</td>
        <td>getItem()</td>
        <td>getItem().getPrice()</td>
        <td>$"""),_display_(/*23.15*/sale/*23.19*/.amountTotal()),format.raw/*23.33*/("""</td>
        <td>"""),_display_(/*24.14*/sale/*24.18*/.isComplete()),format.raw/*24.31*/("""</td>
        <td>
            <form action="/sale/:id/item/delete" method="POST">
                <input type="submit" value="Delete">
            </form>
        </td>
    </tr>
    """)))}),format.raw/*31.6*/("""
    """),format.raw/*32.5*/("""</tbody>
</table>
""")))}),format.raw/*34.2*/("""
"""))
      }
    }
  }

  def render(sales:java.util.List[Sale]): play.twirl.api.HtmlFormat.Appendable = apply(sales)

  def f:((java.util.List[Sale]) => play.twirl.api.HtmlFormat.Appendable) = (sales) => apply(sales)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Apr 19 22:17:24 GMT 2018
                  SOURCE: /mnt/c/Users/Richard/Desktop/Java Web App/play-project/vendingmachine/app/views/sales.scala.html
                  HASH: f8a0d4dc81b141ba410e60ad9b47d5595f9b96de
                  MATRIX: 962->1|1086->30|1116->35|1153->64|1192->66|1222->70|1514->336|1548->354|1588->356|1621->362|1667->381|1680->385|1711->395|1826->483|1839->487|1874->501|1921->521|1934->525|1968->538|2190->730|2223->736|2274->757
                  LINES: 28->1|33->1|35->3|35->3|35->3|37->5|50->18|50->18|50->18|51->19|52->20|52->20|52->20|55->23|55->23|55->23|56->24|56->24|56->24|63->31|64->32|66->34
                  -- GENERATED --
              */
          