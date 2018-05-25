
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

"""),_display_(/*3.2*/main("Vending Machine Items")/*3.31*/ {_display_(Seq[Any](format.raw/*3.33*/("""
    """),format.raw/*4.5*/("""<h2>Vending Machine Items</h2>

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
            """),format.raw/*18.13*/("""<tr>
                <td>"""),_display_(/*19.22*/item/*19.26*/.getName),format.raw/*19.34*/("""</td>
                <td>$"""),_display_(/*20.23*/item/*20.27*/.getPrice),format.raw/*20.36*/("""</td>
                <td>"""),_display_(/*21.22*/item/*21.26*/.getQuantity),format.raw/*21.38*/("""</td>
                <td>
                    <a href="/service/items/"""),_display_(/*23.46*/item/*23.50*/.getId),format.raw/*23.56*/("""">
                        Edit
                    </a>
                </td>
                <td>
                    <form action="/service/items/"""),_display_(/*28.51*/item/*28.55*/.getId),format.raw/*28.61*/("""/delete" method="POST">
                        <input type="submit" value="Delete">
                    </form>
                </td>
            </tr>
        """)))}),format.raw/*33.10*/("""
        """),format.raw/*34.9*/("""</tbody>
    </table>
    <p><a class="button" href="/service/items/new">Add Item</a></p>
""")))}),format.raw/*37.2*/("""
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
                  SOURCE: /Users/richard/Documents/Coding/Projects/vending_machine/vending_machine/app/views/items.scala.html
                  HASH: 5e46860a316f1852d937c4d49cc9d434a577c921
                  MATRIX: 969->1|1100->37|1130->42|1167->71|1206->73|1238->79|1576->390|1610->408|1650->410|1692->424|1746->451|1759->455|1788->463|1844->492|1857->496|1887->505|1942->533|1955->537|1988->549|2089->623|2102->627|2129->633|2311->788|2324->792|2351->798|2549->965|2586->975|2710->1069
                  LINES: 28->1|33->1|35->3|35->3|35->3|36->4|49->17|49->17|49->17|50->18|51->19|51->19|51->19|52->20|52->20|52->20|53->21|53->21|53->21|55->23|55->23|55->23|60->28|60->28|60->28|65->33|66->34|69->37
                  -- GENERATED --
              */
          