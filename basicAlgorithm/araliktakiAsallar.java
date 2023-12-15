package basicAlgorithm;
import java.util.Scanner;

public class araliktakiAsallar {
    
    public static void asalBul(int x, int y) {
     int min = (x < y) ? x : y;
     int max = (x < y) ? y : x;

    System.out.println("Araliktaki asal sayilar:");
    for (int i = min; i <= max; i++) {
        if (asalMi(i)) {
            System.out.println(i);
        }
    }
}

public static boolean asalMi(int sayi) {
    if (sayi < 2) {
        return false;
    }
    for (int j = 2; j <= Math.sqrt(sayi); j++) {
        if (sayi % j == 0) {
            return false;
        }
    }
    return true;
}

    
    
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Aralik girin:");
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        
        asalBul(x,y);
        
        
    }
    
}
