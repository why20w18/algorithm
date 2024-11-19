package recursiveAlgorithm;
import java.util.Scanner;

public class birdenSonaTopla {
    
    public static int toplayici(int n){
        
        if(n == 0){
            return 0;
        }
            
         return n + toplayici(n-1);
    }
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Hangi sayiya kadar toplansin:");
        int sayi = scanner.nextInt();
        
        System.out.println(toplayici(sayi));
        
    }
    
}
