
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
    """),format.raw/*13.58*/("""
    """),format.raw/*14.5*/("""<title>"""),_display_(/*14.13*/title),format.raw/*14.18*/("""</title>
    <link rel="stylesheet" media="screen" href=""""),_display_(/*15.50*/routes/*15.56*/.Assets.versioned("stylesheets/main.css")),format.raw/*15.97*/("""">
    <link rel="shortcut icon" type="image/png" href=""""),_display_(/*16.55*/routes/*16.61*/.Assets.versioned("images/favicon.png")),format.raw/*16.100*/("""">
</head>
<body>
<nav>
    <ul>
        <li><a href="/">Home</a></li>
        <li><a href="/service">Service</a></li>
    </ul>
</nav>
<div class="main-content">
    """),format.raw/*27.27*/("""
    """),_display_(/*28.6*/content),format.raw/*28.13*/("""
"""),format.raw/*29.1*/("""</div>
<script src=""""),_display_(/*30.15*/routes/*30.21*/.Assets.versioned("javascripts/main.js")),format.raw/*30.61*/("""" type="text/javascript"></script>
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
                  DATE: Sun Apr 22 13:48:58 GMT 2018
                  SOURCE: /mnt/c/Users/Richard/Desktop/vendingmachine/vendingmachine/app/views/main.scala.html
                  HASH: 9f07ad8e0ede308975883c50882ce4ccc29b9d41
                  MATRIX: 1206->261|1331->291|1361->295|1467->426|1500->432|1535->440|1561->445|1647->504|1662->510|1724->551|1809->609|1824->615|1885->654|2090->917|2123->924|2151->931|2180->933|2229->955|2244->961|2305->1001
                  LINES: 33->7|38->7|40->9|44->13|45->14|45->14|45->14|46->15|46->15|46->15|47->16|47->16|47->16|57->27|58->28|58->28|59->29|60->30|60->30|60->30
                  -- GENERATED --
              */
          