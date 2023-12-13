package basicAlgorithm;
import java.util.Scanner;

public class girilenStringdeSansur {
    
    public static String sansurle(String metin , Character harf){
        StringBuilder sb = new StringBuilder(metin);
        
        
        for(int i = 0 ; i < metin.length() ; i++){
            
            if(metin.charAt(i) == harf.toString().toLowerCase().charAt(0) || metin.charAt(i) == harf.toString().toUpperCase().charAt(0)){
                sb.setCharAt(i, '*');
            }
            
        }
        return sb.toString();
    }
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Metin girin:");
        String metin = scanner.nextLine();
        
        System.out.println("Hangi harf sansurlensin:");
        String sansurHarf = scanner.nextLine();
        
        char harf = sansurHarf.charAt(0);
        
        System.out.println(sansurle(metin, harf));
    }
    
    
}
