package recursiveAlgorithm;
import java.util.Scanner;


public class usluSayiRecursive {
    
    public static int kuvvetAl(int taban , int kuvvet){
        
        if(kuvvet == 0){
            return 1;
        }
        return taban * kuvvetAl(taban, kuvvet-1);
    } 
    
    
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Taban girin:");
        int taban = scanner.nextInt();
        
        System.out.print("Kuvvet girin:");
        int kuvvet = scanner.nextInt();
        
        System.out.println("sonuc: "+kuvvetAl(taban, kuvvet));
            
        
    }
}
