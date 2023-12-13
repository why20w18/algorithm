package basicAlgorithm;
import java.util.Scanner;


public class sayiTabaniCevirme {
    
    public static String tabanCevir(int sayi , int taban){
        StringBuilder sb = new StringBuilder();
        
        //iþimiz kalanla
        
        while(sayi > 0){
            
         int kalan = sayi % taban;
         sb.insert(0, kalan);
         sayi /= taban;
            
        }
        return sb.toString();
    }
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Cevirmek istediginiz sayiyi girin:");
        int sayi = scanner.nextInt();
        
        System.out.println("Hangi tabana cevireceksiniz:");
        int taban = scanner.nextInt();
        
        System.out.println("sonuc: "+tabanCevir(sayi, taban));
    }
    
    
}
