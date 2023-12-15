package basicAlgorithm;
import java.util.Scanner;


public class esitsizlikHesapla {

    
    public static void cozucu(int secim, int a , int b , int c ,int d){
    
        switch (secim) {
            case 1:{
                System.out.printf("Sonuc:\n%d < X+Y < %d",(a+c),(b+d));
                System.out.println("\nX+Y'nin alabilecegi degerler:");
                int cx = 0;
                for(int i = a+c+1 ; i < b+d ; i++){
                    System.out.print(i+" ");
                    cx++;
                }
                System.out.println("\nalabilecegi deger sayisi: "+cx);
                break;
            }
            
            case 2:{//cikartma yon degisimi
                System.out.printf("Sonuc:\n%d < X-Y < %d",(a-d),(b-c));
                System.out.println("\nX-Y'nin alabilecegi degerler:");
                int cx = 0;
                for(int i = a-d+1 ; i < b-c ; i++){
                    System.out.print(i+" ");
                    cx++;
                }
                System.out.println("\nalabilecegi deger sayisi: "+cx);
                break;
            }
            case 3:{
                 //System.out.println("a < X < b");
                 //System.out.println("c < Y < d");
                 
                 int sonuc[] = {(a*c),(a*d),(b*d),(b*c)};
                 
                 int max = sonuc[0];
                 int min = sonuc[0];
                 
                 for(int i = 0 ; i < 4 ; i++){
                     if(max < sonuc[i]){
                         max = sonuc[i];
                     }
                         if(min > sonuc[i]){
                         min = sonuc[i];
                 }
                                      
               }
                System.out.printf("Sonuc:\n%d < X*Y < %d",min,max);
                System.out.println("\nX*Y'nin alabilecegi degerler:");
                int cx = 0;
                for(int i = min+1 ; i < max ; i++){
                    System.out.print(i+" ");
                    cx++;
                }
                System.out.println("\nalabilecegi deger sayisi: "+cx);
                
                break;
            }
            
            default:{
                
                break;
            }
               
        }
        
        
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("a < X < b");
        System.out.println("c < Y < d");
        System.out.println("X ve Y degeri hangi araliktadir:");
        
        System.out.print("a = ");
        int a = scanner.nextInt();
        
        System.out.print("b = ");
        int b = scanner.nextInt();
        
        System.out.print("c = ");
        int c = scanner.nextInt();
        
        System.out.print("d = ");
        int d = scanner.nextInt();
        
        System.out.printf("%d < X < %d\n",a,b);
        System.out.printf("%d < Y < %d\n",c,d);
       
        System.out.print("\nIslem secin:"
                + "\n1-toplama"
                + "\n2-cikarma"
                + "\n3-carpma\nSecimiiniz:");
        int secim = scanner.nextInt();
        cozucu(secim, a, b, c, d);
        
        
    }
    
}
