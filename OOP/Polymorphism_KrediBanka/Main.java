package OOP.Polymorphism_KrediBanka;


public class Main {
    
    public static void main(String[] args) {
        
        krediCokluHesapla(new OgretmenKrediManager()); //olceklenebilir degil
        
        
    }
    
    public static void krediCokluHesapla(OgretmenKrediManager ogretmenKrediManager){
        ogretmenKrediManager.krediHesapla();
    }
    
}
