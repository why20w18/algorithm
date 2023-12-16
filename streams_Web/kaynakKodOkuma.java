package streams_Web;

import java.util.Scanner;
import java.net.URL;
import java.net.URLConnection;
import java.io.InputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class kaynakKodOkuma {

    
    public static void main(String[] args) throws Exception{
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("ornek:www.google.com\nkaynak kodunu gormek istediginiz siteyi girin:");
        String url = scanner.nextLine();
        
        URL adres = new URL("https://"+url);
        URLConnection baglanti = adres.openConnection();
        
        //okuma
        InputStream input = baglanti.getInputStream();
        BufferedReader buff = new BufferedReader(new InputStreamReader(input));
        
        StringBuilder sb = new StringBuilder();
        String satir;
        
        while((satir = buff.readLine()) != null){
            sb.append(satir);
            sb.append(System.lineSeparator());
        }
        
        System.out.println(sb.toString());
        
    }
    
}
