
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

"""),format.raw/*5.1*/("""<table id='items_list' class="table">

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
        <td>$"""),_display_(/*19.15*/item/*19.19*/.getPrice),format.raw/*19.28*/("""</td>
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
                  DATE: Sat Apr 21 22:24:51 GMT 2018
                  SOURCE: /mnt/c/Users/Richard/Desktop/vendingmachine/vendingmachine/app/views/items.scala.html
                  HASH: f14b1388296e3c4674d49031b9c5a82e046a9791
                  MATRIX: 969->1|1100->37|1130->42|1167->71|1206->73|1236->77|1495->310|1529->328|1569->330|1602->336|1648->355|1661->359|1690->367|1738->388|1751->392|1781->401|1828->421|1841->425|1874->437|1959->495|1972->499|1999->505|2141->620|2154->624|2181->630|2342->761|2375->767|2491->853
                  LINES: 28->1|33->1|35->3|35->3|35->3|37->5|48->16|48->16|48->16|49->17|50->18|50->18|50->18|51->19|51->19|51->19|52->20|52->20|52->20|54->22|54->22|54->22|59->27|59->27|59->27|64->32|65->33|68->36
                  -- GENERATED --
              */
          