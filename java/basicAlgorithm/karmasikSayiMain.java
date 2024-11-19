package basicAlgorithm;
import java.util.Scanner;
import java.util.regex.Pattern;

//Sanal kisim pozitif mi negatif mi ?

public class karmasikSayiMain{
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Yapacaginiz islemi secin:"
                + "\n1-Toplama\n"
                + "2-Cikartma\n"
                + "\nIslem:");
        int secim = scanner.nextInt();
        scanner.nextLine();
        System.out.print("ilk karmasik sayi:");
        String ilk = scanner.nextLine();
        
        System.out.print("ikinci karmasik sayi:");
        String iki = scanner.nextLine();
        
        hesaplamaSinif hesaplayici = new hesaplamaSinif(ilk,iki);
        
        hesaplayici.islemler(secim).ekran(secim);
        
    }
    
}


class karmasikSayi{
    private double reel;
    private double sanal;
    
    public karmasikSayi(double reel , double sanal){
       this.reel = reel;
       this.sanal = sanal;
        
    }
    public karmasikSayi(String karmasikGirdi){
        //metni reel ve sanal kisim olacak sekilde bolmeliyim
        String girdiBolunmus[] = karmasikGirdi.split("[+\\-]");
        //+ - gordugu yerden bolecek
        //bolunen kisimlari ata
        
        this.reel = Double.valueOf(girdiBolunmus[0]);
        this.sanal = Double.valueOf(girdiBolunmus[1].substring(0, girdiBolunmus[1].length()-1));
        
    }

    public double getReel() {
        return reel;
    }

    public double getSanal() {
        return sanal;
    }
    
   void ekran(int secim) {
        switch (secim) {
            case 1 -> {
                System.out.print(getReel());
                if (getSanal() > 0) {
                    System.out.println("+" + getSanal() + "i");
                } else if (getSanal() < 0) {
                    System.out.println("-"+getSanal() + "i");
                }
            }
            case 2 -> {
                System.out.print(getReel());
                if (getSanal() > 0) {
                    System.out.println("+" + getSanal() + "i");
                } else if (getSanal() < 0) {
                    System.out.println(getSanal() + "i");
                }
            }
            default -> System.out.print("");
        }
}
// 4 3
   //2 -6
    
}

class hesaplamaSinif{
    
    private karmasikSayi sayi1;
    private karmasikSayi sayi2;
    
    public hesaplamaSinif(String sayi1 , String sayi2){
        
        this.sayi1 = new karmasikSayi(sayi1);
        this.sayi2 = new karmasikSayi(sayi2);
        
    }
    
    karmasikSayi islemler(int secim){
        
        switch(secim){
            
            case 1->{
                if(sayi1.getSanal() > 0 && sayi2.getSanal() > 0){
                    
                double reel = sayi1.getReel() + sayi2.getReel();
                double sanal = sayi1.getSanal() + sayi2.getSanal();
                return new karmasikSayi(reel, sanal);
                }
                
                
               
                
            }    
            case 2->{
                double reel = sayi1.getReel()-sayi2.getReel();
                double sanal = sayi1.getSanal()-sayi2.getSanal();
                return new karmasikSayi(reel, sanal);
            }
                
           default->{
               System.out.println("sadece 1 veya 2 girebilirsin !");
               break;
           }
            
        }
        return new karmasikSayi(0, 0);
    }
    
    
}