package recursiveAlgorithm;
import java.util.Scanner;


public class faktoriyelRecursive {
    
    public static int faktoriyel(int n){
        
        if(n < 0){
            return 0;
        }
        else if(n == 0){
            return 1;
        }
        
        return n * faktoriyel(n-1);
    }
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Faktoriyeli alinacak sayiyi girin: ");
        int sayi = scanner.nextInt();
        
        System.out.println("Sonuc: "+faktoriyel(sayi));
    }
    
    
}
