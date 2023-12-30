package OOP.AbstractDataBase.abstractPratik;


public class BilgisayarMuhendisi extends Info{
    
    private String bildigiProgramlamaDilleri;
    
    public BilgisayarMuhendisi(String isim, String sonCalistigiKonum, double maas,String bildigiProgramlamaDilleri) {
        super(isim, sonCalistigiKonum, maas);
        this.bildigiProgramlamaDilleri = bildigiProgramlamaDilleri;
    }

    @Override
    void showInfo() {
          System.out.println("Isim: "+isim+"\n"
                + "Maas: "+maas+"\n"
                        + "Son Calistigi Yer: "+sonCalistigiKonum+"\n"
                                + "Bilgisayar Muhendisinin Bildigi Diller: "+bildigiProgramlamaDilleri);
        
        
    }
    
    
    @Override
    public void dusuncesi(){
        System.out.println("Sevinmedim !");   
    }

 

    
}
