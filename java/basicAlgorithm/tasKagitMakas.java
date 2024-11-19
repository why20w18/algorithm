package basicAlgorithm;

import java.util.Random;
import java.util.Scanner;

public class tasKagitMakas{
    
    public static String makineSec(){
        
        String[] hareketler = {"TAS" , "KAGIT" , "MAKAS"};
        Random rand = new Random();
        String sec = hareketler[rand.nextInt(hareketler.length)];
        
        return sec;
    }
    
    
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int oyuncuHak = 3;
        int makineHak = 3;
        
        while(oyuncuHak != 0 && makineHak != 0){
            String makineSecti = makineSec();
            
            System.out.print("Tas Kagit veya Makas secin >>>>>");
            String oyuncuSecti = scanner.nextLine().toLowerCase();
            
            if(makineSecti.toLowerCase().equals(oyuncuSecti)){
                System.out.print("Makine secti: "+makineSecti+"\n");
                System.out.println("Berabere !");
            }
            else if(
                      (oyuncuSecti.equals("tas")) && (makineSecti.equals("MAKAS"))
                    ||(oyuncuSecti.equals("kagit")) && (makineSecti.equals("TAS"))
                    ||(oyuncuSecti.equals("makas")) && (makineSecti.equals("KAGIT"))
                    
                    ){
                makineHak--;
                System.out.print("Makine secti: "+makineSecti+"\n");
                System.out.println("KAZANDIN !\nkalan hakkin:"+oyuncuHak+"\nmakine kalan hak:"+makineHak);
                
            }
            else {
                oyuncuHak--;
                System.out.print("Makine secti: "+makineSecti+"\n");
                System.out.println("KAYBETTIN !\nkalan hakkin:"+oyuncuHak+"\nmakine kalan hak:"+makineHak);
            }
        }
        
        String sonuc = (oyuncuHak == 0) ? "KAYBETTIN ! Makine kazandi":"KAZANDIN ! Makine kaybetti";
        System.out.println(sonuc);
        
        
    }
}




