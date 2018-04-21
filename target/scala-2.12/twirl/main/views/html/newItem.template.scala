
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

    """),_display_(/*7.6*/helper/*7.12*/.form(action = routes.ServiceController.saveItem(), 'id -> "item_form")/*7.83*/ {_display_(Seq[Any](format.raw/*7.85*/("""

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
                  DATE: Thu Apr 19 11:48:12 GMT 2018
                  SOURCE: /mnt/c/Users/Richard/Desktop/Java Web App/play-project/vendingmachine/app/views/newItem.scala.html
                  HASH: c3133e8fc5ce946571112cf5d4fde4d91a93690f
                  MATRIX: 961->1|1059->31|1110->26|1140->54|1168->57|1200->81|1239->83|1273->92|1287->98|1366->169|1405->171|1444->184|1458->190|1538->250|1576->261|1591->267|1675->330|1713->341|1728->347|1821->419|1860->431|1957->498
                  LINES: 28->1|31->3|34->1|36->4|37->5|37->5|37->5|39->7|39->7|39->7|39->7|41->9|41->9|41->9|42->10|42->10|42->10|43->11|43->11|43->11|45->13|46->14
                  -- GENERATED --
              */
          