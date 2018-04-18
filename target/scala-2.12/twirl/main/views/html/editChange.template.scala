
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
"""),_display_(/*5.2*/main("Vending Machine")/*5.25*/ {_display_(Seq[Any](format.raw/*5.27*/("""

    """),_display_(/*7.6*/helper/*7.12*/.form(action = routes.ServiceController.updateChange(), 'id -> "item_form")/*7.87*/ {_display_(Seq[Any](format.raw/*7.89*/("""

        """),_display_(/*9.10*/helper/*9.16*/.inputText(form("nickels"), '_id -> "nickels", '_label -> "Nickels:")),format.raw/*9.85*/("""
        """),_display_(/*10.10*/helper/*10.16*/.inputText(form("dimes"), '_id -> "dimes", '_label -> "Dimes:")),format.raw/*10.79*/("""
        """),_display_(/*11.10*/helper/*11.16*/.inputText(form("quarters"), '_id -> "quarters", '_label -> "Quarters:")),format.raw/*11.88*/("""
        """),_display_(/*12.10*/helper/*12.16*/.inputText(form("dollars"), '_id -> "dollars", '_label -> "Dollars:")),format.raw/*12.85*/("""

        """),format.raw/*14.9*/("""<input type="submit" id="submit" name="submit" value="Update"/>
    """)))}),format.raw/*15.6*/("""

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
                  DATE: Wed Apr 18 13:10:10 GMT 2018
                  SOURCE: /mnt/c/Users/Richard/Desktop/Java Web App/play-project/vendingmachine/app/views/editChange.scala.html
                  HASH: cfa25d0156c1e9b2f87a7c4f5b68a90f4e20e9b3
                  MATRIX: 982->1|1115->66|1166->61|1196->89|1224->92|1255->115|1294->117|1328->126|1342->132|1425->207|1464->209|1503->222|1517->228|1606->297|1644->308|1659->314|1743->377|1781->388|1796->394|1889->466|1927->477|1942->483|2032->552|2071->564|2171->634
                  LINES: 28->1|31->3|34->1|36->4|37->5|37->5|37->5|39->7|39->7|39->7|39->7|41->9|41->9|41->9|42->10|42->10|42->10|43->11|43->11|43->11|44->12|44->12|44->12|46->14|47->15
                  -- GENERATED --
              */
          