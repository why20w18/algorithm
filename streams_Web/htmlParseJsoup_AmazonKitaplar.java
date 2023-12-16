package streams_Web;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class htmlParseJsoup_AmazonKitaplar {

    
    public static void main(String[] args) throws Exception{
        
        Document dokuman = null;
        
        dokuman = Jsoup.connect("https://www.amazon.com.tr/gp/bestsellers/books").get();
        
        System.out.println(dokuman);
    }

}
