
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
"""),_display_(/*5.2*/main("Edit Vending Machine Change")/*5.37*/ {_display_(Seq[Any](format.raw/*5.39*/("""

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
                  DATE: Thu Apr 19 11:48:12 GMT 2018
                  SOURCE: /mnt/c/Users/Richard/Desktop/Java Web App/play-project/vendingmachine/app/views/editChange.scala.html
                  HASH: 220c666eb1e0768ea82c6b4467f6dc28c08a33b6
                  MATRIX: 982->1|1115->66|1166->61|1196->89|1224->92|1267->127|1306->129|1340->138|1354->144|1437->219|1476->221|1515->234|1529->240|1618->309|1656->320|1671->326|1755->389|1793->400|1808->406|1901->478|1939->489|1954->495|2044->564|2083->576|2183->646
                  LINES: 28->1|31->3|34->1|36->4|37->5|37->5|37->5|39->7|39->7|39->7|39->7|41->9|41->9|41->9|42->10|42->10|42->10|43->11|43->11|43->11|44->12|44->12|44->12|46->14|47->15
                  -- GENERATED --
              */
          