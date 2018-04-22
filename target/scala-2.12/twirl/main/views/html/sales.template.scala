
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
    """),format.raw/*4.5*/("""<h2>Sales</h2>

    <table id='items_list' class="table">

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
            """),_display_(/*19.14*/for(sale <- sales) yield /*19.32*/ {_display_(Seq[Any](format.raw/*19.34*/("""
                """),format.raw/*20.17*/("""<tr>
                    <td>"""),_display_(/*21.26*/sale/*21.30*/.getFormattedTime()),format.raw/*21.49*/("""</td>
                    <td>"""),_display_(/*22.26*/sale/*22.30*/.getItem().getName()),format.raw/*22.50*/("""</td>
                    <td>$"""),_display_(/*23.27*/sale/*23.31*/.getItem().getPrice()),format.raw/*23.52*/("""</td>
                    <td>$"""),_display_(/*24.27*/sale/*24.31*/.amountTotal()),format.raw/*24.45*/("""</td>
                    <td>"""),_display_(/*25.26*/sale/*25.30*/.getCompleteStatus()),format.raw/*25.50*/("""</td>
                    <td>
                        <form action="/sale/:id/item/delete" method="POST">
                            <input type="submit" value="Delete">
                        </form>
                    </td>
                </tr>
            """)))}),format.raw/*32.14*/("""
        """),format.raw/*33.9*/("""</tbody>
    </table>
""")))}),format.raw/*35.2*/("""
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
                  DATE: Sun Apr 22 21:14:16 GMT 2018
                  SOURCE: /mnt/c/Users/Richard/Desktop/vendingmachine/vendingmachine/app/views/sales.scala.html
                  HASH: 645e6ef1c83159d61ec18ac080b8855f949cdd3b
                  MATRIX: 962->1|1086->30|1116->35|1153->64|1192->66|1224->72|1623->444|1657->462|1697->464|1743->482|1801->513|1814->517|1854->536|1913->568|1926->572|1967->592|2027->625|2040->629|2082->650|2142->683|2155->687|2190->701|2249->733|2262->737|2303->757|2606->1029|2643->1039|2698->1064
                  LINES: 28->1|33->1|35->3|35->3|35->3|36->4|51->19|51->19|51->19|52->20|53->21|53->21|53->21|54->22|54->22|54->22|55->23|55->23|55->23|56->24|56->24|56->24|57->25|57->25|57->25|64->32|65->33|67->35
                  -- GENERATED --
              */
          