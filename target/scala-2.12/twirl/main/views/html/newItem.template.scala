
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

        """),_display_(/*10.10*/helper/*10.16*/.inputText(form("name"), '_id -> "name", '_label -> "Name:")),format.raw/*10.76*/("""
        """),_display_(/*11.10*/helper/*11.16*/.inputText(form("price"), '_id -> "price", '_label -> "Price:")),format.raw/*11.79*/("""
        """),_display_(/*12.10*/helper/*12.16*/.inputText(form("quantity"), '_id -> "quantity", '_label -> "Quantity:")),format.raw/*12.88*/("""

        """),format.raw/*14.9*/("""<input type="submit" id="submit" name="submit" value="Add"/>
    """)))}),format.raw/*15.6*/("""

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
                  DATE: Sun Apr 22 21:14:16 GMT 2018
                  SOURCE: /mnt/c/Users/Richard/Desktop/vendingmachine/vendingmachine/app/views/newItem.scala.html
                  HASH: 9a965b4c19298bdf7234733d98ebc921b2a3e231
                  MATRIX: 961->1|1059->31|1110->26|1140->54|1168->57|1200->81|1239->83|1271->89|1326->119|1340->125|1419->196|1458->198|1498->211|1513->217|1594->277|1632->288|1647->294|1731->357|1769->368|1784->374|1877->446|1916->458|2013->525
                  LINES: 28->1|31->3|34->1|36->4|37->5|37->5|37->5|38->6|40->8|40->8|40->8|40->8|42->10|42->10|42->10|43->11|43->11|43->11|44->12|44->12|44->12|46->14|47->15
                  -- GENERATED --
              */
          