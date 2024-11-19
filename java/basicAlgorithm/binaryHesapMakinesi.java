package basicAlgorithm;
import java.util.Scanner;

public class binaryHesapMakinesi {
    
    public static int binaryToDecimal(int binary){
        
        int on1 = 0;
        int i = 0;
        while(binary > 0){
            int kalan = binary % 10;
            on1 += kalan * kuvvetAl(2, i);
            i++;
            binary /= 10;
        }
        return on1;
        
    }
    
    public static int kuvvetAl(int taban , int kuvvet){
        
        if(kuvvet == 0){
            return 1;
        }
        return taban * kuvvetAl(taban, kuvvet-1);
    }
    
    public static int hesaplama(int say1 , int say2 , int secim){
        
        switch(secim){
            
            case 1: return say1+say2;
            case 2: return say1-say2;
            case 3: return say1*say2;
             
        }
        return -1;
    }
    
    public static String decimalToBinary(int islemSonucu){
        StringBuilder sb = new StringBuilder();
        
        while(islemSonucu > 0){
            int kalan = islemSonucu % 2;
            sb.insert(0,kalan);
            islemSonucu /= 2;
            
        }
        return sb.toString();
    }
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Yapacaginiz islemi girin:"
                + "\n1-toplama"
                + "\n2-cikarma"
                + "\n3-carpma\n:");
        int secim = scanner.nextInt();
        
        System.out.print("ilk binary sayiyi girin:");
        int binaryIlk = scanner.nextInt();
        int decimalIlk = binaryToDecimal(binaryIlk);
        System.out.println("decimal:"+binaryToDecimal(binaryIlk)+"\n");
        
        System.out.print("ikinci binary sayiyi girin:");
        int binaryIki = scanner.nextInt();
        int decimalIki = binaryToDecimal(binaryIki);
        System.out.println("decimal:"+binaryToDecimal(binaryIki)+"\n");
        
        System.out.println("Sonuc:"+decimalToBinary(hesaplama(decimalIlk, decimalIki, secim)));
        
    
    }
    
}
