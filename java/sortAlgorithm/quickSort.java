package sortAlgorithm;


public class quickSort{
    
    
    public static int AltaKumelereBol(int[] dizi , int minIndex , int maxIndex){
        
        //pivotu ata
        int pivot = dizi[maxIndex];
        int i = minIndex;
        
        //pivota gore siralama yapma
        for(int j = minIndex ; j < maxIndex ; j++){
            
            if(dizi[j] <= pivot){
            int temp = dizi[j];
            dizi[j] = dizi[i];
            dizi[i] = temp;
            i++;
            }
        }
        //pivotu konumuna yerlestirme
        int temp = dizi[maxIndex];
        dizi[maxIndex] = dizi[i];
        dizi[i] = temp;
        
        return i; //pivot indexi geri cevir
    }
    
    public static void quick(int[] dizi , int minIndex , int maxIndex){
        if(minIndex < maxIndex){ //recursive
            
            int pivotIndex = AltaKumelereBol(dizi, minIndex, maxIndex);
            quick(dizi, minIndex, pivotIndex-1);
            quick(dizi, pivotIndex+1, maxIndex);
        }
    }
    
    public static void main(String[] args) {
        
        System.out.println("SIRALANMAMIS DIZI");
        int[] dizi = new int[]{10, 7, 8, 9, 1, 5};
        
        for(int i : dizi)
            System.out.print(i+" ");
        
        quick(dizi, 0, dizi.length-1);
        
        System.out.println("\nQUICK SORT ILE SIRALANMIS DIZI");
        for(int i : dizi)
            System.out.print(i+" ");
        
        
    }
}
