
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
        <tr>
            <th>Name</th>
            <th>Price</th>
        </tr>
        </thead>
        <tbody>
        """),_display_(/*14.10*/for(item <- items) yield /*14.28*/ {_display_(Seq[Any](format.raw/*14.30*/("""
        """),format.raw/*15.9*/("""<tr>
            <td>"""),_display_(/*16.18*/item/*16.22*/.name),format.raw/*16.27*/("""</td>
            <td>"""),_display_(/*17.18*/item/*17.22*/.price),format.raw/*17.28*/("""</td>
        </tr>
        """)))}),format.raw/*19.10*/("""
        """),format.raw/*20.9*/("""</tbody>
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
                  DATE: Tue Apr 17 11:22:55 GMT 2018
                  SOURCE: /mnt/c/Users/Richard/Desktop/Java Web App/play-project/vendingmachine/app/views/items.scala.html
                  HASH: a857c77aa4091e94f91aa0317094cf2ce943e9d8
                  MATRIX: 969->1|1100->37|1130->42|1169->73|1208->75|1242->83|1455->269|1489->287|1529->289|1566->299|1616->322|1629->326|1655->331|1706->355|1719->359|1746->365|1808->396|1845->406
                  LINES: 28->1|33->1|35->3|35->3|35->3|37->5|46->14|46->14|46->14|47->15|48->16|48->16|48->16|49->17|49->17|49->17|51->19|52->20
                  -- GENERATED --
              */
          