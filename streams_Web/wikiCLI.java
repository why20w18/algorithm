package streams_Web;

import java.util.ArrayList;
import java.util.Scanner;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class wikiCLI {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        String viki = "https://tr.wikipedia.org/w/index.php?search=";
        String araSon = "&title=%C3%96zel:Ara&profile=advanced&fulltext=1&ns0=1";
        String aranacakKelime = "";
        String aranacakText = "";

        ArrayList<String> gelenSayfaURL = new ArrayList<>();
        int no = 1;

        while (!aranacakKelime.equals("cikis")) {
            System.out.println("\n<----------------->\nGirilen son komut : "+aranacakKelime);
            System.out.println("WikiCLI<Aramak istediginizi girin>:");
            aranacakKelime = scanner.nextLine();
            aranacakText = aranacakKelime.replaceAll(" ", "\\+");
            
            
             if(aranacakKelime.contains("sil")){
                gelenSayfaURL.clear();
                continue;
            }
            
            Document doc = Jsoup.connect(viki + aranacakText + araSon).get();
            Elements element = doc.select("div.mw-search-result-heading");
            

            for (Element x : element) {
                System.out.println(no + "-" + x.text());
                no++;
                String urlSonFormat = x.text().replaceAll(" ", "_");
                gelenSayfaURL.add("https://tr.wikipedia.org/wiki/" + urlSonFormat);
            }

            // Kullanýcýnýn giriþini bir deðiþkende saklayýn ve kontrol edin
            System.out.print("Acilmasi istenen sayfa >>>");
            String kullaniciGirisi = scanner.nextLine();
            if (kullaniciGirisi.contains("sec")) {

                int girilenNo = Integer.parseInt(kullaniciGirisi.split(" ")[1]) - 1;
                String URL2 = gelenSayfaURL.get(girilenNo);
                doc = Jsoup.connect(URL2).get();
                element = doc.select("div.mw-content-ltr.mw-parser-output");

                for (Element y : element) {
                    System.out.println(y.text());
                }
            }
           
            if(kullaniciGirisi.equals("c")){
                System.out.println("Secim Atlandi ...");
                continue;
            
            }

            no = 1;
        }
    }
}
