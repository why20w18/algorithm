package streams_Web;

import java.util.ArrayList;
import java.util.Scanner;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.util.ArrayList;
import java.util.Scanner;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class WikiCLI {
    
    public static final int SATIR_UZUNLUGU = 120; //120 karakter cmd size olarak
    
    public static void main(String[] args) throws Exception {
        
        StringBuilder sb = new StringBuilder();
        
        Scanner scanner = new Scanner(System.in);
        String viki = "https://tr.wikipedia.org/w/index.php?search=";
        String araSon = "&title=%C3%96zel:Ara&profile=advanced&fulltext=1&ns0=1";
        String aranacakKelime = "";
        String aranacakText = "";

        ArrayList<String> gelenSayfaURL = new ArrayList<>();
        int no = 1;

        while (!aranacakKelime.equals("cikis")) {
            System.out.println("\n<------------------------------WikiCLI------------------------------>\ngirilen son komut : "+aranacakKelime);
            System.out.print("\nArayin\n~$");
            aranacakKelime = scanner.nextLine();
            aranacakText = aranacakKelime.replaceAll(" ", "\\+");
            
            
             if(aranacakKelime.equals("sil")){
                gelenSayfaURL.clear();
                continue;
            }
             if(aranacakKelime.equals("exit")){
                 System.out.println("\nWikiCLI terminated !\nPROGRAM SONLANDIRILDI...");
                 break;
             }
             if(aranacakKelime.equals("help")){
                 System.out.println("###KOMUT LISTESI###\n"
                         + "\nSECIM EKRANI KOMUTLARI:"
                         + "\n@sec NO : aranan anahtar sonucu siralanan sayfalara gecis saglar"
                         + "\n@exit   : programi sonlandirir"
                         + "\nANA EKRAN KOMUTLARI"
                         + "\n~$sil  : sayfalar arasi gecislerde eski sayfa gosterilmeye devam ederse"
                         + "\n~$help : komut sayfasini baslatir"
                         + "\n~$exit : programi sonlandirir");
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
            System.out.print("Acilmasi istenen sayfa @");
            String kullaniciGirisi = scanner.nextLine();
            if (kullaniciGirisi.contains("sec")) {

                int girilenNo = Integer.parseInt(kullaniciGirisi.split(" ")[1]) - 1;
                String URL2 = gelenSayfaURL.get(girilenNo);
                doc = Jsoup.connect(URL2).get();
                element = doc.select("div.mw-content-ltr.mw-parser-output");

             for (Element y : element) {
    String satirlar[] = y.text().split("\\s+"); // diziye bosluklara gore split edip attim
    
    // y.text'e mudahale edemiyoruz o yuzden hepsini bir diziye kelime kelime atalim
    for (String w : satirlar) {
        if (sb.length() > 0 && sb.length() + w.length() > SATIR_UZUNLUGU) {
            System.out.println(sb.toString());
            sb.setLength(0); // sb'yi sýfýrlayalým
        }
        sb.append(w).append(" "); // kelimeyi ekleyelim
    }
    
    // Döngü bittikten sonra kalanlarý yazdýralým
    if (sb.length() > 0) {
        System.out.println(sb.toString());
        sb.setLength(0); // sb'yi sýfýrlayalým
    }
                    gelenSayfaURL.clear();
             }

            }
           
            if(kullaniciGirisi.equals("exit")){
                System.out.println("\nWikiCLI terminated !\nPROGRAM SONLANDIRILDI...");
                break;
            
            }

            no = 1;
        }
    }
}
