
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
"""),_display_(/*5.2*/main("Vending Machine")/*5.25*/ {_display_(Seq[Any](format.raw/*5.27*/("""

    """),_display_(/*7.6*/helper/*7.12*/.form(action = routes.ItemController.save(), 'id -> "item_form")/*7.76*/ {_display_(Seq[Any](format.raw/*7.78*/("""

        """),_display_(/*9.10*/helper/*9.16*/.inputText(form("name"), '_id -> "name", '_label -> "Name:")),format.raw/*9.76*/("""
        """),_display_(/*10.10*/helper/*10.16*/.inputText(form("price"), '_id -> "price", '_label -> "Price:")),format.raw/*10.79*/("""
        """),_display_(/*11.10*/helper/*11.16*/.inputText(form("quantity"), '_id -> "quantity", '_label -> "Quantity:")),format.raw/*11.88*/("""

        """),format.raw/*13.9*/("""<input type="submit" id="submit" name="submit" value="Add"/>
    """)))}),format.raw/*14.6*/("""

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
                  DATE: Tue Apr 17 15:13:01 GMT 2018
                  SOURCE: /mnt/c/Users/Richard/Desktop/Java Web App/play-project/vendingmachine/app/views/newItem.scala.html
                  HASH: edc6298adab9902725e2d7ad3d6cef52562cc4eb
                  MATRIX: 961->1|1059->31|1110->26|1140->54|1168->57|1199->80|1238->82|1272->91|1286->97|1358->161|1397->163|1436->176|1450->182|1530->242|1568->253|1583->259|1667->322|1705->333|1720->339|1813->411|1852->423|1949->490
                  LINES: 28->1|31->3|34->1|36->4|37->5|37->5|37->5|39->7|39->7|39->7|39->7|41->9|41->9|41->9|42->10|42->10|42->10|43->11|43->11|43->11|45->13|46->14
                  -- GENERATED --
              */
          