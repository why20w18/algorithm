package basicAlgorithm;
import java.util.Scanner;

public class arrayKopyalama {
    
    public static int[] randomArray(int L){
        
        int[] array = new int[L];
        for(int i = 0 ; i < array.length ; i++) array[i] = (int) (Math.random()*80);
        
        return array;
    }
    
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Dizi uzunlugu girin:");
        int L = scanner.nextInt();
        
        int[] randomDizi = randomArray(L);
        System.out.println("Random Olusturulan Dizi:");
        for(int x : randomDizi) System.out.print(x+" ");
        
        int[] Dizi = new int[randomDizi.length];
        
        System.out.println("\nKopyalanmadan Once:");
        for(int x : Dizi) System.out.print(x+" ");
        
        
        Dizi = bosDiziyeKopyala(randomDizi);
        
        
        System.out.println("\nBos Diziye Kopyalandiktan Sonra:");
        for(int x : Dizi) System.out.print(x+" ");
        
    }
    
    public static int[] bosDiziyeKopyala(int[] randomDizi){
        int yeniDizi[] = new int[randomDizi.length];
        for(int i = 0 ; i < randomDizi.length ; i++){
            yeniDizi[i] = randomDizi[i];
        }
        return yeniDizi;
    }
    
}
