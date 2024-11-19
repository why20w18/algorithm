package basicAlgorithm;
import java.util.Scanner;

public class faktoriyel {
    
    public static int faktoriyel(int sayi){
        int sonuc = 1;
        
        for(int i = sayi ; i > 0 ; i--){
            sonuc *= i;
        }
        return sonuc;
    }
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Faktoriyeli hesaplanacak sayiyi girin:");
        int sayi = scanner.nextInt();
        
        if(sayi < 0)
              System.out.println("negatif sayilarin faktoriyeli yoktur !");
        else
        System.out.println("sonuc: "+faktoriyel(sayi));
        
    }
}
