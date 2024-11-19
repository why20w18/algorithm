package OOP.Polymorphism_KrediBanka;


public class Main {
    
    public static void main(String[] args) {
        
        krediCokluHesapla(new OgretmenKrediManager()); 
        krediCokluHesapla(new PolisKrediManager());
        krediCokluHesapla(new CiftciKrediManager());
    
    }
    
    public static void krediCokluHesapla(BaseKrediManager baseKrediManager){
        baseKrediManager.krediHesapla();
    }
    
}
