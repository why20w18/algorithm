package streams_Web;

import java.util.ArrayList;
import java.util.Scanner;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;




public class wikiCLI {

    public static String bin(int no){
        
        
        return "test";
    }
    
    
    

    
        //private static final int ORTALAMA_UZUNLUK = 150;
        
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        String viki = "https://tr.wikipedia.org/w/index.php?search=";
        String araSon = "&title=%C3%96zel:Ara&profile=advanced&fulltext=1&ns0=1";
        String aranacakKelime = "";
        String aranacakText = "";
        
        ArrayList<String> gelenSayfaURL = new ArrayList<String>();
        int no = 1;

        while(!aranacakKelime.equals("cikis")){
            
        System.out.println("WikiCLI<Aramak istediginizi girin>:");
        aranacakKelime = scanner.nextLine();
        aranacakText = aranacakKelime.replaceAll(" ", "\\+");
        //div.mw-search-results-container >> anasayfadaki metinler

        //System.out.println(viki+aranacakText+araSon);
        

        Document doc = Jsoup.connect(viki+aranacakText+araSon).get();
        Elements element = doc.select("div.mw-search-result-heading");
        
        for (Element x : element) {
            System.out.println(no+"-"+x.text());
            no++;
            String urlSonFormat = x.text().replaceAll(" ", "_");
            gelenSayfaURL.add("https://tr.wikipedia.org/wiki/"+urlSonFormat);
            if(scanner.hasNextLine() && scanner.nextLine().contains("sec")){ //string olarak sec ile baslayan birsey girerse
                //sec ve girilen int deger ayrilmali
                String komut = scanner.nextLine();
                int girilenNo = Integer.parseInt(komut)-1; //son indexi cikardik
                
                
            }//scanner.hasNextLine() && scanner.nextLine().equals("sec")
        }
        gelenSayfaURL.clear(); //baðlý listeyi bosalttik
        no = 1;
        
            
        }//while
        
        
    }
}
