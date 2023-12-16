package basicAlgorithm;
import java.util.Scanner;



public class karmasikSayiMain {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("karmasik sayi girin:");
        String sayBir = scanner.nextLine();
        
        System.out.print("karmasik sayi girin:");
        String sayIki = scanner.nextLine();
        
        karmasikSayi say1 = new  karmasikSayi(sayBir);
        karmasikSayi say2 = new  karmasikSayi(sayIki);
        
        hesaplama hesapla = new hesaplama(sayBir, sayIki);
        
        hesapla.topla().ekran();
        
    }
}

class karmasikSayi{
    private double reel;
    private double sanal;
    
    public karmasikSayi(double reel , double sanal){
        this.reel =  reel;
        this.sanal = sanal;
    }
    //Mainde alinan stringi buraya gonderecegim
    public karmasikSayi(String karmasikSayiButun){
        String karmasikSayi[] = karmasikSayiButun.split("[+\\-\\*\\/]");
        this.reel  = Double.parseDouble(karmasikSayi[0]);
        this.sanal = Double.parseDouble(karmasikSayi[1].substring(0, karmasikSayi.length-1));  
    }

    public double getReel() {
        return reel;
    }

    public double getSanal() {
        return sanal;
    }
    
    void ekran(){
        System.out.printf(getReel()+" + "+getSanal()+"i");
        
    }
    
}


class hesaplama{
    
    private karmasikSayi say1;
    private karmasikSayi say2;
    
    public hesaplama(String say1 , String say2){
        this.say1 = new karmasikSayi(say1);
        this.say2 = new karmasikSayi(say2);
        
    }
    
    public karmasikSayi topla(){
        
        double reel = say1.getReel() + say2.getReel();
        double sanal = say1.getSanal() + say2.getSanal();
        
        return new karmasikSayi(reel, sanal);
    }
    
    public karmasikSayi cikartma(){
        double reel = say1.getReel() - say2.getReel();
        double sanal = say1.getSanal() - say2.getSanal();
        
        return new karmasikSayi(reel, sanal);
        
    }
    
    
    
}