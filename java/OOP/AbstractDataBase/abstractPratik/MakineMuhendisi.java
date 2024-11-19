package OOP.AbstractDataBase.abstractPratik;


public class MakineMuhendisi extends Info{
    
    private boolean sicilKaydi;
    
    public MakineMuhendisi(String isim, String sonCalistigiKonum, double maas , boolean sicilKaydi) {
        super(isim, sonCalistigiKonum, maas);
        this.sicilKaydi = sicilKaydi;
    }

    @Override
    void showInfo() {
         
        System.out.println("Isim: "+isim+"\n"
                + "Maas: "+maas+"\n"
                        + "Son Calistigi Yer: "+sonCalistigiKonum+"\n"
                                + "Sicil Kaydi: "+sicilKaydi);
    }

  
}
