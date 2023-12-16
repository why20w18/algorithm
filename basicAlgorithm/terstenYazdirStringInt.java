package basicAlgorithm;
import java.util.Scanner;

public class terstenYazdirStringInt {
   
    public static char[] ters(String metin){
        
        //StringBuilder sb = new StringBuilder();
        char[] tut = new char[metin.length()];
        for(int j=0,i = metin.length()-1 ; i >= 0; i-- , j++){
            tut[j] = metin.charAt(i);
            //sb.append(metin.charAt(i));
            
        }
        
        return tut;
    }
    public static int ters(int sayi){
        int ters = 0;
        while(sayi > 0){
            int rakam = sayi % 10;
            ters = ters * 10 + rakam;
            sayi /= 10;
        }
        
        return ters;
    }
    
   public static void main(String[] args) {
    
       Scanner scanner = new Scanner(System.in);
       
       System.out.println("tersten yazdirilacak ifadeyi girin:");
       
         if(scanner.hasNextInt()){
           int sayi = scanner.nextInt();
           System.out.println("sayi blok");
             System.out.println(ters(sayi));
         }
         else if(scanner.hasNextLine()){
           String metin = scanner.nextLine();
           System.out.println("metin blok");
             System.out.println(ters(metin));
       }
     
       
       
       
    }
}
