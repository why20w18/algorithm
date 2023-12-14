package basicAlgorithm;
import java.util.Scanner;

public class ucgenCizdir {
    
    public static void ucgen(int yukseklik){
        
        for(int i = 0 ; i < yukseklik ; i++){
           
            for(int j = 0 ; j < i+1 ; j++){
                
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
    
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ucgenin yuksekligini girin:");
        int h = scanner.nextInt();
        
        ucgen(h);
    }
    
}
