package streams_Web;

import java.util.Scanner;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;




public class wikiCLI {
    
        //private static final int ORTALAMA_UZUNLUK = 150;
        
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        String viki = "https://tr.wikipedia.org/w/index.php?search=";
        String araSon = "&title=%C3%96zel:Ara&profile=advanced&fulltext=1&ns0=1";
        String aranacakKelime = "";

        int no = 1;

        while(!aranacakKelime.equals("cikis")){
            
        System.out.println("WikiCLI<Aramak istediginizi girin>:");
        aranacakKelime = scanner.nextLine();
        aranacakKelime.replaceAll(" ", "\\+");
        //div.mw-search-results-container >> anasayfadaki metinler
            System.out.println(">>>"+aranacakKelime);
        Document doc = Jsoup.connect(viki+aranacakKelime+araSon).get();
        Elements element = doc.select("div.mw-search-result-heading");
        
        for (Element x : element) {
            System.out.println(no+"-"+x.text());
            no++;
        }
        
            
        }
        
        
    }
}
