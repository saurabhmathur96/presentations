import scala.xml.XML
import java.net.URLEncoder

object Main {
    val BASE_URL = "http://www.dictionaryapi.com/api/v1/references/collegiate/xml"
    val KEY = "" /* key here */
     
    def define(word: String): String = {
        val encodedWord = URLEncoder.encode(word, "UTF-8")
        val url = s"$BASE_URL/$encodedWord?key=$KEY"
        val results = XML.load(url)
        val definitions = (results \\ "entry" \ "def" \ "dt" )
        if (definitions.length == 0) {
            throw new IllegalArgumentException("No definition found")
        }
        return definitions.head.text
    } 
    def main(args: Array[String]) = {
        val word = args(0)
        try {
            println(s"$word ${define(word)}")
        } catch {
            case e: IllegalArgumentException => println("No definition found")
        }    
    }
}

