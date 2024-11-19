package basicAlgorithm;

import java.util.Random;
import java.util.Scanner;

public class randomParola {
    
    public static String parolaOlustur(int haneSayisi){
        StringBuilder sb = new StringBuilder();
        
        String buyukHarfler = "QWERTYUIOPASDFGHJKLZXCVBNM";
        String kucukHarfler = buyukHarfler.toLowerCase();
        String rakamlar = "0123456789";
        
        String karmaHepsi = buyukHarfler + kucukHarfler + rakamlar;
        Random rand = new Random();
        
        for(int i = 0 ; i < haneSayisi ; i++)
        sb.append(karmaHepsi.charAt(rand.nextInt(karmaHepsi.length())));
        
        return sb.toString();
    }
    
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kac haneli parola uretilsin:");
        int haneSayisi = scanner.nextInt();
        
        System.out.println(parolaOlustur(haneSayisi));
        
    }
    
}
