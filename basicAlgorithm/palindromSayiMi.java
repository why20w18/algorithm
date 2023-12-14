package basicAlgorithm;
import java.util.Scanner;


public class palindromSayiMi {
    
    public static boolean palindromMu(int sayi){
        int ters = 0,rakam = 0 , sayi2 = sayi;
        for(;sayi > 0;){
            rakam = sayi % 10;
            ters = ters * 10 + rakam;
            sayi /= 10;
        }
        if(sayi2 == ters){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Sayiyi girin:");
        int sayi = scanner.nextInt();
        
        String sonuc = (palindromMu(sayi))? "palindrom sayidir" : "palindrom DEGILDIR !";
        System.out.println(sonuc);
    }

    
}
