package basicAlgorithm;
import java.util.Scanner;

public class ucgenSayiMi {
    
    public static int[] ucgenMi(int sayi){
        
        int i,ikiKat = 2 * sayi;
        
        for( i = 1 ; i < ikiKat ; i++){
             
            if((i * (i+1)) == ikiKat){
                System.out.printf("%d sayisi ucgen sayidir\n1'den %d'ye kadar"
                        + " olan sayilarin toplamidir\n",sayi,i);
                return new int[] {i,(i+1)};
            }
            
        }
        System.out.printf("%d sayisi UCGEN sayi DEGILDIR !",sayi);
        return new int[] {1};
    }
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sayi girin:");
        int sayi = scanner.nextInt();
        
        ucgenMi(sayi);
    }
    
}
