package streams_Web;
import java.awt.Desktop;
import java.util.Scanner;
import java.net.URL;
import java.net.URLConnection;
import java.io.InputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.InputStreamReader;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class kaynakKodOkuma {

    
    public static void main(String[] args) throws Exception{
        
        Scanner scanner = new Scanner(System.in);
        JFrame jframe = new JFrame();
        
        System.out.print("ornek:google.com\nkaynak kodunu gormek istediginiz siteyi girin:");
        String url = scanner.nextLine();
        
        URL adres = new URL("https://www."+url);
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
        
        System.out.println("KAYNAK KOD:");
        System.out.println(sb.toString());
                
        int secim = JOptionPane.showConfirmDialog(jframe, "html olarak"
                + " masa�st�ne kaynak kod ��kart�ls�n m� ?", "D��a aktar"
                        + "ma iste�i", JOptionPane.YES_NO_OPTION);
        
        if(secim == JOptionPane.YES_OPTION){
            System.out.print("bilgisayarin adi:");
            String pc = scanner.nextLine();
            
            System.out.print("ornek:kaynakDosya\nDosya adi giriniz:");
            String dosyaAdi = scanner.nextLine();
            
            try {                
            File file = new File("C:/Users/"+pc+"/Desktop/"+dosyaAdi+".html");
            if(!file.exists()){
                file.createNewFile();
            }
            FileWriter yazici = new FileWriter(file);
            yazici.write(sb.toString());
            yazici.close();
            if(file.exists()){
                int calistirmak = JOptionPane.showConfirmDialog(jframe, "D��a aktarma ba�ar�l�"
                        + " dosyayi �al��t�rmak istiyor musunuz ?", "�ALI�T"
                                + "IRMA �STE��", JOptionPane.YES_NO_OPTION);
            
                if(calistirmak == JOptionPane.YES_OPTION){
                    
                    Desktop.getDesktop().browse(file.toURI());
                }
                else if(calistirmak == JOptionPane.NO_OPTION){
                    System.out.println("Calistirma istegini reddettiniz");
                }
            
            }
            }catch (Exception e) {
                System.out.println("hata :"+e.getMessage());
            }
            
        }
        else if(secim == JOptionPane.NO_OPTION){
            System.out.println("Disa aktarma istegini reddettiniz");
        }
        
        scanner.close();
        System.out.println("Program Sonlandi !");
    }
    
}
