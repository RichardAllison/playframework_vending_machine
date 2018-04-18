
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

object sale extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[VendingItem,Sale,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(item: VendingItem, sale: Sale):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.33*/("""

"""),_display_(/*3.2*/main("Service Vending Machine")/*3.33*/ {_display_(Seq[Any](format.raw/*3.35*/("""
    """),format.raw/*4.5*/("""<dl>
        <div><dt>Item: """),_display_(/*5.25*/item/*5.29*/.getName()),format.raw/*5.39*/(""" """),format.raw/*5.40*/("""- """),_display_(/*5.43*/item/*5.47*/.getPrice()),format.raw/*5.58*/("""</dt><dd id="item-display"></dd></div>
        <div><dt>Money due: """),_display_(/*6.30*/sale/*6.34*/.amountDue()),format.raw/*6.46*/("""</dt><dd id="due-display"></dd></div>
        <div><dt>Paid: """),_display_(/*7.25*/sale/*7.29*/.getAmountPaid()),format.raw/*7.45*/("""</dt><dd id="paid-display"></dd></div>
    </dl>
    <form id="select-item" action="index.html" method="post">
        <p>Insert coin:</p>
        <input type="radio" name="coins" value="nickels" id="nickel">
        <label for="nickel">Nickel</label>
        <input type="radio" name="coins" value="dimes" id="dime">
        <label for="dime">Dime</label>
        <input type="radio" name="coins" value="quarters" id="quarter">
        <label for="quarter">Quarter</label>
        <input type="radio" name="coins" value="dollars" id="dollar">
        <label for="dollar">Dollar</label>
    </form>

    <form id="coin-select" action="index.html" method="post">
        <button type="button" name="button">Return money</button>
    </form>
""")))}))
      }
    }
  }

  def render(item:VendingItem,sale:Sale): play.twirl.api.HtmlFormat.Appendable = apply(item,sale)

  def f:((VendingItem,Sale) => play.twirl.api.HtmlFormat.Appendable) = (item,sale) => apply(item,sale)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed Apr 18 13:17:49 GMT 2018
                  SOURCE: /mnt/c/Users/Richard/Desktop/Java Web App/play-project/vendingmachine/app/views/sale.scala.html
                  HASH: f68539504063483fc53edbdb51ba2e846c406ca1
                  MATRIX: 957->1|1083->32|1113->37|1152->68|1191->70|1223->76|1279->106|1291->110|1321->120|1349->121|1378->124|1390->128|1421->139|1516->208|1528->212|1560->224|1649->287|1661->291|1697->307
                  LINES: 28->1|33->1|35->3|35->3|35->3|36->4|37->5|37->5|37->5|37->5|37->5|37->5|37->5|38->6|38->6|38->6|39->7|39->7|39->7
                  -- GENERATED --
              */
          