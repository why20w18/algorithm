package basicAlgorithm;
import java.util.Scanner;

public class sesliHarfTespit {
    
    public static char[] kontrol(String metin){
     
        int uzunluk = metin.length();
        String harfler = "aeiouAEIOU";
        char bulunanHarf[] = new char[uzunluk];
        int index = 0;
        
        for(int i = 0 ; i < uzunluk ; i++){
            
            char metinHarf = metin.charAt(i);
         
            if(indexBulduMu(metinHarf)){ 
                bulunanHarf[index] = metinHarf;
                index++;
            }
            
        }
        
     return bulunanHarf;   
    }
    
    public static boolean indexBulduMu(char metinIciHarfler){
        return "aeiouAEIOU".indexOf(metinIciHarfler) != -1; //eðer metinden gelen harfler sesliyse true
    }
    
    
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Metin girin:");
        String metin = scanner.nextLine();
        char sonuc[] = kontrol(metin);
        System.out.println("Metindeki sesli harfler:");
        for(int x : sonuc){
            
            if(x != 0){ //ascii degerlerden olusur 0 olanlari boslari alma
               System.out.print(((char)x+" "));
            }
        
        }
    
    
    }
    
}
