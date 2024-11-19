package basicAlgorithm;

import java.util.Scanner;
import java.util.regex.Pattern;

public class regexHarfMi {
    
    public static void harfKontrol(String metin){
    
        Pattern pattern = Pattern.compile("[a-zA-Z]+");
        
        String sonuc = (pattern.matcher(metin).matches()) ? "metin butunuyle harflerden olusuyor":"meti"
                + "nde harf disi karakter vardir";
        
        System.out.println(sonuc);
    }
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("metin girin:");
        String metin = scanner.nextLine();
        
        String bosluksuz = metin.replace(" ", "");
        //System.out.println(bosluksuz);
        harfKontrol(bosluksuz);
    }
    
}
