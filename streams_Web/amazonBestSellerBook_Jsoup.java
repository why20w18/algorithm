package streams_Web;

import java.util.ArrayList;
import java.util.List;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class amazonBestSellerBook_Jsoup {

    public static void main(String[] args) throws Exception {

  Document dokuman = null;

  dokuman = Jsoup.connect("https://www.amazon.com.tr/gp/bestsellers/books").get();

  Elements element = dokuman.select("div._cDEzb_p13n-sc-css-line-clamp-1_1Fn1y"); 

  int satirNo = 0;
  int numaralandir = 1;
        
        System.out.println("<---------------------AMAZON EN FAZLA SATAN KITAPLAR GUNCEL LISTE--------------------->");
        for(Element y : element){
            
            if(satirNo % 2 == 0){
            String kitapIsim = y.text();
            System.out.println(numaralandir+".Kitap:"+kitapIsim);
            numaralandir++;
            }
            satirNo++;
        }
        satirNo = 0;
        numaralandir = 1;
        System.out.println("<----------------------------AMAZON EN FAZLA SATAN KITAPLARIN YAZARLARI GUNCEL LISTE---------------------------->");
        for(Element x : element){
            
            if(satirNo % 2 != 0){
                String yazarAdlari = x.text();
                System.out.println(numaralandir+".Kitabin Yazari:"+yazarAdlari);
                numaralandir++;
            }
            satirNo++;
        }
  
  
        
    }
    
}