package basicAlgorithm;
import java.util.Scanner;


public class mukemmelSayi {
    
    public static boolean mukMu(long say1){
    
        //carpanlari bul ve buldukta topla
        long toplam = 0;
        
        for(int i = 1 ; i <= say1;i++){
            
            if(say1 % i == 0){
                toplam += i;
            }
            
        }
        if(toplam/2 == say1){
            return true;
        }
        return false;
    }
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Sayi girin:");
        long say1 = scanner.nextLong();
        
        if(say1 == 0){
            System.out.println("Mukemmel Sayi degildir");
            
        }
        else{
        String sonuc = (mukMu(say1)) ? "Mukemmel Sayidir !" : "Mukemmel Sayi Degildir !";
        System.out.println(sonuc);
        }
    }
    
}
