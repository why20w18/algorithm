package basicAlgorithm;
import java.util.Scanner;

public class girilenlerArasiTekCift {
    
    public static void sirala(int x , int y){
        int min = (x < y) ? x : y;
        int max = (x < y) ? y : x;
        System.out.println("Araliktaki cift degerler:");
       for(int i = min  ; i <= max ; i++){
           
           if(i % 2 == 0){
           System.out.print(i+" ");
           
           }
           
       }
        System.out.println("\nAraliktaki tek degerler:");
        
           for(int i = min  ; i <= max ; i++){
           
           if(i % 2 != 0){
           System.out.print(i+" ");
           
           }
           
       }
        
    }
    
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Aralik girin:");
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        
        sirala(x,y);
        
    }
    
}
