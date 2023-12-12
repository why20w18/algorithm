package basicAlgorithm;
import java.util.Scanner;


public class fibonacci {
    // 0 1 1 2 3 5 8 13 ...
    public static int fibonacci(int terim){
        
        int ilk = 0 , ikinci = 1 , sonraki = 1;
        
        for(int i = 0 ; i < terim ; i++){
           
            sonraki = ilk + ikinci;
            ilk = ikinci;
            ikinci = sonraki;
            System.out.print(sonraki+" ");
        }
        System.out.printf("\n%d terim : ",terim);
        return sonraki;
    }
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("hangi terime kadar fibonacci yazdirilsin: ");
        int terim = scanner.nextInt();
        System.out.print("0 1 ");
        System.out.print(fibonacci(terim-2));
        System.out.println();
    }
    
}
