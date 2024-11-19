package basicAlgorithm;

import java.util.Scanner;



public class arrayOrtalamasi {
    
    
    public static double ortalama(int[] dizi){
        
        int uzunluk = dizi.length,toplam = 0;
        
        for(int i = 0 ; i < uzunluk ; i++){
            toplam += dizi[i]; 
        }
        return (double)toplam/uzunluk;
    }
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("uretilecek dizinin boyutu:");
        int boyut = scanner.nextInt();
        System.out.print("uretilecek diziye rastgele atanacak son deger:");
        int aralik = scanner.nextInt();
        int randomDizi[] = new int[boyut];
        
        for(int i = 0 ; i < randomDizi.length ; i++){
            
            randomDizi[i] = (int)(Math.random() * aralik);
        }
        System.out.println("\nAritmetik ortalamasi alinacak dizi:");
        for(int x : randomDizi) System.out.print(x+" ");
        System.out.println();
        System.out.println("Aritmetik Ortalama: "+ortalama(randomDizi));
        
        
        
    }

    
}
