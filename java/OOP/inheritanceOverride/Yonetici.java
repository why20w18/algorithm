package OOP.inheritanceOverride;



public class Yonetici extends Calisan{

    private int sorumluKisiSayisi;

    public Yonetici(int sorumluKisiSayisi, String isim, String soyIsim, String adres, long telefonNo) {
        super(isim, soyIsim, adres, telefonNo);
        this.sorumluKisiSayisi = sorumluKisiSayisi;
    }
    
    @Override
    public void showInfo(){
        super.showInfo();
        System.out.println("Yoneticinin sorumlu oldugu kisi sayisi: "+sorumluKisiSayisi);
        
    }
    
    
}
