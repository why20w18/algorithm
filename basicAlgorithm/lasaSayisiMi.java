package basicAlgorithm;
import java.util.Scanner;


public class lasaSayisiMi {
    
    public static int tersCevir(int sayi){
        int ters = 0,rakam = 0;
        
        for(;sayi > 0;){
            //17
            //7
            //1 gelecek 7 sola kaysin
            //70+1 = 71
            rakam = sayi % 10;
            ters = ters * 10 + rakam;
            sayi /= 10;
            
        }
        return ters;
    }
    
    public static boolean asalMi(int sayi){
        
        for(int i = 2 ; i < sayi ; i++){
        
            if(sayi % i == 0){
             return false;
            }
        }
        return true;
    }
    
    public static boolean sonuc(int sayi){
        //girilen deger asal mi
        if(asalMi(sayi)){
            
            return asalMi(tersCevir(sayi));
        }
        else{
            return false;
        }
        
    }
    
    
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Sayi girin: ");
        int sayi = scanner.nextInt();
        
        String sonuc = (sonuc(sayi)) ? "lasa sayisidir" : "lasa sayisi degildir";
        
        System.out.println(sonuc);
        
    }
    
}
