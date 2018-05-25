
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

object newItem extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Form[VendingItem],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(form: Form[VendingItem]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import play.data.Form


Seq[Any](format.raw/*1.27*/("""

"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/main("New Vending Item")/*5.26*/ {_display_(Seq[Any](format.raw/*5.28*/("""
    """),format.raw/*6.5*/("""<h2>Add New Item</h2>

    """),_display_(/*8.6*/helper/*8.12*/.form(action = routes.ServiceController.saveItem(), 'id -> "item_form")/*8.83*/ {_display_(Seq[Any](format.raw/*8.85*/("""

    """),format.raw/*10.5*/("""<table>
        <tr>
            <td>
                <label for="item-name">Name:</label>
            </td>
            <td>
                <input type="text" id="item-name" name="name" placeholder="Name">
            </td>
        </tr>
        <tr>
            <td>
                <label for="item-price">Price:</label>
            </td>
            <td>
                <input type="number" id="item-price" name="price" step="0.05" min="0.05" placeholder="$0.00">
            </td>
        </tr>
        <tr>
            <td>
                <label for="item-quantity">Quantity:</label>
            </td>
            <td>
                <input type="number" id="item-quantity" name="quantity" min="1" placeholder="Quantity">
            </td>
        </tr>
        <tr>
            <td>
                <input type="submit" id="submit" name="submit" value="Add"/>
            </td>
        </tr>
    </table>
    """)))}),format.raw/*41.6*/("""

""")))}))
      }
    }
  }

  def render(form:Form[VendingItem]): play.twirl.api.HtmlFormat.Appendable = apply(form)

  def f:((Form[VendingItem]) => play.twirl.api.HtmlFormat.Appendable) = (form) => apply(form)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri May 25 17:47:25 BST 2018
                  SOURCE: /Users/richard/Documents/Coding/Projects/vending_machine/vending_machine/app/views/newItem.scala.html
                  HASH: 2d289377e2ef785557bd7a88252eb6e8af611e28
                  MATRIX: 961->1|1059->31|1110->26|1140->54|1168->57|1200->81|1239->83|1271->89|1326->119|1340->125|1419->196|1458->198|1493->206|2475->1158
                  LINES: 28->1|31->3|34->1|36->4|37->5|37->5|37->5|38->6|40->8|40->8|40->8|40->8|42->10|73->41
                  -- GENERATED --
              */
          