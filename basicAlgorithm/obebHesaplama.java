package basicAlgorithm;
import java.util.Scanner;

public class obebHesaplama {
    
    public static int obeb(int sayi1 , int sayi2){
        
        int sonuc = 0;
        
        int maxSayi = (sayi1 < sayi2) ? sayi2 : sayi1;
        
        for(int i = 2 ; i < maxSayi ; i++){
            
            if(sayi1 % i == 0 && sayi2 % i == 0){
                sonuc = i;
            }
        }
        if(sonuc == 0){
            return 1;
        }
        return sonuc;
    }
    
    public static void main(String[] args) {
     
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("ilk sayi:");
        int say1 = scanner.nextInt();
        
        System.out.print("ikinci sayi:");
        int say2 = scanner.nextInt();
        
        System.out.printf("\nEBOB(%d,%d) = %d\n",say1,say2,obeb(say1, say2));
    }
    
}
