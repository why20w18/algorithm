package basicAlgorithm;
import java.util.Scanner;


public class basamakSayisiBulan {
    
    public static int basamakSay(int sayi){
        
        int cx = 0;
        
        while(sayi > 0){
          sayi /= 10;
          cx++;
        }
        return cx;
    }
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("basamak sayisi hesaplanacak sayi:");
        int sayi = scanner.nextInt();
        System.out.println("basamak sayisi: "+basamakSay(sayi));
        
        
    }
    
    
}
