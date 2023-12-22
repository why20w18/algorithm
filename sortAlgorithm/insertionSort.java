package sortAlgorithm;

public class insertionSort {

    
    public static int [] insertion(int dizi[]){
        
        for(int i = 1 ; i < dizi.length ; i++){ //ilk eleman zaten 1 tane siralidir
            int indexEleman = dizi[i];
            int j = i -1;
            //i sýfýrdan baþlayamaz
            while(j >= 0 && dizi[j] > indexEleman){ //subkume icinde kontrol mekanizmasi
                dizi[j+1] = dizi[j];
                //System.out.println("1"); sonsuz dongu kontrolu
                j--;
            }
            dizi[j+1] = indexEleman; //son yerlestirme
        }
        
        return dizi;
    }

    public static void main(String[] args) {
        
        int[] dizi = {8,78,54,11,42,13,37,4,7};
        
        int sonuc[] = insertion(dizi);
        
        for(int x : sonuc){
            System.out.print(x+" ");
        }

    }

}