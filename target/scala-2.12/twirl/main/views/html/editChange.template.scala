
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

object editChange extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[VendingMachine,Form[VendingMachine],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(vendingMachine: VendingMachine, form: Form[VendingMachine]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import play.data.Form


Seq[Any](format.raw/*1.62*/("""

"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/main("Edit Vending Machine Change")/*5.37*/ {_display_(Seq[Any](format.raw/*5.39*/("""
    """),format.raw/*6.5*/("""<h2>Edit Vending Machine Change</h2>
    """),_display_(/*7.6*/helper/*7.12*/.form(action = routes.ServiceController.updateChange(), 'id -> "item_form")/*7.87*/ {_display_(Seq[Any](format.raw/*7.89*/("""

        """),format.raw/*9.9*/("""<table>
            <tr>
                <td>
                    <label for="nickels">Nickels:</label>
                </td>
                <td>
                    <input type="number" id="nickels" name="nickels" value=""""),_display_(/*15.78*/vendingMachine/*15.92*/.getNickels()),format.raw/*15.105*/("""">
                </td>
            </tr>
            <tr>
                <td>
                    <label for="dimes">Dimes:</label>
                </td>
                <td>
                    <input type="number" id="dimes" name="dimes" value=""""),_display_(/*23.74*/vendingMachine/*23.88*/.getDimes()),format.raw/*23.99*/("""">
                </td>
            </tr>
            <tr>
                <td>
                    <label for="quarters">Quarters:</label>
                </td>
                <td>
                    <input type="number" id="quarters" name="quarters" value=""""),_display_(/*31.80*/vendingMachine/*31.94*/.getQuarters()),format.raw/*31.108*/("""">
                </td>
            </tr>
            <tr>
                <td>
                    <label for="dollars">Dollars:</label>
                </td>
                <td>
                    <input type="number" id="dollars" name="dollars" value=""""),_display_(/*39.78*/vendingMachine/*39.92*/.getDollars()),format.raw/*39.105*/("""">
                </td>
            </tr>
            <tr>
                <td>
                    <input type="submit" id="submit" name="submit" value="Update"/>
                </td>
            </tr>

        </table>

    """)))}),format.raw/*50.6*/("""

""")))}))
      }
    }
  }

  def render(vendingMachine:VendingMachine,form:Form[VendingMachine]): play.twirl.api.HtmlFormat.Appendable = apply(vendingMachine,form)

  def f:((VendingMachine,Form[VendingMachine]) => play.twirl.api.HtmlFormat.Appendable) = (vendingMachine,form) => apply(vendingMachine,form)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri May 25 17:47:25 BST 2018
                  SOURCE: /Users/richard/Documents/Coding/Projects/vending_machine/vending_machine/app/views/editChange.scala.html
                  HASH: 3a7924ee61ef50ede449a6a050508b30329de043
                  MATRIX: 982->1|1115->66|1166->61|1196->89|1224->92|1267->127|1306->129|1338->135|1406->178|1420->184|1503->259|1542->261|1580->273|1837->503|1860->517|1895->530|2181->789|2204->803|2236->814|2534->1085|2557->1099|2593->1113|2887->1380|2910->1394|2945->1407|3215->1647
                  LINES: 28->1|31->3|34->1|36->4|37->5|37->5|37->5|38->6|39->7|39->7|39->7|39->7|41->9|47->15|47->15|47->15|55->23|55->23|55->23|63->31|63->31|63->31|71->39|71->39|71->39|82->50
                  -- GENERATED --
              */
          