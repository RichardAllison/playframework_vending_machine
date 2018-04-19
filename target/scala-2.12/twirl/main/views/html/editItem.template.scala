
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

    """),_display_(/*7.6*/helper/*7.12*/.form(action = routes.ServiceController.updateItem(id), 'id -> "item_form")/*7.87*/ {_display_(Seq[Any](format.raw/*7.89*/("""

        """),_display_(/*9.10*/helper/*9.16*/.inputText(form("name"), '_id -> "name", '_label -> "Name:")),format.raw/*9.76*/("""
        """),_display_(/*10.10*/helper/*10.16*/.inputText(form("price"), '_id -> "price", '_label -> "Price:")),format.raw/*10.79*/("""
        """),_display_(/*11.10*/helper/*11.16*/.inputText(form("quantity"), '_id -> "quantity", '_label -> "Quantity:")),format.raw/*11.88*/("""

        """),format.raw/*13.9*/("""<input type="submit" id="submit" name="submit" value="Update"/>
    """)))}),format.raw/*14.6*/("""

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
                  DATE: Thu Apr 19 11:48:12 GMT 2018
                  SOURCE: /mnt/c/Users/Richard/Desktop/Java Web App/play-project/vendingmachine/app/views/editItem.scala.html
                  HASH: b23cac7f501758b95b63ac37bcb5e4496188ed7b
                  MATRIX: 979->1|1106->60|1157->55|1187->83|1215->86|1248->111|1287->113|1321->122|1335->128|1418->203|1457->205|1496->218|1510->224|1590->284|1628->295|1643->301|1727->364|1765->375|1780->381|1873->453|1912->465|2012->535
                  LINES: 28->1|31->3|34->1|36->4|37->5|37->5|37->5|39->7|39->7|39->7|39->7|41->9|41->9|41->9|42->10|42->10|42->10|43->11|43->11|43->11|45->13|46->14
                  -- GENERATED --
              */
          