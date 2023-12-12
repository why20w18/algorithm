package basicAlgorithm;
import java.util.Scanner;

public class diziMaxEleman {
    
    public static int[] randomDiziUret(int[] dizi){
        
        for(int i = 0 ; i < dizi.length ; i++){
            dizi[i] = (int)(Math.random() * 24);//max:23 min:0
        }
        
        return dizi;
    }
    
    public static void main(String[] args) {
     
        int[] bosDizi = new int[10];
        int doluDizi[] = randomDiziUret(bosDizi);
        
        
        System.out.println("Random olusturulan dizi:");
        for(int x : doluDizi ){
            System.out.print(x+" ");
        }
        
        int max = doluDizi[0];
        for(int i = 0 ; i < doluDizi.length ; i++){
            
            if(max < doluDizi[i])
                max = doluDizi[i];
        }
        System.out.println("\nMax Deger : "+max);
    }        
}
