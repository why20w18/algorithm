package basicAlgorithm;
import java.util.Scanner;

public class piramitCizdir {
    
    public static void cizdir(int h){
     
        for(int i = 1 ; i <= h ; i++){
            //normalde yýldýz kontrol edilirdi ama piramit icin boslukta kontrol edilecek
            for(int j = 1 ; j <= h-i ; j++){
                System.out.print(" ");
            }
            for(int k = 1 ; k <= 2*i -1 ; k++){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("piramit h = ");
        int h = scanner.nextInt();
        cizdir(h);
        
    }
    
}
