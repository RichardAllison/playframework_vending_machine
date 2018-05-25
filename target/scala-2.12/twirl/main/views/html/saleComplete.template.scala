
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

object saleComplete extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[Sale,VendingItem,java.util.Map[String, Integer],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(sale: Sale, item: VendingItem, change: java.util.Map[String, Integer]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.73*/("""

"""),_display_(/*3.2*/main("Sale Complete")/*3.23*/ {_display_(Seq[Any](format.raw/*3.25*/("""
    """),format.raw/*4.5*/("""<h2>Purchase complete</h2>
    <dl>
        <div><dt>"""),_display_(/*6.19*/item/*6.23*/.getName()),format.raw/*6.33*/("""</dt><dd id="item-display"></dd></div>
        <div><dt>Price: $"""),_display_(/*7.27*/item/*7.31*/.getPrice()),format.raw/*7.42*/("""</dt><dd id="due-display"></dd></div>
        <div><dt>Paid: $"""),_display_(/*8.26*/sale/*8.30*/.amountTotal()),format.raw/*8.44*/("""</dt><dd id="paid-display"></dd></div>
        <div><dt>
            """),_display_(/*10.14*/if(!change.isEmpty())/*10.35*/ {_display_(Seq[Any](format.raw/*10.37*/("""
                """),format.raw/*11.17*/("""Change: """),_display_(/*11.26*/for((k,v) <- change) yield /*11.46*/ {_display_(Seq[Any](format.raw/*11.48*/("""
                    """),format.raw/*12.21*/("""<dt>"""),_display_(/*12.26*/v),format.raw/*12.27*/(""" """),_display_(/*12.29*/k),format.raw/*12.30*/("""</dt>
                """)))}),format.raw/*13.18*/("""
            """)))}/*14.15*/else/*14.20*/{_display_(Seq[Any](format.raw/*14.21*/("""
                """),format.raw/*15.17*/("""<dt>Sorry, correct change is not available.</dt>
            """)))}),format.raw/*16.14*/("""
        """),format.raw/*17.9*/("""</dt></div>
    </dl>

""")))}))
      }
    }
  }

  def render(sale:Sale,item:VendingItem,change:java.util.Map[String, Integer]): play.twirl.api.HtmlFormat.Appendable = apply(sale,item,change)

  def f:((Sale,VendingItem,java.util.Map[String, Integer]) => play.twirl.api.HtmlFormat.Appendable) = (sale,item,change) => apply(sale,item,change)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri May 25 21:23:52 BST 2018
                  SOURCE: /Users/richard/Documents/Coding/Projects/vending_machine/vending_machine/app/views/saleComplete.scala.html
                  HASH: 4780707d78c36c262265d2ddedb9da032c736f59
                  MATRIX: 996->1|1162->72|1192->77|1221->98|1260->100|1292->106|1374->162|1386->166|1416->176|1508->242|1520->246|1551->257|1641->321|1653->325|1687->339|1786->411|1816->432|1856->434|1902->452|1938->461|1974->481|2014->483|2064->505|2096->510|2118->511|2147->513|2169->514|2224->538|2258->554|2271->559|2310->560|2356->578|2450->641|2487->651
                  LINES: 28->1|33->1|35->3|35->3|35->3|36->4|38->6|38->6|38->6|39->7|39->7|39->7|40->8|40->8|40->8|42->10|42->10|42->10|43->11|43->11|43->11|43->11|44->12|44->12|44->12|44->12|44->12|45->13|46->14|46->14|46->14|47->15|48->16|49->17
                  -- GENERATED --
              */
          