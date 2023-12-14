package basicAlgorithm;
import java.util.Scanner;


public class stringKiyas {
    
    public static int kiyas(String ilk , String iki){
        
        return ilk.compareTo(iki);
    }
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("kiyas icin iki adet metin girin\nilk metin:");
        String ilk = scanner.nextLine();
        
        System.out.print("ikinci metin:");
        String iki = scanner.nextLine();
        
        if(kiyas(ilk,iki) < 0){
            System.out.println("alfabetik olarak "+ilk+" metni "+iki+" metninden once gelir");
        }
            
        else if(kiyas(ilk,iki) > 0){
            System.out.println("alfabetik olarak "+iki+" metni "+ilk+" metninden once gelir");    
        }
        
        else if(kiyas(ilk,iki) == 0){
            System.out.println("iki metinde aynidir");
        }
    }
    
}
