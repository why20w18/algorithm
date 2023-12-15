package basicAlgorithm;
import java.util.Scanner;


public class uzunCarpUzunBol {
    
    public static int uzunIslem(int secim , int say1 , int say2){
    int toplam = 0;
        switch(secim){
            case 1 -> {
                while(say2 != 0){
                    toplam += say1;
                    say2--;
                    
                }
            }
            case 2 -> {
                //min max
                while(say2 >= say1){
                toplam++;
                say2 -= say1;

                }
            }
            default -> {
            }
                
        }
        return toplam;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Secim yapin:"
                + "\n1-Carpma"
                + "\n2-Bolme\n"
                + ":");
        int secim = scanner.nextInt();
        
        System.out.print("Sayi girin:");
        int say1 = scanner.nextInt();
        
        System.out.print("Sayi girin:");
        int say2 = scanner.nextInt();
    
        if(secim == 1){
            System.out.println(uzunIslem(secim, say1, say2));
        }
        else if(secim == 2){
            System.out.println(uzunIslem(secim, say1, say2));
        }
    
    }
    
}
