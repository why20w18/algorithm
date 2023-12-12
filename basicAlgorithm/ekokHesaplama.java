package basicAlgorithm;
import java.util.Scanner;


public class ekokHesaplama {
    
    public static int ebob(int say1 , int say2){
        //say1*say2 = ebob * ekok
        int sonuc = 0;
        
        int max = (say2 < say1) ? say1 : say2;
        
        for(int i = 2 ; i < max ; i++){
            
            if(say1 % i == 0 && say2 % i == 0){
                sonuc = i;
            }
        }
        if(sonuc == 0){
            return 1;
        }
        
        return sonuc;
    }
    
    public static int ekok(int say1 , int say2){
        int ekok = ((say1*say2) / ebob(say1, say2));
        return ekok;
    }
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("ilk sayi:");
        int say1 = scanner.nextInt();
        
        System.out.print("ikinici sayi:");
        int say2 = scanner.nextInt();
        
        System.out.printf("\nEBOB(%d,%d) = %3d",say1,say2,ebob(say1, say2));
        System.out.printf("\nEKOK(%d,%d) = %3d\n",say1,say2,ekok(say1, say2));
        
    }
    
}
