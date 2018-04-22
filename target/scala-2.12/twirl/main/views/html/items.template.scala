
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
        """),_display_(/*16.10*/for(item <- items) yield /*16.28*/ {_display_(Seq[Any](format.raw/*16.30*/("""
            """),format.raw/*17.13*/("""<tr>
                <td>"""),_display_(/*18.22*/item/*18.26*/.getName),format.raw/*18.34*/("""</td>
                <td>$"""),_display_(/*19.23*/item/*19.27*/.getPrice),format.raw/*19.36*/("""</td>
                <td>"""),_display_(/*20.22*/item/*20.26*/.getQuantity),format.raw/*20.38*/("""</td>
                <td>
                    <a href="/service/items/"""),_display_(/*22.46*/item/*22.50*/.getId),format.raw/*22.56*/("""">
                        Edit
                    </a>
                </td>
                <td>
                    <form action="/service/items/"""),_display_(/*27.51*/item/*27.55*/.getId),format.raw/*27.61*/("""/delete" method="POST">
                        <input type="submit" value="Delete">
                    </form>
                </td>
            </tr>
        """)))}),format.raw/*32.10*/("""
        """),format.raw/*33.9*/("""</tbody>
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
                  DATE: Sun Apr 22 21:14:16 GMT 2018
                  SOURCE: /mnt/c/Users/Richard/Desktop/vendingmachine/vendingmachine/app/views/items.scala.html
                  HASH: 05bf79e4704820f3cfa469a55a6de0e1e8b70612
                  MATRIX: 969->1|1100->37|1130->42|1167->71|1206->73|1238->79|1574->388|1608->406|1648->408|1690->422|1744->449|1757->453|1786->461|1842->490|1855->494|1885->503|1940->531|1953->535|1986->547|2087->621|2100->625|2127->631|2309->786|2322->790|2349->796|2547->963|2584->973|2708->1067
                  LINES: 28->1|33->1|35->3|35->3|35->3|36->4|48->16|48->16|48->16|49->17|50->18|50->18|50->18|51->19|51->19|51->19|52->20|52->20|52->20|54->22|54->22|54->22|59->27|59->27|59->27|64->32|65->33|68->36
                  -- GENERATED --
              */
          