package sortAlgorithm;

import java.util.Scanner;



public class selectionSort {
    
    public static int [] select(int dizi[]){
        
        for(int i = 0 ; i < dizi.length-1 ; i++){
            int mIndex = i;
            
            for(int j = i+1 ; j < dizi.length ; j++){
                
                if(dizi[mIndex] > dizi[j]){
                    mIndex = j;
                }
            
            }
            int temp = dizi[i];
            dizi[i] = dizi[mIndex];
            dizi[mIndex] = temp;
        }
        return dizi;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Kac elemanli bir dizi uretilsin: ");
        int n = scanner.nextInt();
        
        int dizi[] = new int[n];
        for(int i = 0 ; i < n ; i++) dizi[i] = (int) (Math.random() * 32);
        
        System.out.println("RASTGELE OLUSTURULMUS DIZI:");
        for(int i : dizi) System.out.print(i+" ");
        
        int sort[] = select(dizi);
        
        System.out.println("\nSELECTION SORT");
        for(int j : sort) System.out.print(j+" ");
        
        
    }
    
}
