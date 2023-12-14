package basicAlgorithm;
import java.util.Scanner;


public class carpimTablosu {

    public static void tablo10(int carpim){
        
        for(int i = 1 ; i <= carpim ; i++){
            for(int j = 1 ; j <= carpim ; j++){
                System.out.printf("|%3d   x %3d = %3d  |",i,j,(i*j));
            }
            System.out.println();
        }
        
    }
    
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("hangi sayiya kadar tablo yazdirilsin:");
        int carpim = scanner.nextInt();
        tablo10(carpim);
    }
    
    
}
