package basicAlgorithm;
import java.util.Scanner;

public class asalPrimeNum {
    
    public static boolean asalMi(int sayi){
   
    for(int i = 2 ; i < sayi ; i++){
        
        if(sayi % i == 0){
            return false;
        }
    }   
        return true;
    }
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("ASAL KONTROL\nsayi girin:");
        int sayi = scanner.nextInt();
        if(sayi < 2){ //eger negatifse  ve 2'den kucukse asal degildir
            System.out.printf("\n%d asal degildir\n",sayi);

        }
        else if(asalMi(sayi)){
            System.out.printf("\n%d asaldir !\n",sayi);
        }
        else{
            System.out.printf("\n%d asal degildir\n",sayi);
        }
    }
    
}
