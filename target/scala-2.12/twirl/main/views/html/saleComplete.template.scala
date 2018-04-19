
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

"""),_display_(/*3.2*/main("Sale Complete")/*3.23*/ {_display_(Seq[Any](format.raw/*3.25*/("""
"""),format.raw/*4.1*/("""<h3>Purchase complete</h3>
    <dl>
        <div><dt>"""),_display_(/*6.19*/item/*6.23*/.getName()),format.raw/*6.33*/("""</dt><dd id="item-display"></dd></div>
        <div><dt>Price: $"""),_display_(/*7.27*/item/*7.31*/.getPrice()),format.raw/*7.42*/("""</dt><dd id="due-display"></dd></div>
        <div><dt>Paid: $"""),_display_(/*8.26*/sale/*8.30*/.amountTotal()),format.raw/*8.44*/("""</dt><dd id="paid-display"></dd></div>
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
                  DATE: Thu Apr 19 11:48:12 GMT 2018
                  SOURCE: /mnt/c/Users/Richard/Desktop/Java Web App/play-project/vendingmachine/app/views/saleComplete.scala.html
                  HASH: ec92d1eec94114bf67dc7e6f032deaf3c0d4076c
                  MATRIX: 965->1|1091->32|1121->37|1150->58|1189->60|1217->62|1299->118|1311->122|1341->132|1433->198|1445->202|1476->213|1566->277|1578->281|1612->295
                  LINES: 28->1|33->1|35->3|35->3|35->3|36->4|38->6|38->6|38->6|39->7|39->7|39->7|40->8|40->8|40->8
                  -- GENERATED --
              */
          