package recursiveAlgorithm;

import java.util.Scanner;

public class basamakToplaRecursive{
    
    public static int basamakTopla(int sayi){
        
        if(sayi == 0){
            return 0;
        }
        
        return sayi % 10 + basamakTopla(sayi/10);
    }
    
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.print
        ("sayi girin:");
        int sayi = scanner.nextInt();
        System.out.println("basamak toplami : "+basamakTopla(sayi));
    }
}