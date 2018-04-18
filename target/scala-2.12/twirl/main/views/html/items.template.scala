
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

    """),format.raw/*5.5*/("""<table id='items_list' class="table">

        <thead>
            <tr class="table">
                <th>Name</th>
                <th>Price</th>
                <th>Quantity</th>
                <th colspan="2">Actions</th>
            </tr>
        </thead>
        <tbody>
            """),_display_(/*16.14*/for(item <- items) yield /*16.32*/ {_display_(Seq[Any](format.raw/*16.34*/("""
            """),format.raw/*17.13*/("""<tr>
                <td>"""),_display_(/*18.22*/item/*18.26*/.getName),format.raw/*18.34*/("""</td>
                <td>"""),_display_(/*19.22*/item/*19.26*/.getPrice),format.raw/*19.35*/("""</td>
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
            """)))}),format.raw/*32.14*/("""
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
                  DATE: Wed Apr 18 13:39:31 GMT 2018
                  SOURCE: /mnt/c/Users/Richard/Desktop/Java Web App/play-project/vendingmachine/app/views/items.scala.html
                  HASH: 8afa76b70d23a6c9aedc6feda7a4ac9e3587b5ea
                  MATRIX: 969->1|1100->37|1130->42|1169->73|1208->75|1242->83|1570->384|1604->402|1644->404|1686->418|1740->445|1753->449|1782->457|1837->485|1850->489|1880->498|1935->526|1948->530|1981->542|2082->616|2095->620|2122->626|2304->781|2317->785|2344->791|2546->962|2583->972|2707->1066
                  LINES: 28->1|33->1|35->3|35->3|35->3|37->5|48->16|48->16|48->16|49->17|50->18|50->18|50->18|51->19|51->19|51->19|52->20|52->20|52->20|54->22|54->22|54->22|59->27|59->27|59->27|64->32|65->33|68->36
                  -- GENERATED --
              */
          