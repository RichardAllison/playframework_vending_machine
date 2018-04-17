
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
            <th>Actions</th>
        </tr>
        </thead>
        <tbody>
        """),_display_(/*16.10*/for(item <- items) yield /*16.28*/ {_display_(Seq[Any](format.raw/*16.30*/("""
        """),format.raw/*17.9*/("""<tr>
            <td>"""),_display_(/*18.18*/item/*18.22*/.getName),format.raw/*18.30*/("""</td>
            <td>"""),_display_(/*19.18*/item/*19.22*/.getPrice),format.raw/*19.31*/("""</td>
            <td><a href="/service/items/"""),_display_(/*20.42*/item/*20.46*/.getId),format.raw/*20.52*/("""">edit</a> | <a href="/service/items/"""),_display_(/*20.90*/item/*20.94*/.getId),format.raw/*20.100*/("""/delete">delete</a></td>
        </tr>
        """)))}),format.raw/*22.10*/("""
        """),format.raw/*23.9*/("""</tbody>
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
                  DATE: Tue Apr 17 14:07:54 GMT 2018
                  SOURCE: /mnt/c/Users/Richard/Desktop/Java Web App/play-project/vendingmachine/app/views/items.scala.html
                  HASH: 06e7af272e662c1e56559d408adc68f2a8ee143b
                  MATRIX: 969->1|1100->37|1130->42|1169->73|1208->75|1240->81|1539->353|1573->371|1613->373|1650->383|1700->406|1713->410|1742->418|1793->442|1806->446|1836->455|1911->503|1924->507|1951->513|2016->551|2029->555|2057->561|2138->611|2175->621
                  LINES: 28->1|33->1|35->3|35->3|35->3|36->4|48->16|48->16|48->16|49->17|50->18|50->18|50->18|51->19|51->19|51->19|52->20|52->20|52->20|52->20|52->20|52->20|54->22|55->23
                  -- GENERATED --
              */
          