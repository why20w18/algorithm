package basicAlgorithm;
import java.util.Random;
import java.util.Scanner;


public class sayiTahminOyunu {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("0 ile hangi sayi arasinda bir sayi tutulsun:");
        int aralik = scanner.nextInt();
        int tahmin = 0;
        Random rand = new Random(); //girilen degerde tutulabilsin
        int makineTuttu = rand.nextInt(aralik+1);
        
        System.out.printf("Makine: sifirla %d arasinda bir sayi tuttum\nhadi tahmin et: ",aralik);

        while( makineTuttu != tahmin){
            
             tahmin = scanner.nextInt();
            
            if(tahmin > makineTuttu){
                System.out.println("Makine: tahminin yuksek oldu :(");
            }
            else if(tahmin < makineTuttu){
                System.out.println("Makine: tahminin dusuk oldu :(");
            }
            else if(tahmin == makineTuttu){
                System.out.printf("Makine: nokta atisi dogru tahmin :)\ntuttugum sayi:%d\ntahmin ettigin sayi:%d\n",makineTuttu,tahmin);
            }
        }
        
    }
}
