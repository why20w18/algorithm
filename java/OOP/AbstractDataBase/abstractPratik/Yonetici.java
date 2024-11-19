package OOP.AbstractDataBase.abstractPratik;


public class Yonetici extends Info{
    
    private int sorumluOlduguKisiSayisi;
    
    public Yonetici(String isim, String sonCalistigiKonum, double maas , int sorumluOlduguKisiSayisi) {
        super(isim, sonCalistigiKonum, maas);
        this.sorumluOlduguKisiSayisi = sorumluOlduguKisiSayisi;
    }

    @Override
    void showInfo() {
        
        System.out.println("Isim: "+isim+"\n"
                + "Maas: "+maas+"\n"
                        + "Son Calistigi Yer: "+sonCalistigiKonum+"\n"
                                + "Yoneticinin Sorumlu Oldugu Kisi Sayisi: "+sorumluOlduguKisiSayisi);
        
    }
    
    @Override
    public void dusuncesi(){
        super.dusuncesi();
    }

   
    
}
