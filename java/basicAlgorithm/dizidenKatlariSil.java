package basicAlgorithm;
// random dizi olustur 6 ve katlarini sil

public class dizidenKatlariSil {
    
    public static int[] altiKatSil(int[] dizi){
        
        for(int i = 0 ; i < dizi.length ; i++){
            
            if(dizi[i] % 2 == 0 && dizi[i] % 3 == 0){
                dizi[i] = -1;
            }
        }
        return dizi;
    }
    
    public static void main(String[] args) {
        
        int randomDizi[] = new int[10];
        for(int i = 0 ; i < randomDizi.length ; i++)
            randomDizi[i] = (int) (Math.random() * 100);
        for(int x : randomDizi) System.out.print(x+" ");
        
        int[] sonuc = altiKatSil(randomDizi);
        System.out.println("\nAlti ve katlarinin silindigi yeni dizi:");
        
        for(int x : sonuc) System.out.print(x+" ");
    }

    
}
