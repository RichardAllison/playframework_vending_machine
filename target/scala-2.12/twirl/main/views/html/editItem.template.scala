
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

object editItem extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[Long,VendingItem,Form[VendingItem],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(id: Long, item: VendingItem, form: Form[VendingItem]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import play.data.Form


Seq[Any](format.raw/*1.56*/("""

"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/main("Edit Vending Item")/*5.27*/ {_display_(Seq[Any](format.raw/*5.29*/("""
    """),format.raw/*6.5*/("""<h2>Edit Vending Item</h2>
    <br>
    """),_display_(/*8.6*/helper/*8.12*/.form(action = routes.ServiceController.updateItem(id), 'id -> "item_form")/*8.87*/ {_display_(Seq[Any](format.raw/*8.89*/("""
    """),format.raw/*9.5*/("""<table>
        <tr>
            <td>
                <label for="item-name">Name:</label>
            </td>
            <td>
                <input type="text" id="item-name" name="name" value=""""),_display_(/*15.71*/item/*15.75*/.getName()),format.raw/*15.85*/("""">
            </td>
        </tr>
        <tr>
            <td>
                <label for="item-price">Price:</label>
            </td>
            <td>
                <input type="number" id="item-price" name="price"  step="0.05" min="0.05" value=""""),_display_(/*23.99*/item/*23.103*/.getPrice()),format.raw/*23.114*/("""">
            </td>
        </tr>
        <tr>
            <td>
                <label for="item-quantity">Quantity:</label>
            </td>
            <td>
                <input type="number" id="item-quantity" name="quantity" value=""""),_display_(/*31.81*/item/*31.85*/.getQuantity()),format.raw/*31.99*/("""">
            </td>
        </tr>
        <tr>
            <td>
                <input type="submit" id="submit" name="submit" value="Update"/>
            </td>
        </tr>

    </table>
    """)))}),format.raw/*41.6*/("""

""")))}))
      }
    }
  }

  def render(id:Long,item:VendingItem,form:Form[VendingItem]): play.twirl.api.HtmlFormat.Appendable = apply(id,item,form)

  def f:((Long,VendingItem,Form[VendingItem]) => play.twirl.api.HtmlFormat.Appendable) = (id,item,form) => apply(id,item,form)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri May 25 21:15:58 BST 2018
                  SOURCE: /Users/richard/Documents/Coding/Projects/vending_machine/vending_machine/app/views/editItem.scala.html
                  HASH: 534f4bc9ef87a42bf34173273b233e5189039419
                  MATRIX: 979->1|1106->60|1157->55|1187->83|1215->86|1248->111|1287->113|1319->119|1387->162|1401->168|1484->243|1523->245|1555->251|1784->453|1797->457|1828->467|2116->728|2130->732|2163->743|2439->992|2452->996|2487->1010|2723->1216
                  LINES: 28->1|31->3|34->1|36->4|37->5|37->5|37->5|38->6|40->8|40->8|40->8|40->8|41->9|47->15|47->15|47->15|55->23|55->23|55->23|63->31|63->31|63->31|73->41
                  -- GENERATED --
              */
          