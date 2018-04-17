
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
"""),_display_(/*5.2*/main("Vending Machine")/*5.25*/ {_display_(Seq[Any](format.raw/*5.27*/("""

    """),_display_(/*7.6*/helper/*7.12*/.form(action = routes.ItemController.update(id), 'id -> "item_form")/*7.80*/ {_display_(Seq[Any](format.raw/*7.82*/("""

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
                  DATE: Tue Apr 17 16:21:13 GMT 2018
                  SOURCE: /mnt/c/Users/Richard/Desktop/Java Web App/play-project/vendingmachine/app/views/editItem.scala.html
                  HASH: c4df8d2e404649a330d4af38eb264a4675e6b3db
                  MATRIX: 979->1|1106->60|1157->55|1187->83|1215->86|1246->109|1285->111|1319->120|1333->126|1409->194|1448->196|1487->209|1501->215|1581->275|1619->286|1634->292|1718->355|1756->366|1771->372|1864->444|1903->456|2003->526
                  LINES: 28->1|31->3|34->1|36->4|37->5|37->5|37->5|39->7|39->7|39->7|39->7|41->9|41->9|41->9|42->10|42->10|42->10|43->11|43->11|43->11|45->13|46->14
                  -- GENERATED --
              */
          