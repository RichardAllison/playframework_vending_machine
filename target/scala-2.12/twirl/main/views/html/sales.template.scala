
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

    """),format.raw/*5.5*/("""<table id='items_list' class="table">

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
            """),_display_(/*18.14*/for(sale <- sales) yield /*18.32*/ {_display_(Seq[Any](format.raw/*18.34*/("""
                """),format.raw/*19.17*/("""<tr>
                    <td>"""),_display_(/*20.26*/sale/*20.30*/.getTime()),format.raw/*20.40*/("""</td>
                    <td>getItem()</td>
                    <td>getItem().getPrice()</td>
                    <td>$"""),_display_(/*23.27*/sale/*23.31*/.amountTotal()),format.raw/*23.45*/("""</td>
                    <td>"""),_display_(/*24.26*/sale/*24.30*/.isComplete()),format.raw/*24.43*/("""</td>
                    <td>
                        <form action="/sale/:id/item/delete" method="POST">
                            <input type="submit" value="Delete">
                        </form>
                    </td>
                </tr>
            """)))}),format.raw/*31.14*/("""
        """),format.raw/*32.9*/("""</tbody>
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
                  DATE: Sat Apr 21 22:20:10 GMT 2018
                  SOURCE: /mnt/c/Users/Richard/Desktop/vendingmachine/vendingmachine/app/views/sales.scala.html
                  HASH: 7f9394a0dd4bfe44c15b6e73db7f5b3f7135272b
                  MATRIX: 962->1|1086->30|1116->35|1153->64|1192->66|1226->74|1603->424|1637->442|1677->444|1723->462|1781->493|1794->497|1825->507|1976->631|1989->635|2024->649|2083->681|2096->685|2130->698|2433->970|2470->980|2525->1005
                  LINES: 28->1|33->1|35->3|35->3|35->3|37->5|50->18|50->18|50->18|51->19|52->20|52->20|52->20|55->23|55->23|55->23|56->24|56->24|56->24|63->31|64->32|66->34
                  -- GENERATED --
              */
          