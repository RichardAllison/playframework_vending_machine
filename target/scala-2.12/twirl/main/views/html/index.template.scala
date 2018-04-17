
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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[java.util.List[VendingItem],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(items: java.util.List[VendingItem]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.38*/("""

"""),_display_(/*3.2*/main("Vending Machine")/*3.25*/ {_display_(Seq[Any](format.raw/*3.27*/("""
  """),format.raw/*4.3*/("""<h1>Vending Machine</h1>
  <p><a href="/service">Service</a></p>
  <form id="select-item" action="index.html" method="post">
    <p>Select item:</p>
    <table>
      <tbody>
      """),_display_(/*10.8*/for(item <- items) yield /*10.26*/ {_display_(Seq[Any](format.raw/*10.28*/("""
        """),format.raw/*11.9*/("""<tr>
          <td><input type="radio" name="items" value="""),_display_(/*12.55*/item/*12.59*/.id),format.raw/*12.62*/(""" """),format.raw/*12.63*/("""id="item-"""),_display_(/*12.73*/item/*12.77*/.id),format.raw/*12.80*/(""""></td>
          <td><label for="item-"""),_display_(/*13.33*/item/*13.37*/.id),format.raw/*13.40*/("""">"""),_display_(/*13.43*/item/*13.47*/.name),format.raw/*13.52*/(""": """),_display_(/*13.55*/item/*13.59*/.price),format.raw/*13.65*/("""</label></td>
        </tr>
      """)))}),format.raw/*15.8*/("""
      """),format.raw/*16.7*/("""</tbody>
      <tfoot>
      <tr>
        <td colspan="2"><input type="submit" name="select-item-submit" id="select-item-submit" value="Select"></td>
      </tr>
      </tfoot>
    </table>
  </form>

  <dl>
    <div><dt>Item:</dt><dd id="item-display"></dd></div>
    <div><dt>Money due:</dt><dd id="due-display"></dd></div>
    <div><dt>Paid:</dt><dd id="paid-display"></dd></div>
  </dl>
  <form id="select-item" action="index.html" method="post">
    <p>Insert coin:</p>
    <input type="radio" name="coins" value="5" id="dime">
    <label for="dime">Dime</label>
    <input type="radio" name="coins" value="10" id="nickel">
    <label for="nickel">Nickel</label>
    <input type="radio" name="coins" value="25" id="quarter">
    <label for="quarter">Quarter</label>
    <input type="radio" name="coins" value="100" id="dollar">
    <label for="dollar">Dollar</label>
  </form>

  <form id="coin-select" action="index.html" method="post">
    <button type="button" name="button">Return money</button>
  </form>


""")))}),format.raw/*47.2*/("""
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
                  DATE: Tue Apr 17 12:52:45 GMT 2018
                  SOURCE: /mnt/c/Users/Richard/Desktop/Java Web App/play-project/vendingmachine/app/views/index.scala.html
                  HASH: fe29fc99f5ffa4a093f58a7f3204d4d774d88d0d
                  MATRIX: 969->1|1100->37|1130->42|1161->65|1200->67|1230->71|1444->259|1478->277|1518->279|1555->289|1642->349|1655->353|1679->356|1708->357|1745->367|1758->371|1782->374|1850->415|1863->419|1887->422|1917->425|1930->429|1956->434|1986->437|1999->441|2026->447|2093->484|2128->492|3207->1541
                  LINES: 28->1|33->1|35->3|35->3|35->3|36->4|42->10|42->10|42->10|43->11|44->12|44->12|44->12|44->12|44->12|44->12|44->12|45->13|45->13|45->13|45->13|45->13|45->13|45->13|45->13|45->13|47->15|48->16|79->47
                  -- GENERATED --
              */
          