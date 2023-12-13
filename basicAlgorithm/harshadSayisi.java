package basicAlgorithm;
import java.util.Scanner;

public class harshadSayisi {
    
    public static int rakamToplami(int sayi){
        
        int rakamToplam = 0;
        while(sayi > 0){
            rakamToplam += sayi % 10;
            sayi /= 10;
        }
        return rakamToplam;
    }
    
    public static int bolmeIslemi(int sayi){
        int kalan = sayi % rakamToplami(sayi);
        return kalan;
    }
    
    public static boolean sonuc(int sayi){
        boolean sonuc = (bolmeIslemi(sayi) == 0) ? true : false;
        return sonuc;
    }
    
    public static void main(String[] args) {
        
    Scanner scanner = new Scanner(System.in);
        
        System.out.print("\nornek:153 % 9 = 0\nSayi girin:");
        int sayi = scanner.nextInt();
        if(sonuc(sayi)){
            System.out.println("harshad sayisidir !");
        }
        else
            System.out.println("harshad degildir !");
        
    }
    
}
