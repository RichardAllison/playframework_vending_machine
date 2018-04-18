
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

object saleComplete extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Sale,VendingItem,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(sale: Sale, item: VendingItem):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.33*/("""

"""),_display_(/*3.2*/main("Service Vending Machine")/*3.33*/ {_display_(Seq[Any](format.raw/*3.35*/("""
"""),format.raw/*4.1*/("""<h3>Purchase complete</h3>
    <dl>
        <div><dt>"""),_display_(/*6.19*/item/*6.23*/.getName()),format.raw/*6.33*/("""</dt><dd id="item-display"></dd></div>
    </dl>

""")))}))
      }
    }
  }

  def render(sale:Sale,item:VendingItem): play.twirl.api.HtmlFormat.Appendable = apply(sale,item)

  def f:((Sale,VendingItem) => play.twirl.api.HtmlFormat.Appendable) = (sale,item) => apply(sale,item)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed Apr 18 20:25:58 GMT 2018
                  SOURCE: /mnt/c/Users/Richard/Desktop/Java Web App/play-project/vendingmachine/app/views/saleComplete.scala.html
                  HASH: af8205e66c08e4b6393f168ca24ea7bce52a6bc0
                  MATRIX: 965->1|1091->32|1121->37|1160->68|1199->70|1227->72|1309->128|1321->132|1351->142
                  LINES: 28->1|33->1|35->3|35->3|35->3|36->4|38->6|38->6|38->6
                  -- GENERATED --
              */
          