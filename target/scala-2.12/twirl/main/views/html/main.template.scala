
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

  /**/
  def apply/*1.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.32*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>
<html lang="en-gb">
<head>
    <meta charset="utf-8">
    <title>"""),_display_(/*7.13*/title),format.raw/*7.18*/("""</title>
    <link rel="stylesheet" media="screen" href=""""),_display_(/*8.50*/routes/*8.56*/.Assets.versioned("stylesheets/main.css")),format.raw/*8.97*/("""">
    <link rel="shortcut icon" type="image/png" href=""""),_display_(/*9.55*/routes/*9.61*/.Assets.versioned("images/favicon.png")),format.raw/*9.100*/("""">
</head>
<body>
<nav>
    <ul>
        <li><a href="/">Home</a></li>
        <li><a href="/service">Service</a></li>
    </ul>
</nav>
<div id="main-content">
    <h1>Vending Machine</h1>
    """),_display_(/*20.6*/content),format.raw/*20.13*/("""
"""),format.raw/*21.1*/("""</div>
<script src=""""),_display_(/*22.15*/routes/*22.21*/.Assets.versioned("javascripts/main.js")),format.raw/*22.61*/("""" type="text/javascript"></script>
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
                  DATE: Fri May 25 17:47:25 BST 2018
                  SOURCE: /Users/richard/Documents/Coding/Projects/vending_machine/vending_machine/app/views/main.scala.html
                  HASH: 05ff6f777a8e4e47b3a7c75e4ff2545b96828b07
                  MATRIX: 952->1|1077->31|1107->35|1219->121|1244->126|1329->185|1343->191|1404->232|1488->290|1502->296|1562->335|1793->540|1821->547|1850->549|1899->571|1914->577|1975->617
                  LINES: 28->1|33->1|35->3|39->7|39->7|40->8|40->8|40->8|41->9|41->9|41->9|52->20|52->20|53->21|54->22|54->22|54->22
                  -- GENERATED --
              */
          