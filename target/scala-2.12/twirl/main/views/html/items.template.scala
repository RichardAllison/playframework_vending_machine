
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
        <tr>
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
                  DATE: Tue Apr 17 15:41:26 GMT 2018
                  SOURCE: /mnt/c/Users/Richard/Desktop/Java Web App/play-project/vendingmachine/app/views/items.scala.html
                  HASH: fadc65ea29da37242b393391e20f74f377062b10
                  MATRIX: 969->1|1100->37|1130->42|1169->73|1208->75|1240->81|1582->396|1616->414|1656->416|1693->426|1743->449|1756->453|1785->461|1836->485|1849->489|1879->498|1930->522|1943->526|1976->538|2069->604|2082->608|2109->614|2271->749|2284->753|2311->759|2493->910|2530->920
                  LINES: 28->1|33->1|35->3|35->3|35->3|36->4|49->17|49->17|49->17|50->18|51->19|51->19|51->19|52->20|52->20|52->20|53->21|53->21|53->21|55->23|55->23|55->23|60->28|60->28|60->28|65->33|66->34
                  -- GENERATED --
              */
          