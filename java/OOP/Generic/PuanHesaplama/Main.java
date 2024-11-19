package OOP.Generic.PuanHesaplama;

public class Main {
    
    public static void main(String[] args) {
        
        Sayisal ogrenci1 = new Sayisal(30, 30, 15, 20);
        Sayisal ogrenci2 = new Sayisal(40, 40, 20, 20);
        EsitAgirlik ogrenci3 = new EsitAgirlik(40, 25, 20, 5);
        
        //Puan Kiyas
        
        Main nesne1 = new Main();
        System.out.println("Birincinin Puani: "+nesne1.sayisalBirinci(ogrenci1, ogrenci2).puanHesapla());
        
        System.out.println("Birincinin Puani: "+nesne1.tumAlanlarBirinci(ogrenci3, ogrenci1).puanHesapla());
    }
    
    //Sayisal 2 ogrenciyi hesaplama
    public Sayisal sayisalBirinci(Sayisal o1 , Sayisal o2){
        if(o1.puanHesapla() < o2.puanHesapla())
            return o2;
        else
            return o1;
      }
    
    public <E extends  Aday> E tumAlanlarBirinci(E e1 , E e2){
       E e3 = (e1.puanHesapla() < e2.puanHesapla()) ? e2: e1;
       return e3;
    }
    
    
}
