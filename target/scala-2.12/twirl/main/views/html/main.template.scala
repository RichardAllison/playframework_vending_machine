
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

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /*
 * This template is called from the `index` template. This template
 * handles the rendering of the page header and body tags. It takes
 * two arguments, a `String` for the title of the page and an `Html`
 * object to insert into the body of the page.
 */
  def apply/*7.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*7.32*/("""

"""),format.raw/*9.1*/("""<!DOCTYPE html>
<html lang="en-gb">
    <head>
        <meta charset="utf-8">
        """),format.raw/*13.62*/("""
        """),format.raw/*14.9*/("""<title>"""),_display_(/*14.17*/title),format.raw/*14.22*/("""</title>
        <link rel="stylesheet" media="screen" href=""""),_display_(/*15.54*/routes/*15.60*/.Assets.versioned("stylesheets/main.css")),format.raw/*15.101*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*16.59*/routes/*16.65*/.Assets.versioned("images/favicon.png")),format.raw/*16.104*/("""">
    </head>
    <body>
        <nav>
            <ul>
                <li><a href="/">Home</a></li>
                <li><a href="/service">Service</a></li>
            </ul>
        </nav>
        <div class="main-content">
        """),format.raw/*27.32*/("""
        """),_display_(/*28.10*/content),format.raw/*28.17*/("""
        """),format.raw/*29.9*/("""</div>
        <script src=""""),_display_(/*30.23*/routes/*30.29*/.Assets.versioned("javascripts/main.js")),format.raw/*30.69*/("""" type="text/javascript"></script>
        <footer>
            <p>&copy; Richard Allison 2018. All rights reserved.</p>
        </footer>
    </body>
</html>
"""))
      }
    }
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed Apr 18 10:41:00 GMT 2018
                  SOURCE: /mnt/c/Users/Richard/Desktop/Java Web App/play-project/vendingmachine/app/views/main.scala.html
                  HASH: 0ec04f017a18a49d0fbaf836a65eaedddd42c988
                  MATRIX: 1211->266|1336->296|1366->300|1484->443|1521->453|1556->461|1582->466|1672->529|1687->535|1750->576|1839->638|1854->644|1915->683|2188->1019|2226->1030|2254->1037|2291->1047|2348->1077|2363->1083|2424->1123
                  LINES: 33->7|38->7|40->9|44->13|45->14|45->14|45->14|46->15|46->15|46->15|47->16|47->16|47->16|57->27|58->28|58->28|59->29|60->30|60->30|60->30
                  -- GENERATED --
              */
          