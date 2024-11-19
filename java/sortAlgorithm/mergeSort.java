package sortAlgorithm;

public class mergeSort {
    
    //2 alt diziyi birlestiren metod
    
    public static void birlestirenMetod(int [] dizi , int sol , int sag , int orta){
        
        //alt dizilerin boyutunu ayarla
        int subDizi1Boyut = orta - sol +1; //terim sayisi ORTAyi buraya ekledik
        int subDizi2Boyut = sag - orta;
        
        //alt dizileri olusturma
        int[] s1 = new int[subDizi1Boyut];
        int[] s2 = new int[subDizi2Boyut];
        
        //alt dizileri kullan
        for(int i = 0 ; i < subDizi1Boyut ; i++)
            s1[i] = dizi[i+sol];
        
        for(int j = 0 ; j < subDizi2Boyut ; j++)
            s2[j] = dizi[orta+1+j]; //orta dahil olmasin diye +1 ekledik
        
        
        //iki alt diziyide birlestir
        int i = 0 , j = 0 , k = sol;
        
        while(i < subDizi1Boyut && j < subDizi2Boyut){
            
            if(s1[i] <= s2[j]){
                dizi[k] = s1[i];
                i++;
            }
            else{
                dizi[k] = s2[j];
                j++;
            }
            k++;
        }
        
        //farkli olasiliklar beraber aldiklarimizi ayri aliriz hicbir sarta uymayip alt dizide kalan varsa
        while(i < subDizi1Boyut){
        dizi[k] = s1[i];
        i++;
        k++;
        }
            
       while(j < subDizi2Boyut){
           dizi[k] = s2[j];
           j++;
           k++;
       }
       
    }
    
    public static void mergeSort(int[] dizi , int sol , int sag){
        if(sol < sag){ //recursive
            
            int orta = (sol+sag)/2;
            
            //ilk yari
            mergeSort(dizi, sol, orta);
            //ikinci yari
            mergeSort(dizi, orta+1, sag);
            
            
            birlestirenMetod(dizi, sol, sag, orta);
        }
    }
    
    public static void main(String[] args) {
        
        int[] dizi = new int[]{1,7,5,9,87,14,2,8,21};
        
        mergeSort(dizi, 0, dizi.length-1);
        
        for(int i : dizi)
            System.out.print(i+" ");
        
    }
}