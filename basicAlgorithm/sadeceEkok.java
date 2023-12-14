package basicAlgorithm;
import java.util.Scanner;

public class sadeceEkok {
    
    public static int ekokHesapla(int say1 , int say2){
            
        int max = (say1 < say2) ? say2 : say1;
        
        
        while(!false){
            
            if(max % say1 == 0 && max % say2 == 0){
                
                break;
            }
            max++;
        }
            return max;
    }
    
    public static void main(String[] args) {
        
     Scanner scanner = new Scanner(System.in);
     
        System.out.println("Ekoku hesaplanacak iki sayi girin:");
        int say1 = scanner.nextInt();
        int say2 = scanner.nextInt();
        
        System.out.println("ekok :"+ekokHesapla(say1, say2));
        
    }
    
}
