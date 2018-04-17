
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

object createItem extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.4*/("""

"""),_display_(/*3.2*/main("Vending Machine")/*3.25*/ {_display_(Seq[Any](format.raw/*3.27*/("""
"""),format.raw/*4.1*/("""<form class="" action="/service" method="POST">
    <fieldset>
        <legend>Add Items</legend>
        <br>
        <ul style="list-style: none;">

            <table>
                <tr>
                    <td>
                        <label for="name">Item name:</label>
                    </td>
                    <td>
                        <input id="name"
                               type="text"
                               name="name"
                               required="required"
                               placeholder="Item name">
                    </td>
                </tr>
                <tr>
                    <td>
                        <label for="price">Item price:</label>
                    </td>
                    <td>
                        <input id="price"
                               type="number"
                               min="0.01"
                               step="0.01"
                               name="price"
                               required="required"
                               placeholder="Item price">
                    </td>
                </tr>
                <tr>
                    <td>
                        <label for="quantity">Quantity:</label>
                    </td>
                    <td>
                        <input id="quantity"
                               type="number"
                               name="quantity"
                               required="required"
                               placeholder="Quantity">
                    </td>
                </tr>
                <tr>
                    <td colspan="2">
                        <input type="submit" value="Add item">
                    </td>
                </tr>

            </table>

        </ul>
    </fieldset>
</form>
""")))}))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Tue Apr 17 11:20:20 GMT 2018
                  SOURCE: /mnt/c/Users/Richard/Desktop/Java Web App/play-project/vendingmachine/app/views/createItem.scala.html
                  HASH: bc36807f2580bb28b8a55c1e907217f083b5663e
                  MATRIX: 946->1|1042->3|1072->8|1103->31|1142->33|1170->35
                  LINES: 28->1|33->1|35->3|35->3|35->3|36->4
                  -- GENERATED --
              */
          