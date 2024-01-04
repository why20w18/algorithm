package sortAlgorithm;

public class insertionSort1Loop {
    
    
    public static int[] siralamaYap(int[] dizi){
        int N = dizi.length;
        
     
        for(int i = 1 ; i < N ; i++){

            if(dizi[i]<dizi[i-1]){
               int temp = dizi[i];
               dizi[i] = dizi[i-1];
               dizi[i-1] = temp;
               i = 0; //donguyu her seferinde basa sariyorum i=1 olarak girmesi icin yaptim
            }
        }
        return dizi;
    }
    
    public static void main(String[] args) {
        
        int[] dizi=new int[]{7,3,5,8,2,9,4,15,6,11,78,65,1,3};
        
        System.out.println("SIRALANMADAN ONCE");
        for(int i : dizi)
            System.out.print(i+" ");
        
        
        int[] sonuc = siralamaYap(dizi);
        System.out.println("\nSIRALAMADAN SONRA");
        for(int i : sonuc)
            System.out.print(i+" ");
        
    }
    
}
