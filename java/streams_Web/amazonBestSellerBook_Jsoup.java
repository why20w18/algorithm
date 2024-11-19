package streams_Web;

import java.util.Scanner;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class amazonBestSellerBook_Jsoup {

    public static void main(String[] args) throws Exception {
        int cx = 1;
        Scanner scanner = new Scanner(System.in);
        String secim = "";
        while(!false){
        
        System.out.print("<----------------------------GUNCEL AMAZON VERI CEKIP LISTELEYICI---------------------------->"
                + "\nCALISTIRILMA SAYISI: "+cx
                + "\nSECENEKLER:\n"
                + ">>cok satan\n"
                + ">>yeni cikan\n"
                + ">>en talep edilen\n"
                + ">>en iyi performans"
                + "\n>>cikis"
                + "\nSON CALISAN KOMUT:"+secim+" YUKARIDA LISTELENMISTIR !"+"\n\n>>");
        secim = scanner.nextLine().toLowerCase().replace(" ", "");
        String kitapBaslik = "",yazarBaslik = "YAZAR ISIMLERI";
        

  Document dokuman = null;
  if(secim.equals("coksatan")){
        dokuman = Jsoup.connect("https://www.amazon.com.tr/gp/bestsellers/books").get();
        kitapBaslik = "AMAZON EN COK SATAN KITAPLAR";
  }
  else if(secim.equals("yenicikan")){
        dokuman = Jsoup.connect("https://www.amazon.com.tr/gp/new-releases/books/ref=zg_bs_tab_t_books_bsnr").get();
        kitapBaslik = "AMAZON YENI CIKAN KITAPLAR";
  }
  else if(secim.equals("entalepedilen")){
        dokuman = Jsoup.connect("https://www.amazon.com.tr/gp/most-wished-for/books/ref=zg_bsnr_tab_t_books_mw").get();
        kitapBaslik = "AMAZON EN COK TALEP EDILEN KITAPLAR";
  }
  else if(secim.equals("eniyiperformans")){
        dokuman = Jsoup.connect("https://www.amazon.com.tr/gp/movers-and-shakers/books/ref=zg_mw_tab_t_books_bsms").get();
        kitapBaslik = "AMAZON EN IYI PERFORMANS GOSTEREN KITAPLAR";
  }
  else if(secim.equals("cikis")){
      System.out.println("Program sonlandirildi ...");
      System.exit(0);
  }
  Elements element = dokuman.select("div._cDEzb_p13n-sc-css-line-clamp-1_1Fn1y"); 

  int satirNo = 0;
  int numaralandir = 1;
        
        System.out.println("<---------------------"+kitapBaslik+"--------------------->");
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
        System.out.println("<----------------------------"+yazarBaslik+"---------------------------->");
        for(Element x : element){
            
            if(satirNo % 2 != 0){
                String yazarAdlari = x.text();
                System.out.println(numaralandir+".Kitabin Yazari:"+yazarAdlari);
                numaralandir++;
            }
            satirNo++;
        }
  
    cx++;
    }//while  
    } 
    
}