package sortAlgorithm;

import java.util.Scanner;


public class bubleSort1 {

    public static int [] buble(int [] dizi){
        int temp = 0;
        for(int i = 0 ; i < dizi.length-1 ; i++){
            
            for(int j = 0 ; j < dizi.length-1-i ; j++){
                
                if(dizi[j] > dizi[j+1]){
                    temp = dizi[j];
                    dizi[j] = dizi[j+1];
                    dizi[j+1] = temp;
                }
            }
        }
        
        
        return dizi;
    }
    
    
    public static void main(String[] args) {
        
         Scanner scanner = new Scanner(System.in);
        
        System.out.print("Kac terimli random dizi olusturulsun :");
        int terim = scanner.nextInt();
        
        int[] dizi = new int[terim];
        for(int i = 0 ; i < terim ; i++) dizi[i] = (int) (Math.random() * 56);
        
        System.out.println("RASTGELE DIZI");
        for(int i : dizi) System.out.print(i+" ");
        
        System.out.println("\nSIRALANMIS DIZI");
        int[] sonuc = buble(dizi);
        
        for(int j : sonuc) System.out.print(j+" ");
        
    }
    
}
