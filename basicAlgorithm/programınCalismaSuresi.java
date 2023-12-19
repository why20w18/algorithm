package basicAlgorithm;
import java.util.Scanner;


public class programýnCalismaSuresi {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        long baslangic = System.currentTimeMillis();
        
        System.out.print("Adiniz:");
        String ad = scanner.nextLine();
        
        System.out.print("(orn:1978)Dogum Tarihiniz:");
        int yil = scanner.nextInt();
        
        long bitis = System.currentTimeMillis();
        long gecenSaniye = (bitis-baslangic)/1000;
        
        System.out.println("merhaba "+ad+" sen yazana kadar tam "+gecenSaniye+" saniye gecti");
    }

}
